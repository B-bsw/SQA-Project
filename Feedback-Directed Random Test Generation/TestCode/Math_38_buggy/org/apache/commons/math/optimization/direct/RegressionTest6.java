package org.apache.commons.math.optimization.direct;

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
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) (short) -1, (double) (-1.0f));
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray13 = new double[] { 100L, 1, 100L, 100, 100.0f, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = bOBYQAOptimizer3.optimize(1, multivariateFunction5, goalType6, doubleArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d, 1.0d, 100.0d, 100.0d, 100.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) (short) 0, (double) 100);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', 1.0E-8d, (double) 100L);
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
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#');
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        java.lang.Class<?> wildcardClass6 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4', 0.0d, (double) (-1.0f));
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ', (double) 2, 1.0d);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray16 = new double[] { 10, 1.0E-8d, (byte) 1, (-1.0d), (byte) 100, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair17 = bOBYQAOptimizer3.optimize((int) (short) 0, multivariateFunction8, goalType9, doubleArray16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, 1.0E-8d, 1.0d, (-1.0d), 100.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 10);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction4 = null;
        org.apache.commons.math.optimization.GoalType goalType5 = null;
        double[] doubleArray8 = new double[] { 'a', (byte) 10 };
        double[] doubleArray10 = new double[] { 10.0f };
        double[] doubleArray14 = new double[] { (short) -1, (-1), (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair15 = bOBYQAOptimizer1.optimize((int) (byte) 1, multivariateFunction4, goalType5, doubleArray8, doubleArray10, doubleArray14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 2");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 97.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d), (-1.0d), 0.0d }, 1.0E-15);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        java.lang.Class<?> wildcardClass5 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2, (double) 'a', (double) 10L);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (double) (-1L), 0.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass5 = realPointValuePairConvergenceChecker4.getClass();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 0.0d, (double) 10);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray8 = new double[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = bOBYQAOptimizer3.optimize(2, multivariateFunction5, goalType6, doubleArray8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        java.lang.Class<?> wildcardClass5 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        int int8 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType9 = bOBYQAOptimizer1.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = goalType9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(goalType9);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) (byte) 1, 1.0E-8d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ', (double) (-1L), (double) 0L);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1, (double) ' ', (double) 100L);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) (short) -1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 10, (double) (byte) 100, (double) 1);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', (double) (-1.0f), (double) 0L);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (double) (byte) 1, (double) 2);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 10, (double) (short) 100, (double) (short) 100);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        int int8 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) (-1.0f), (double) ' ');
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        int int8 = bOBYQAOptimizer1.getEvaluations();
        java.lang.Class<?> wildcardClass9 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) (short) 100, 100.0d);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        int int7 = bOBYQAOptimizer1.getEvaluations();
        int int8 = bOBYQAOptimizer1.getMaxEvaluations();
        int int9 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker10 = bOBYQAOptimizer1.getConvergenceChecker();
        int int11 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1, (double) 1, (double) '#');
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, 0.0d, (double) (short) 100);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 10.0d, (double) (short) 0);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass9 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) 10.0f, 0.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) 10L, (double) (short) 10);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4', (double) 1, (double) (byte) 10);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (byte) 10, (double) (byte) -1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) 0.0f, (double) (-1L));
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) (-1L), (double) (byte) 100);
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, 0.0d, (double) 1L);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = bOBYQAOptimizer3.optimize(0, multivariateFunction5, goalType6, doubleArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, 0.0d, (double) (-1L));
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
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
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 10, (double) (-1L), (double) 100);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = bOBYQAOptimizer3.optimize((int) (short) 100, multivariateFunction7, goalType8, doubleArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) (byte) 100, 0.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray11 = new double[] { (short) 1, 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = bOBYQAOptimizer1.optimize((int) (byte) 10, multivariateFunction7, goalType8, doubleArray11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        java.lang.Class<?> wildcardClass9 = realPointValuePairConvergenceChecker8.getClass();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1, (double) (short) -1, (double) (byte) 10);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 1.0E-8d, (double) '#');
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray11 = new double[] { (-1.0f), 1.0E-8d, 100 };
        double[] doubleArray12 = new double[] {};
        double[] doubleArray13 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = bOBYQAOptimizer1.optimize(1, multivariateFunction6, goalType7, doubleArray11, doubleArray12, doubleArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 0 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), 1.0E-8d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType9 = bOBYQAOptimizer1.getGoalType();
        int int10 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType11 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction13 = null;
        org.apache.commons.math.optimization.GoalType goalType14 = null;
        double[] doubleArray21 = new double[] { 10L, (byte) 10, 1, (short) 1, ' ', 1L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair22 = bOBYQAOptimizer1.optimize(0, multivariateFunction13, goalType14, doubleArray21);
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
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 10.0d, 10.0d, 1.0d, 1.0d, 32.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) (-1L), (double) 1.0f);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1, (double) (short) -1, (double) (byte) 10);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray9 = new double[] { ' ' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = bOBYQAOptimizer3.optimize(0, multivariateFunction6, goalType7, doubleArray9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 32.0d }, 1.0E-15);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1, (double) 10.0f, 100.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) 100, (double) (short) 10);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, 100.0d, (double) 100);
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
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) 100L, (double) (short) 1);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray15 = new double[] { 100L, 10, 1L, 100, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = bOBYQAOptimizer3.optimize(2, multivariateFunction8, goalType9, doubleArray15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d, 10.0d, 1.0d, 100.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction4 = null;
        org.apache.commons.math.optimization.GoalType goalType5 = null;
        double[] doubleArray6 = new double[] {};
        double[] doubleArray10 = new double[] { 100.0f, (byte) 100, (short) 100 };
        double[] doubleArray12 = new double[] { 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair13 = bOBYQAOptimizer1.optimize((int) (byte) 10, multivariateFunction4, goalType5, doubleArray6, doubleArray10, doubleArray12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 3 != 0");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) 1, (double) '4');
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass8 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) 2, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray14 = new double[] { (byte) 100, (short) -1, 'a', 0 };
        double[] doubleArray17 = new double[] { 10L, (byte) 10 };
        double[] doubleArray20 = new double[] { (-1L), 1.0E-8d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair21 = bOBYQAOptimizer1.optimize((int) '4', multivariateFunction8, goalType9, doubleArray14, doubleArray17, doubleArray20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 2 != 4");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d, (-1.0d), 97.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { (-1.0d), 1.0E-8d }, 1.0E-15);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) 1.0f, (double) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray13 = new double[] { (short) -1, (-1.0d), (short) 1 };
        double[] doubleArray14 = new double[] {};
        double[] doubleArray15 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = bOBYQAOptimizer3.optimize((int) (short) 0, multivariateFunction8, goalType9, doubleArray13, doubleArray14, doubleArray15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 0 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction4 = null;
        org.apache.commons.math.optimization.GoalType goalType5 = null;
        double[] doubleArray9 = new double[] { 10.0f, 0.0f, (short) 0 };
        double[] doubleArray15 = new double[] { 0L, (short) 0, (-1.0f), (byte) 100, (-1.0f) };
        double[] doubleArray22 = new double[] { (-1L), (-1L), 10, ' ', 10L, 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair23 = bOBYQAOptimizer1.optimize((int) '#', multivariateFunction4, goalType5, doubleArray9, doubleArray15, doubleArray22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 5 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d, 0.0d, (-1.0d), 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { (-1.0d), (-1.0d), 10.0d, 32.0d, 10.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4', (double) (short) 10, (double) (short) 0);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray11 = new double[] { (byte) -1 };
        double[] doubleArray17 = new double[] { 1, (byte) 10, (short) 100, 2, 10.0f };
        double[] doubleArray19 = new double[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair20 = bOBYQAOptimizer3.optimize((int) (byte) 100, multivariateFunction8, goalType9, doubleArray11, doubleArray17, doubleArray19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 5 != 1");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 10.0d, 100.0d, 2.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 35.0d }, 1.0E-15);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType9 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType10 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction12 = null;
        org.apache.commons.math.optimization.GoalType goalType13 = null;
        double[] doubleArray17 = new double[] { '4', 10.0d, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair18 = bOBYQAOptimizer1.optimize((int) ' ', multivariateFunction12, goalType13, doubleArray17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 52.0d, 10.0d, 32.0d }, 1.0E-15);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        java.lang.Class<?> wildcardClass7 = realPointValuePairConvergenceChecker6.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray13 = new double[] { 0L, 100, 1.0E-8d, 10.0d, (short) 10, 'a' };
        double[] doubleArray14 = null;
        double[] doubleArray20 = new double[] { (short) -1, 100.0d, 100L, '4', (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair21 = bOBYQAOptimizer1.optimize((int) (short) -1, multivariateFunction5, goalType6, doubleArray13, doubleArray14, doubleArray20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 5 != 6");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, 100.0d, 1.0E-8d, 10.0d, 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { (-1.0d), 100.0d, 100.0d, 52.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) (byte) 10, (double) 1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        int int8 = bOBYQAOptimizer1.getMaxEvaluations();
        int int9 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', (-1.0d), (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass5 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) 0.0f, (double) (byte) 10);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 10);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) 10.0f, (double) (byte) 100);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) ' ', (double) 1.0f);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray12 = new double[] { '4', 0.0f, (byte) 10, (short) 1, (byte) -1 };
        double[] doubleArray17 = new double[] { (short) 100, '4', (short) -1, 10.0d };
        double[] doubleArray21 = new double[] { (short) 100, 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair22 = bOBYQAOptimizer3.optimize((int) (short) 0, multivariateFunction5, goalType6, doubleArray12, doubleArray17, doubleArray21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 4 != 5");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 52.0d, 0.0d, 10.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d, 52.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 100.0d, 1.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType9 = bOBYQAOptimizer1.getGoalType();
        int int10 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction12 = null;
        org.apache.commons.math.optimization.GoalType goalType13 = null;
        double[] doubleArray14 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair15 = bOBYQAOptimizer1.optimize((int) 'a', multivariateFunction12, goalType13, doubleArray14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        int int8 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) 10L, (double) (short) 10);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray9 = new double[] { (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = bOBYQAOptimizer3.optimize(1, multivariateFunction6, goalType7, doubleArray9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        int int7 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, 0.0d, (double) 1L);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray7 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = bOBYQAOptimizer3.optimize(100, multivariateFunction5, goalType6, doubleArray7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (-1), (double) (short) 0);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) 1, (double) '4');
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) 0L, 1.0E-8d);
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, 0.0d, (double) (-1L));
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray9 = new double[] { 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = bOBYQAOptimizer3.optimize((int) (byte) 10, multivariateFunction6, goalType7, doubleArray9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) 100, (double) (-1L));
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, 100.0d, (double) 100);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        java.lang.Class<?> wildcardClass7 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) 0, (double) 0.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        int int8 = bOBYQAOptimizer3.getMaxEvaluations();
        int int9 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, 0.0d, 0.0d);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        int int8 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) '4', (double) ' ');
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) (short) 0, (double) (byte) 1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass5 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) '#', (double) (short) -1);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray15 = new double[] { 0.0d, (short) 10, 0.0d, 0, (byte) 10, (byte) 100 };
        double[] doubleArray17 = new double[] { 10L };
        double[] doubleArray22 = new double[] { 1, (byte) -1, (byte) 10, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair23 = bOBYQAOptimizer3.optimize((-1), multivariateFunction7, goalType8, doubleArray15, doubleArray17, doubleArray22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 6");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d, 10.0d, 0.0d, 0.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 1.0d, (-1.0d), 10.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1, (double) 10.0f, 100.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) (-1.0f), (double) ' ');
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray10 = new double[] {};
        double[] doubleArray11 = null;
        double[] doubleArray15 = new double[] { 10.0f, (byte) 10, 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = bOBYQAOptimizer3.optimize(100, multivariateFunction8, goalType9, doubleArray10, doubleArray11, doubleArray15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 3 != 0");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 10.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) 10, (double) (-1));
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) (byte) 10, (double) (-1.0f));
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) (byte) 1, 100.0d);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) (short) -1, (double) (short) -1);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray9 = new double[] { (-1.0d), 1.0E-8d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = bOBYQAOptimizer3.optimize((int) (byte) 1, multivariateFunction5, goalType6, doubleArray9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), 1.0E-8d }, 1.0E-15);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) 10L, (double) (byte) 100);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray12 = new double[] { 100L, (short) 1, 100.0f };
        double[] doubleArray13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = bOBYQAOptimizer1.optimize((int) (byte) 1, multivariateFunction6, goalType7, doubleArray8, doubleArray12, doubleArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 3 != 0");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 1.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray13 = new double[] { (byte) -1, 10L, '4', 0, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = bOBYQAOptimizer1.optimize((int) (short) 1, multivariateFunction6, goalType7, doubleArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d), 10.0d, 52.0d, 0.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (double) 'a', 1.0d);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray9 = new double[] { (short) 10, 'a' };
        double[] doubleArray10 = new double[] {};
        double[] doubleArray15 = new double[] { (-1L), 2, (-1), (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = bOBYQAOptimizer3.optimize(100, multivariateFunction5, goalType6, doubleArray9, doubleArray10, doubleArray15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 0 != 2");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d), 2.0d, (-1.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 10, (double) (short) 1, 1.0E-8d);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass6 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1, (double) (-1), (double) 10);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray9 = new double[] { (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = bOBYQAOptimizer3.optimize(0, multivariateFunction6, goalType7, doubleArray9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) (byte) 100, 1.0E-8d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
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
        int int12 = bOBYQAOptimizer1.getMaxEvaluations();
        java.lang.Class<?> wildcardClass13 = bOBYQAOptimizer1.getClass();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) (-1.0f), (double) ' ');
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray9 = new double[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = bOBYQAOptimizer3.optimize(2, multivariateFunction6, goalType7, doubleArray9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        double[] doubleArray17 = new double[] { (byte) 10, 1L, 2, 100, (byte) 0, (byte) -1 };
        double[] doubleArray21 = new double[] { '4', (byte) 0, 2 };
        double[] doubleArray25 = new double[] { (short) 0, 1L, 1L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair26 = bOBYQAOptimizer1.optimize((int) 'a', multivariateFunction9, goalType10, doubleArray17, doubleArray21, doubleArray25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 3 != 6");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 1.0d, 2.0d, 100.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 52.0d, 0.0d, 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 0.0d, 1.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) (short) 10, (double) 1);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) 1.0f, (double) (short) 0);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
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
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, 0.0d, (double) (short) -1);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray10 = new double[] { 0L, 0.0d, 1L };
        double[] doubleArray13 = new double[] { (short) 0, (short) 100 };
        double[] doubleArray16 = new double[] { (short) 100, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair17 = bOBYQAOptimizer3.optimize((int) 'a', multivariateFunction5, goalType6, doubleArray10, doubleArray13, doubleArray16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 2 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) 10, 10.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray13 = new double[] { (-1.0d), 10.0f, (short) 100, (byte) -1, 10 };
        double[] doubleArray14 = null;
        double[] doubleArray21 = new double[] { (-1), (short) 10, (-1.0d), (short) 1, 0, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair22 = bOBYQAOptimizer3.optimize((int) (short) 100, multivariateFunction6, goalType7, doubleArray13, doubleArray14, doubleArray21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 6 != 5");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d), 10.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { (-1.0d), 10.0d, (-1.0d), 1.0d, 0.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) 10.0f, 1.0E-8d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) 10L, (double) (short) 10);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        int int7 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        double[] doubleArray16 = new double[] { 'a', 10L, (byte) 100, 0.0d, 10 };
        double[] doubleArray22 = new double[] { (byte) 1, 1L, (byte) 100, 1.0d, '#' };
        double[] doubleArray28 = new double[] { 1.0d, 100.0d, 100.0f, 1L, 0L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair29 = bOBYQAOptimizer3.optimize((int) '4', multivariateFunction9, goalType10, doubleArray16, doubleArray22, doubleArray28);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (1)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 97.0d, 10.0d, 100.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 1.0d, 1.0d, 100.0d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 1.0d, 100.0d, 100.0d, 1.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (-1L), (double) (-1.0f));
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray13 = new double[] { 0.0d, 100, (byte) 100, (short) 10, (short) -1 };
        double[] doubleArray14 = null;
        double[] doubleArray17 = new double[] { (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair18 = bOBYQAOptimizer3.optimize((int) (short) 100, multivariateFunction6, goalType7, doubleArray13, doubleArray14, doubleArray17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 2 != 5");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, 100.0d, 100.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        int int7 = bOBYQAOptimizer1.getEvaluations();
        int int8 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker9 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType10 = bOBYQAOptimizer1.getGoalType();
        java.lang.Class<?> wildcardClass11 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker9);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        java.lang.Class<?> wildcardClass9 = realPointValuePairConvergenceChecker8.getClass();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer1.getGoalType();
        int int9 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker10 = bOBYQAOptimizer1.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker10);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) (short) -1, (double) (-1L));
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray14 = new double[] { 0.0d, 100.0d, 0, 0.0f, 10.0f };
        double[] doubleArray21 = new double[] { 10L, (byte) 10, 100, (short) 100, (byte) 10, '4' };
        double[] doubleArray22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair23 = bOBYQAOptimizer3.optimize(0, multivariateFunction7, goalType8, doubleArray14, doubleArray21, doubleArray22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 6 != 5");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.0d, 100.0d, 0.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 10.0d, 10.0d, 100.0d, 100.0d, 10.0d, 52.0d }, 1.0E-15);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray14 = new double[] { 2, 0.0d, (-1.0d), '4', 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair15 = bOBYQAOptimizer1.optimize((int) (short) 0, multivariateFunction7, goalType8, doubleArray14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 2.0d, 0.0d, (-1.0d), 52.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) '#', (double) (short) -1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray15 = new double[] { 10L, 1.0d, (byte) 0, (byte) 0, 10L, 2 };
        double[] doubleArray20 = new double[] { (short) 10, 2, 10L, '#' };
        double[] doubleArray26 = new double[] { ' ', (-1.0f), (-1), 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair27 = bOBYQAOptimizer3.optimize((int) (byte) 100, multivariateFunction7, goalType8, doubleArray15, doubleArray20, doubleArray26);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 4 != 6");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 1.0d, 0.0d, 0.0d, 10.0d, 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 10.0d, 2.0d, 10.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 32.0d, (-1.0d), (-1.0d), 100.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) '4', (double) 1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass6 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) 10.0f, (double) '#');
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        int int7 = bOBYQAOptimizer1.getEvaluations();
        int int8 = bOBYQAOptimizer1.getMaxEvaluations();
        int int9 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ', (double) '#', (double) 2);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass5 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) 10, (double) (short) 0);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 1.0d, (double) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 10, 1.0E-8d, (double) 1.0f);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 10, (double) 100L, (double) (byte) 10);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray8 = new double[] { 10.0d };
        double[] doubleArray14 = new double[] { (byte) -1, 0L, 1.0f, 100, 100.0f };
        double[] doubleArray20 = new double[] { (-1), 10L, (byte) 10, 10.0f, 0L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair21 = bOBYQAOptimizer3.optimize((int) (byte) 0, multivariateFunction5, goalType6, doubleArray8, doubleArray14, doubleArray20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 5 != 1");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d), 0.0d, 1.0d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { (-1.0d), 10.0d, 10.0d, 10.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) 100L, (double) (short) 1);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        int int7 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, 1.0d, (double) ' ');
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) (byte) -1, (double) 0.0f);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray11 = new double[] { (byte) 1, '#', 2 };
        double[] doubleArray18 = new double[] { 0.0f, (short) -1, 10, (short) 10, (-1.0d), 0L };
        double[] doubleArray23 = new double[] { (short) 100, 0, 100.0f, 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair24 = bOBYQAOptimizer3.optimize((int) (short) 100, multivariateFunction6, goalType7, doubleArray11, doubleArray18, doubleArray23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 6 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 35.0d, 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 0.0d, (-1.0d), 10.0d, 10.0d, (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 100.0d, 0.0d, 100.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) ' ', 1.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        double[] doubleArray16 = new double[] { 'a', (short) 0, (short) 0, (short) -1, 1.0f };
        double[] doubleArray23 = new double[] { 100.0f, 100, (short) 10, (byte) 0, 'a', 1.0f };
        double[] doubleArray24 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair25 = bOBYQAOptimizer3.optimize((int) (short) 1, multivariateFunction9, goalType10, doubleArray16, doubleArray23, doubleArray24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 6 != 5");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 97.0d, 0.0d, 0.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 100.0d, 100.0d, 10.0d, 0.0d, 97.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ', (double) 100L, (double) 100.0f);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        java.lang.Class<?> wildcardClass8 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (-1), (double) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray15 = new double[] { (-1.0d), (byte) 0, 1L, (-1.0f), 100.0f };
        double[] doubleArray19 = new double[] { (short) 1, (short) 100, (-1.0f) };
        double[] doubleArray22 = new double[] { 0.0f, 0L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair23 = bOBYQAOptimizer3.optimize(0, multivariateFunction8, goalType9, doubleArray15, doubleArray19, doubleArray22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 3 != 5");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d), 0.0d, 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 1.0d, 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        int int7 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) 0.0f, (double) 0L);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) '4', (double) (short) 1);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray8 = new double[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = bOBYQAOptimizer3.optimize((int) (short) 1, multivariateFunction5, goalType6, doubleArray8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) (short) 0, (double) 1.0f);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray9 = new double[] { 10L, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = bOBYQAOptimizer3.optimize((-1), multivariateFunction5, goalType6, doubleArray9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        int int7 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
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
        int int11 = bOBYQAOptimizer1.getEvaluations();
        int int12 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker13 = bOBYQAOptimizer1.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker13);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 10, (double) 1.0f, (double) 10);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2, (double) 0L, (double) 10L);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', (double) (short) 1, (double) 10.0f);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) 100.0f, (double) 0.0f);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass5 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) (short) -1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass5 = realPointValuePairConvergenceChecker4.getClass();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) 0.0f, (double) (byte) 0);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) 0.0f, (double) (short) 1);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ', (double) 10.0f, 100.0d);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (double) (short) 10, (double) (byte) 10);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ', (double) 10.0f, 100.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray13 = new double[] { (short) 100, 2, (short) 0, 0.0f };
        double[] doubleArray20 = new double[] { (byte) -1, (-1L), 1L, 1, 1.0E-8d, 0.0f };
        double[] doubleArray26 = new double[] { (short) 100, 1L, 100.0d, '4', 10L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair27 = bOBYQAOptimizer3.optimize((-1), multivariateFunction7, goalType8, doubleArray13, doubleArray20, doubleArray26);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 6 != 4");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d, 2.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { (-1.0d), (-1.0d), 1.0d, 1.0d, 1.0E-8d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 100.0d, 1.0d, 100.0d, 52.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) 100.0f, (double) 2);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        int int7 = bOBYQAOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass8 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) (byte) -1, (double) 'a');
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray11 = new double[] { 100.0f };
        double[] doubleArray12 = null;
        double[] doubleArray15 = new double[] { 100, 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = bOBYQAOptimizer3.optimize((int) '4', multivariateFunction8, goalType9, doubleArray11, doubleArray12, doubleArray15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 2 != 1");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) 100, 0.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass5 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', (double) (byte) -1, 1.0d);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ');
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        java.lang.Class<?> wildcardClass7 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) 1, (double) (-1L));
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) 10, 10.0d);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction4 = null;
        org.apache.commons.math.optimization.GoalType goalType5 = null;
        double[] doubleArray8 = new double[] { 1.0d, (-1L) };
        double[] doubleArray14 = new double[] { 1.0E-8d, 0.0d, (-1.0f), (byte) -1, (short) 1 };
        double[] doubleArray17 = new double[] { (byte) 100, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair18 = bOBYQAOptimizer1.optimize((int) (byte) 100, multivariateFunction4, goalType5, doubleArray8, doubleArray14, doubleArray17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 5 != 2");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1.0E-8d, 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1));
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) (-1), (double) (-1L));
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) 10, (double) 1L);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, (double) 1L, (double) (byte) 0);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 10, 100.0d, (double) 10.0f);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) 100L, (double) (short) 1);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        java.lang.Class<?> wildcardClass7 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (short) 1, (double) (short) 0);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) 1, (double) 0.0f);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1, 10.0d, (double) (-1));
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1));
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 10, (double) (short) 100, (double) (short) 100);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        double[] doubleArray16 = new double[] { 100, (short) 0, '#', 10, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair17 = bOBYQAOptimizer1.optimize((int) ' ', multivariateFunction9, goalType10, doubleArray16);
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
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d, 0.0d, 35.0d, 10.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) 10.0f, 100.0d);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray9 = new double[] { 100L, 2 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = bOBYQAOptimizer3.optimize(10, multivariateFunction5, goalType6, doubleArray9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d, 2.0d }, 1.0E-15);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) 0.0f, (double) '#');
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray10 = new double[] { 1.0E-8d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair11 = bOBYQAOptimizer3.optimize((int) (short) -1, multivariateFunction7, goalType8, doubleArray10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0E-8d }, 1.0E-15);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) (-1L), (double) (byte) 100);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2, 0.0d, 0.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass5 = realPointValuePairConvergenceChecker4.getClass();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', 100.0d, (double) 100.0f);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass5 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) 10L, (double) (short) 10);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass7 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) 10.0f, (double) (short) 100);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) (-1.0f), 10.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', 1.0E-8d, (double) 100L);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray16 = new double[] { 1.0E-8d, ' ', 10.0f, 10, (short) -1, (byte) 100 };
        double[] doubleArray20 = new double[] { (byte) 0, (short) 1, (-1) };
        double[] doubleArray26 = new double[] { 0, (byte) 10, 10L, (-1.0f), 10L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair27 = bOBYQAOptimizer3.optimize(0, multivariateFunction8, goalType9, doubleArray16, doubleArray20, doubleArray26);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 3 != 6");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 1.0E-8d, 32.0d, 10.0d, 10.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 0.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 0.0d, 10.0d, 10.0d, (-1.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) 'a', (double) 10);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray12 = new double[] { 100.0d, (byte) 0, 1L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair13 = bOBYQAOptimizer1.optimize(2, multivariateFunction7, goalType8, doubleArray12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 0.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray12 = new double[] { (-1.0d), (short) 10, 1.0E-8d, 1, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair13 = bOBYQAOptimizer1.optimize((int) (short) 0, multivariateFunction5, goalType6, doubleArray12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d), 10.0d, 1.0E-8d, 1.0d, 97.0d }, 1.0E-15);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) (-1.0f), (double) ' ');
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer3.getGoalType();
        java.lang.Class<?> wildcardClass9 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) (-1), 1.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray7 = new double[] {};
        double[] doubleArray8 = new double[] {};
        double[] doubleArray15 = new double[] { (-1), 1.0d, (-1.0d), 1, (byte) 0, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = bOBYQAOptimizer1.optimize(10, multivariateFunction5, goalType6, doubleArray7, doubleArray8, doubleArray15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 6 != 0");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d), 1.0d, (-1.0d), 1.0d, 0.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1));
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 0.0d, (double) 10);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray11 = new double[] { (short) 10, (byte) 1, 0L };
        double[] doubleArray14 = new double[] { (-1.0d), (byte) 1 };
        double[] doubleArray17 = new double[] { 1.0E-8d, 100L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair18 = bOBYQAOptimizer3.optimize((int) (byte) 10, multivariateFunction6, goalType7, doubleArray11, doubleArray14, doubleArray17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 2 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0E-8d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction4 = null;
        org.apache.commons.math.optimization.GoalType goalType5 = null;
        double[] doubleArray12 = new double[] { 0.0d, (byte) 1, 10.0d, 1.0d, 10.0d, '#' };
        double[] doubleArray18 = new double[] { ' ', 100L, (short) 0, 1.0f, (short) 1 };
        double[] doubleArray22 = new double[] { 10, 1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair23 = bOBYQAOptimizer1.optimize((int) 'a', multivariateFunction4, goalType5, doubleArray12, doubleArray18, doubleArray22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 5 != 6");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, 1.0d, 10.0d, 1.0d, 10.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 32.0d, 100.0d, 0.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 10.0d, 1.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        int int8 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker9 = bOBYQAOptimizer1.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker9);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        double[] doubleArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = bOBYQAOptimizer1.optimize((int) '#', multivariateFunction9, goalType10, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, 10.0d, (double) (byte) 1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        int int7 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer3.getGoalType();
        int int9 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType10 = bOBYQAOptimizer3.getGoalType();
        int int11 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) (byte) 1, 1.0E-8d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray11 = new double[] { (short) 1, 10L, 1.0E-8d };
        double[] doubleArray17 = new double[] { 0.0d, (short) 1, (-1), 1, 0.0f };
        double[] doubleArray23 = new double[] { 10L, (byte) 1, 'a', '4', (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair24 = bOBYQAOptimizer3.optimize((int) (short) 100, multivariateFunction6, goalType7, doubleArray11, doubleArray17, doubleArray23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 5 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 10.0d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d, 1.0d, (-1.0d), 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 10.0d, 1.0d, 97.0d, 52.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, 0.0d, (double) (-1L));
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        int int8 = bOBYQAOptimizer3.getEvaluations();
        int int9 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) 10, (double) '4');
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray8 = new double[] { ' ' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = bOBYQAOptimizer3.optimize((int) (byte) -1, multivariateFunction5, goalType6, doubleArray8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 32.0d }, 1.0E-15);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', (double) (short) 1, (double) 10.0f);
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, 0.0d, (double) (-1L));
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType9 = bOBYQAOptimizer3.getGoalType();
        java.lang.Class<?> wildcardClass10 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) (byte) 10, 10.0d);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray9 = null;
        double[] doubleArray16 = new double[] { 10.0f, (-1.0d), 0.0d, (byte) 100, (short) 100, 0L };
        double[] doubleArray20 = new double[] { 1L, 100.0f, 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair21 = bOBYQAOptimizer3.optimize((int) (byte) 100, multivariateFunction7, goalType8, doubleArray9, doubleArray16, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, (-1.0d), 0.0d, 100.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 1.0d, 100.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) (byte) 1, 10.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass5 = realPointValuePairConvergenceChecker4.getClass();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, (double) 1L, (double) (byte) 0);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray11 = new double[] { (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = bOBYQAOptimizer3.optimize((int) (byte) 10, multivariateFunction8, goalType9, doubleArray11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) (byte) 10, (double) (byte) 100);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction10 = null;
        org.apache.commons.math.optimization.GoalType goalType11 = null;
        double[] doubleArray13 = new double[] { (short) -1 };
        double[] doubleArray19 = new double[] { (short) 10, (-1.0f), (byte) 1, 2, (-1.0f) };
        double[] doubleArray25 = new double[] { '4', (short) 0, 10, 1, 1L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair26 = bOBYQAOptimizer1.optimize((int) ' ', multivariateFunction10, goalType11, doubleArray13, doubleArray19, doubleArray25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 5 != 1");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 10.0d, (-1.0d), 1.0d, 2.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 52.0d, 0.0d, 10.0d, 1.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) '4', (double) '#');
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) (byte) -1, 0.0d);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = goalType5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) 'a', (double) (byte) -1);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass6 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        int int8 = bOBYQAOptimizer1.getMaxEvaluations();
        java.lang.Class<?> wildcardClass9 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) 10, 0.0d);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray7 = new double[] {};
        double[] doubleArray13 = new double[] { 0.0f, 1.0f, (byte) 1, (byte) 0, (-1.0d) };
        double[] doubleArray14 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair15 = bOBYQAOptimizer3.optimize(100, multivariateFunction5, goalType6, doubleArray7, doubleArray13, doubleArray14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 5 != 0");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, 1.0d, 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (-1.0f), (double) 100);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (-1), (double) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray14 = new double[] { 10L, 10.0f, (byte) -1, (short) 100 };
        double[] doubleArray16 = new double[] { (byte) 1 };
        double[] doubleArray23 = new double[] { (-1.0d), 10L, '4', 0L, 1L, 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair24 = bOBYQAOptimizer3.optimize((int) (short) 0, multivariateFunction8, goalType9, doubleArray14, doubleArray16, doubleArray23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 4");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 10.0d, 10.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { (-1.0d), 10.0d, 52.0d, 0.0d, 1.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) 10.0f, (double) 100.0f);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2, (double) (byte) 1, (double) 1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray11 = new double[] { (byte) 10, (byte) 1 };
        double[] doubleArray18 = new double[] { 2, (-1.0d), (short) 10, '#', 1.0d, (byte) -1 };
        double[] doubleArray21 = new double[] { 100, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair22 = bOBYQAOptimizer3.optimize(2, multivariateFunction7, goalType8, doubleArray11, doubleArray18, doubleArray21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 6 != 2");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 2.0d, (-1.0d), 10.0d, 35.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, (double) 0, (double) 10);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2, (double) (-1), 0.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, 0.0d, (double) 0L);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray7 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = bOBYQAOptimizer3.optimize((int) (byte) 0, multivariateFunction5, goalType6, doubleArray7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) 0, (double) (byte) 10);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray7 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = bOBYQAOptimizer3.optimize(0, multivariateFunction5, goalType6, doubleArray7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        int int7 = bOBYQAOptimizer1.getEvaluations();
        int int8 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction10 = null;
        org.apache.commons.math.optimization.GoalType goalType11 = null;
        double[] doubleArray17 = new double[] { 100L, (short) -1, (short) -1, (byte) 0, 10 };
        double[] doubleArray18 = new double[] {};
        double[] doubleArray20 = new double[] { 0L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair21 = bOBYQAOptimizer1.optimize((int) (byte) 10, multivariateFunction10, goalType11, doubleArray17, doubleArray18, doubleArray20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 0 != 5");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        int int8 = bOBYQAOptimizer1.getMaxEvaluations();
        int int9 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) (short) -1, (double) (-1L));
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass8 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1, (double) (-1), (double) 10);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray13 = new double[] { 10, (byte) 100, 10, 'a', 1.0d, (-1L) };
        double[] doubleArray18 = new double[] { 'a', 1.0f, 'a', (short) 100 };
        double[] doubleArray22 = new double[] { '4', 100.0d, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair23 = bOBYQAOptimizer3.optimize((int) (short) 100, multivariateFunction5, goalType6, doubleArray13, doubleArray18, doubleArray22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 4 != 6");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 10.0d, 100.0d, 10.0d, 97.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 97.0d, 1.0d, 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 52.0d, 100.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        int int7 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction10 = null;
        org.apache.commons.math.optimization.GoalType goalType11 = null;
        double[] doubleArray12 = null;
        double[] doubleArray13 = new double[] {};
        double[] doubleArray14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair15 = bOBYQAOptimizer1.optimize((int) '#', multivariateFunction10, goalType11, doubleArray12, doubleArray13, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        int int8 = bOBYQAOptimizer1.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction10 = null;
        org.apache.commons.math.optimization.GoalType goalType11 = null;
        double[] doubleArray16 = new double[] { 100, '#', 10.0d, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair17 = bOBYQAOptimizer1.optimize((int) '4', multivariateFunction10, goalType11, doubleArray16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d, 35.0d, 10.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (-1.0d), (double) (short) 10);
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) '4', 1.0d);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) ' ', (double) (-1.0f));
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) (byte) 10, (double) 0.0f);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray12 = new double[] { (byte) 100, (-1.0f), (short) 1, 10 };
        double[] doubleArray16 = new double[] { 0.0f, 0.0f, (byte) -1 };
        double[] doubleArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair18 = bOBYQAOptimizer3.optimize((-1), multivariateFunction6, goalType7, doubleArray12, doubleArray16, doubleArray17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 3 != 4");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, (-1.0d), 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.0d, 0.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (double) 0L, (double) 10.0f);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray12 = new double[] { (byte) 10, (short) -1, 10.0d, 100, (short) 100 };
        double[] doubleArray17 = new double[] { 1.0d, (byte) 1, '4', (byte) -1 };
        double[] doubleArray23 = new double[] { 1.0d, 100.0f, 0.0d, (-1), 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair24 = bOBYQAOptimizer3.optimize(10, multivariateFunction5, goalType6, doubleArray12, doubleArray17, doubleArray23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 4 != 5");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, (-1.0d), 10.0d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 52.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 100.0d, 0.0d, (-1.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) (byte) 0, (double) 10);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2, (double) (byte) 1, (double) 1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = goalType6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) 2, 100.0d);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray8 = new double[] { 1L };
        double[] doubleArray10 = new double[] { '#' };
        double[] doubleArray14 = new double[] { 1.0d, (byte) 1, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair15 = bOBYQAOptimizer3.optimize((int) (byte) -1, multivariateFunction5, goalType6, doubleArray8, doubleArray10, doubleArray14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (35)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1.0d, 1.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, (double) 0, (double) 1L);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = bOBYQAOptimizer3.optimize((-1), multivariateFunction7, goalType8, doubleArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        double[] doubleArray16 = new double[] { 1.0f, 0L, 100L, 10.0d, (short) 100, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair17 = bOBYQAOptimizer1.optimize(0, multivariateFunction6, goalType7, doubleArray8, doubleArray9, doubleArray16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 6 != 0");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 1.0d, 0.0d, 100.0d, 10.0d, 100.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ', (double) 10.0f, 100.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass6 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) 1L, (double) (-1L));
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) 100.0f, (double) '4');
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4', 1.0d, (double) '4');
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray11 = new double[] { '4', 2, 0L, 0L };
        double[] doubleArray18 = new double[] { (short) 0, ' ', (short) 1, ' ', 1.0f, 1.0d };
        double[] doubleArray20 = new double[] { 2 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair21 = bOBYQAOptimizer3.optimize((int) 'a', multivariateFunction5, goalType6, doubleArray11, doubleArray18, doubleArray20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 6 != 4");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 52.0d, 2.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 0.0d, 32.0d, 1.0d, 32.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 2.0d }, 1.0E-15);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        double[] doubleArray15 = new double[] { (byte) -1, 10.0f, (byte) -1, (short) -1 };
        double[] doubleArray20 = new double[] { (short) 100, (byte) 10, ' ', 10L };
        double[] doubleArray25 = new double[] { 0.0f, 1.0d, ' ', 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair26 = bOBYQAOptimizer1.optimize((int) (short) 0, multivariateFunction9, goalType10, doubleArray15, doubleArray20, doubleArray25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (100)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d), 10.0d, (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d, 10.0d, 32.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 0.0d, 1.0d, 32.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) (-1.0f), (double) (-1L));
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) 100.0f, (double) 0.0f);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray8 = new double[] { (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = bOBYQAOptimizer3.optimize((int) '4', multivariateFunction5, goalType6, doubleArray8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1, 0.0d, (double) (short) -1);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) (byte) -1, (double) 100.0f);
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, 0.0d, 0.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) 10L, (double) (short) 10);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 10.0d, (double) (short) 0);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        int int7 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer3.getGoalType();
        int int9 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, 1.0E-8d, (double) (byte) 100);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass5 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ', (double) 10.0f, (-1.0d));
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) (short) 1, (double) (byte) 10);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) 10L, (double) ' ');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, 10.0d, (double) (byte) 1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        int int7 = bOBYQAOptimizer3.getMaxEvaluations();
        int int8 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) 'a', (double) 2);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray11 = new double[] { 1, (short) 10 };
        double[] doubleArray13 = new double[] { (byte) 0 };
        double[] doubleArray20 = new double[] { (short) 0, 100, '#', 100L, (byte) 10, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair21 = bOBYQAOptimizer1.optimize((-1), multivariateFunction7, goalType8, doubleArray11, doubleArray13, doubleArray20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 2");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 0.0d, 100.0d, 35.0d, 100.0d, 10.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) (byte) 1, 1.0E-8d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray13 = new double[] { 10.0d, 0L, 0.0f, 0.0f, (byte) 10 };
        double[] doubleArray19 = new double[] { 1, (short) 10, 100.0f, 10L, (short) 0 };
        double[] doubleArray20 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair21 = bOBYQAOptimizer3.optimize((int) (byte) 10, multivariateFunction6, goalType7, doubleArray13, doubleArray19, doubleArray20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (10)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 10.0d, 0.0d, 0.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 1.0d, 10.0d, 100.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray11 = new double[] { 1.0E-8d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = bOBYQAOptimizer1.optimize(2, multivariateFunction8, goalType9, doubleArray11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0E-8d }, 1.0E-15);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (double) 100, (double) (short) -1);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray13 = new double[] { 100.0f, ' ', (short) 0, 0.0f, (short) 1 };
        double[] doubleArray16 = new double[] { (short) 10, (byte) 1 };
        double[] doubleArray22 = new double[] { 100L, 0, 0, 10.0f, 1L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair23 = bOBYQAOptimizer1.optimize(100, multivariateFunction6, goalType7, doubleArray13, doubleArray16, doubleArray22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 2 != 5");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d, 32.0d, 0.0d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d, 0.0d, 0.0d, 10.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) 1.0f, (double) (short) -1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) 10L, (double) (short) 10);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray12 = new double[] { 0, 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair13 = bOBYQAOptimizer3.optimize((int) (short) -1, multivariateFunction8, goalType9, doubleArray12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) 1.0f, (double) 0);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray14 = new double[] { 0, 100, 10.0f, (byte) 100, 1L, 'a' };
        double[] doubleArray17 = new double[] { 10.0f, 0 };
        double[] doubleArray21 = new double[] { 0L, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair22 = bOBYQAOptimizer3.optimize((int) (byte) 10, multivariateFunction6, goalType7, doubleArray14, doubleArray17, doubleArray21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 2 != 6");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.0d, 100.0d, 10.0d, 100.0d, 1.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 0.0d, 100.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 10);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ', (-1.0d), (double) (short) 10);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) (byte) 0, (double) ' ');
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray16 = new double[] { (short) -1, (-1.0f), (-1.0d), (-1.0d), 100.0f, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair17 = bOBYQAOptimizer3.optimize((-1), multivariateFunction8, goalType9, doubleArray16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d), (-1.0d), (-1.0d), (-1.0d), 100.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, 0.0d, (double) (short) 0);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        int int9 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (double) (-1.0f), (double) 10L);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass7 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#');
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) (-1L), 1.0E-8d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker9 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction11 = null;
        org.apache.commons.math.optimization.GoalType goalType12 = null;
        double[] doubleArray17 = new double[] { (byte) 10, 0L, (byte) 100, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair18 = bOBYQAOptimizer1.optimize((int) (short) 10, multivariateFunction11, goalType12, doubleArray17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker9);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 0.0d, 100.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', 1.0E-8d, (double) 100L);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray11 = new double[] { 10L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = bOBYQAOptimizer3.optimize((int) (short) 1, multivariateFunction8, goalType9, doubleArray11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d }, 1.0E-15);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (-1.0d), 0.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray12 = new double[] { 100.0d, (-1L), 100.0d, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair13 = bOBYQAOptimizer3.optimize(2, multivariateFunction6, goalType7, doubleArray12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, (-1.0d), 100.0d, 32.0d }, 1.0E-15);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray12 = new double[] { (short) 10, '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair13 = bOBYQAOptimizer1.optimize((int) '#', multivariateFunction8, goalType9, doubleArray12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) (byte) 0, (double) ' ');
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        java.lang.Class<?> wildcardClass5 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, (double) ' ', (double) (byte) 1);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', (double) 0.0f, (double) (byte) 1);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) (short) 1, (double) (short) 100);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray8 = new double[] { 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = bOBYQAOptimizer3.optimize((int) ' ', multivariateFunction5, goalType6, doubleArray8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) 0.0f, (-1.0d));
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) 2, (double) 0L);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) 10L, (double) ' ');
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) 0, (double) 100.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray8 = null;
        double[] doubleArray13 = new double[] { (short) 100, 10, (byte) 10, 2 };
        double[] doubleArray19 = new double[] { 100, 1.0d, 100, (short) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair20 = bOBYQAOptimizer3.optimize(2, multivariateFunction6, goalType7, doubleArray8, doubleArray13, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d, 10.0d, 10.0d, 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 1.0d, 100.0d, (-1.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) 10, 0.0d);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 10.0d, (double) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction10 = null;
        org.apache.commons.math.optimization.GoalType goalType11 = null;
        double[] doubleArray17 = new double[] { 0L, (byte) 0, 0L, (short) -1, 0.0d };
        double[] doubleArray18 = new double[] {};
        double[] doubleArray19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair20 = bOBYQAOptimizer3.optimize((int) (short) 100, multivariateFunction10, goalType11, doubleArray17, doubleArray18, doubleArray19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 0 != 5");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d, 0.0d, 0.0d, (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        int int8 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker9 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction11 = null;
        org.apache.commons.math.optimization.GoalType goalType12 = null;
        double[] doubleArray14 = new double[] { 10 };
        double[] doubleArray15 = new double[] {};
        double[] doubleArray17 = new double[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair18 = bOBYQAOptimizer1.optimize((int) '#', multivariateFunction11, goalType12, doubleArray14, doubleArray15, doubleArray17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 0 != 1");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker9);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1, (double) (-1L), (double) (byte) -1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (double) (-1.0f), (double) 10L);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass5 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, 1.0d, (double) (short) 100);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        int int7 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        double[] doubleArray16 = new double[] { (short) -1, 1L, '#', 0L, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair17 = bOBYQAOptimizer3.optimize((int) '4', multivariateFunction9, goalType10, doubleArray16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d), 1.0d, 35.0d, 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (double) (-1.0f), (double) 10L);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) '4', (double) 10);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4', (double) 'a', (double) 10);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1, 100.0d, (double) (byte) 10);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray14 = new double[] { 1, (byte) 1, (byte) 1, (-1), 100.0d };
        double[] doubleArray20 = new double[] { (-1L), '#', 100L, 1.0d, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair21 = bOBYQAOptimizer3.optimize((int) (byte) -1, multivariateFunction6, goalType7, doubleArray8, doubleArray14, doubleArray20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 5 != 0");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1.0d, 1.0d, 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { (-1.0d), 35.0d, 100.0d, 1.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (-1.0d), (double) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) 100, 0.0d);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        java.lang.Class<?> wildcardClass6 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) (short) -1, (double) 0.0f);
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', (double) ' ', 0.0d);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray15 = new double[] { (short) 100, (short) -1, 0.0f, 10.0d, 10.0d, 10L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = bOBYQAOptimizer3.optimize((int) (short) 10, multivariateFunction7, goalType8, doubleArray15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d, (-1.0d), 0.0d, 10.0d, 10.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) 10, (double) (byte) 10);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) 10, (double) (short) -1);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) 100.0f, (double) 2);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        int int7 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        double[] doubleArray15 = new double[] { 0.0d, ' ', (short) -1, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = bOBYQAOptimizer3.optimize(0, multivariateFunction9, goalType10, doubleArray15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d, 32.0d, (-1.0d), 0.0d }, 1.0E-15);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        int int7 = bOBYQAOptimizer1.getEvaluations();
        int int8 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) (short) 1, (double) 0.0f);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) (byte) 10, 10.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray8 = null;
        double[] doubleArray11 = new double[] { 2, (short) -1 };
        double[] doubleArray16 = new double[] { 100L, 1L, (short) 100, 0L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair17 = bOBYQAOptimizer3.optimize(1, multivariateFunction6, goalType7, doubleArray8, doubleArray11, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 2.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d, 1.0d, 100.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) 100.0f, (double) (short) 10);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) 0L, (double) '4');
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (double) (-1.0f), (double) 10L);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, 0.0d, 0.0d);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        java.lang.Class<?> wildcardClass5 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) 0.0f, (double) '#');
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray12 = new double[] { 0.0d, 1.0d, ' ', (short) 0 };
        double[] doubleArray15 = new double[] { (-1.0f), 100L };
        double[] doubleArray16 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair17 = bOBYQAOptimizer3.optimize((-1), multivariateFunction6, goalType7, doubleArray12, doubleArray15, doubleArray16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 2 != 4");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, 1.0d, 32.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer1.getGoalType();
        int int9 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker10 = bOBYQAOptimizer1.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker10);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) 10, (double) (-1.0f));
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, 0.0d, (double) (short) 100);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        int int8 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType9 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction11 = null;
        org.apache.commons.math.optimization.GoalType goalType12 = null;
        double[] doubleArray19 = new double[] { 0L, (short) 0, 'a', 0.0d, 1.0f, (byte) 100 };
        double[] doubleArray26 = new double[] { 0.0d, 1.0E-8d, '4', 1.0f, '#', 100 };
        double[] doubleArray31 = new double[] { (-1), (-1L), 'a', 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair32 = bOBYQAOptimizer1.optimize(10, multivariateFunction11, goalType12, doubleArray19, doubleArray26, doubleArray31);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 0.0d, 0.0d, 97.0d, 0.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 0.0d, 1.0E-8d, 52.0d, 1.0d, 35.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { (-1.0d), (-1.0d), 97.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        int int8 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType9 = bOBYQAOptimizer1.getGoalType();
        int int10 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType11 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType12 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction14 = null;
        org.apache.commons.math.optimization.GoalType goalType15 = null;
        double[] doubleArray20 = new double[] { (short) 10, 100, (byte) 10, 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair21 = bOBYQAOptimizer1.optimize((int) '4', multivariateFunction14, goalType15, doubleArray20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 10.0d, 100.0d, 10.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) 10.0f, (double) '#');
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray12 = new double[] { 100, 1L };
        double[] doubleArray16 = new double[] { 1.0f, 1.0f, '4' };
        double[] doubleArray19 = new double[] { 1, 0L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair20 = bOBYQAOptimizer3.optimize((int) (short) 10, multivariateFunction8, goalType9, doubleArray12, doubleArray16, doubleArray19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 3 != 2");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 1.0d, 1.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 1.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) (short) 100, (double) (short) 100);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray8 = new double[] { 1L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = bOBYQAOptimizer3.optimize((-1), multivariateFunction5, goalType6, doubleArray8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 10.0d, (double) (short) 0);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer3.getGoalType();
        int int8 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ', 100.0d, (double) (byte) 100);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) (byte) 10, (double) 1);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass5 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) 1.0f, (double) 0);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray12 = new double[] { 10, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair13 = bOBYQAOptimizer3.optimize(0, multivariateFunction8, goalType9, doubleArray12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (-1.0d), (double) 0);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (-1.0f), 100.0d);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) 10L, (double) (short) 10);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        int int7 = bOBYQAOptimizer3.getMaxEvaluations();
        int int8 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType9 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction3 = null;
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        double[] doubleArray10 = new double[] { ' ', 0L, ' ', 10.0f, 1 };
        double[] doubleArray14 = new double[] { 0, 10L, 10.0d };
        double[] doubleArray17 = new double[] { 0.0f, 2 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair18 = bOBYQAOptimizer1.optimize(10, multivariateFunction3, goalType4, doubleArray10, doubleArray14, doubleArray17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 3 != 5");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 32.0d, 0.0d, 32.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d, 2.0d }, 1.0E-15);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) (-1), 1.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1, (double) (byte) 10, (double) 100.0f);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) 'a', (double) 0L);
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 10);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ');
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        int int8 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) '#', (double) 10);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray8 = new double[] { 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = bOBYQAOptimizer3.optimize((int) (byte) -1, multivariateFunction5, goalType6, doubleArray8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d }, 1.0E-15);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), 0.0d, (double) (-1L));
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) (short) 0, 1.0d);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) (short) 1, (double) 100.0f);
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) 100.0f, 0.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType9 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker10 = bOBYQAOptimizer1.getConvergenceChecker();
        int int11 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType12 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType13 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker14 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction16 = null;
        org.apache.commons.math.optimization.GoalType goalType17 = null;
        double[] doubleArray18 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair19 = bOBYQAOptimizer1.optimize(10, multivariateFunction16, goalType17, doubleArray18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertNull(goalType13);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker14);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2, (double) '#', (double) (-1.0f));
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray12 = new double[] { 1.0E-8d, 10L, 100L, (-1L) };
        double[] doubleArray16 = new double[] { 10L, ' ', 1 };
        double[] doubleArray22 = new double[] { (-1.0d), 1L, 'a', '4', (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair23 = bOBYQAOptimizer1.optimize((int) (short) 100, multivariateFunction6, goalType7, doubleArray12, doubleArray16, doubleArray22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 3 != 4");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0E-8d, 10.0d, 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { (-1.0d), 1.0d, 97.0d, 52.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        java.lang.Class<?> wildcardClass6 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1, (double) (-1), (double) 10);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) 0, 1.0E-8d);
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
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) (byte) -1, (double) 'a');
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray14 = new double[] { 10, 1.0f, (-1L), 1.0E-8d };
        double[] doubleArray16 = new double[] { 10L };
        double[] doubleArray17 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair18 = bOBYQAOptimizer3.optimize(2, multivariateFunction8, goalType9, doubleArray14, doubleArray16, doubleArray17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 4");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 10.0d, 1.0d, (-1.0d), 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, 1.0d, (double) (-1L));
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction4 = null;
        org.apache.commons.math.optimization.GoalType goalType5 = null;
        double[] doubleArray10 = new double[] { 1.0E-8d, 0L, 100, '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair11 = bOBYQAOptimizer1.optimize((int) (byte) 1, multivariateFunction4, goalType5, doubleArray10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0E-8d, 0.0d, 100.0d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) 10L, (double) (-1.0f));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, 0.0d, (double) (short) -1);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray10 = new double[] { 1.0f, (-1) };
        double[] doubleArray13 = new double[] { (short) 100, (-1L) };
        double[] doubleArray16 = new double[] { (byte) 1, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair17 = bOBYQAOptimizer3.optimize(1, multivariateFunction6, goalType7, doubleArray10, doubleArray13, doubleArray16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (100)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 1.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        java.lang.Class<?> wildcardClass7 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ', (double) (-1L), (double) 0L);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) 0, (double) 1.0f);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) 1L, (double) '#');
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, 0.0d, 0.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray12 = new double[] { (-1), 1L, 0, (byte) 1 };
        double[] doubleArray16 = new double[] { 100L, 10.0f, 2 };
        double[] doubleArray18 = new double[] { 0L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair19 = bOBYQAOptimizer3.optimize((int) (byte) 100, multivariateFunction6, goalType7, doubleArray12, doubleArray16, doubleArray18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 3 != 4");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d), 1.0d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d, 10.0d, 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) (short) 100, 100.0d);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', (double) (byte) 100, (double) (short) -1);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, 0.0d, (double) 1L);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) 10L, (double) (short) 10);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) 1L, (double) '4');
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        int int7 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        double[] doubleArray14 = new double[] { 1.0d, (-1.0f), 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair15 = bOBYQAOptimizer1.optimize((int) (byte) -1, multivariateFunction9, goalType10, doubleArray14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1.0d, (-1.0d), 1.0d }, 1.0E-15);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        int int8 = bOBYQAOptimizer1.getMaxEvaluations();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4', 0.0d, 1.0d);
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (-1L), (double) 10.0f);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass5 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 1.0E-8d, (double) 1);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) (byte) 10, (double) (byte) 100);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray14 = new double[] { 100L, 1, 100.0d, (short) 0 };
        double[] doubleArray15 = null;
        double[] doubleArray16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair17 = bOBYQAOptimizer3.optimize(0, multivariateFunction8, goalType9, doubleArray14, doubleArray15, doubleArray16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d, 1.0d, 100.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        int int8 = bOBYQAOptimizer1.getMaxEvaluations();
        int int9 = bOBYQAOptimizer1.getEvaluations();
        int int10 = bOBYQAOptimizer1.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (short) 1, (double) 10L);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray12 = new double[] { 100.0d, 1, (byte) 0, (-1.0d) };
        double[] doubleArray13 = new double[] {};
        double[] doubleArray14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair15 = bOBYQAOptimizer3.optimize((int) (byte) 100, multivariateFunction6, goalType7, doubleArray12, doubleArray13, doubleArray14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 0 != 4");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) (-1.0f), (double) ' ');
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker9 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker9);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) 1.0f, (double) 1);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) 100.0f, 10.0d);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray13 = new double[] { 10L, 0L, 10, (byte) 0, (byte) 10 };
        double[] doubleArray14 = new double[] {};
        double[] doubleArray21 = new double[] { (byte) 100, (-1.0f), 10, (byte) 10, (-1.0d), (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair22 = bOBYQAOptimizer3.optimize((int) (byte) 1, multivariateFunction6, goalType7, doubleArray13, doubleArray14, doubleArray21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 0 != 5");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 100.0d, (-1.0d), 10.0d, 10.0d, (-1.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        java.lang.Class<?> wildcardClass8 = realPointValuePairConvergenceChecker7.getClass();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType9 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction11 = null;
        org.apache.commons.math.optimization.GoalType goalType12 = null;
        double[] doubleArray18 = new double[] { 10.0f, 1.0f, (short) 0, 10.0f, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair19 = bOBYQAOptimizer1.optimize((int) (short) -1, multivariateFunction11, goalType12, doubleArray18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 10.0d, 1.0d, 0.0d, 10.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, 10.0d, (double) 100);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, (double) (byte) -1, 10.0d);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) 100.0f, (double) 0.0f);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray15 = new double[] { (byte) -1, 100.0f, 10.0f, '4', (byte) 100 };
        double[] doubleArray22 = new double[] { (short) 0, ' ', (byte) 10, 0L, 100, 1.0d };
        double[] doubleArray26 = new double[] { 'a', 1.0f, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair27 = bOBYQAOptimizer3.optimize(1, multivariateFunction8, goalType9, doubleArray15, doubleArray22, doubleArray26);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 6 != 5");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d), 100.0d, 10.0d, 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 0.0d, 32.0d, 10.0d, 0.0d, 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 97.0d, 1.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) 10, (double) 1L);
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (short) 1, (double) 10L);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4', (double) 100.0f, 0.0d);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray11 = new double[] { (short) 1, 1.0E-8d, 10L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = bOBYQAOptimizer3.optimize(1, multivariateFunction6, goalType7, doubleArray11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0E-8d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) 100, (double) 0L);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (-1.0f), (double) (byte) 10);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray14 = new double[] { ' ', 1, (short) 10, (byte) -1, 2, 100.0f };
        double[] doubleArray15 = new double[] {};
        double[] doubleArray19 = new double[] { (short) 100, 0L, 1.0E-8d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair20 = bOBYQAOptimizer3.optimize((int) ' ', multivariateFunction6, goalType7, doubleArray14, doubleArray15, doubleArray19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 0 != 6");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 32.0d, 1.0d, 10.0d, (-1.0d), 2.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 0.0d, 1.0E-8d }, 1.0E-15);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction4 = null;
        org.apache.commons.math.optimization.GoalType goalType5 = null;
        double[] doubleArray12 = new double[] { 100L, (byte) 1, 10L, (-1.0d), (short) 1, ' ' };
        double[] doubleArray18 = new double[] { 0L, 'a', ' ', 0.0d, 10 };
        double[] doubleArray23 = new double[] { (byte) 100, 10L, 0L, 100L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair24 = bOBYQAOptimizer1.optimize(0, multivariateFunction4, goalType5, doubleArray12, doubleArray18, doubleArray23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 5 != 6");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 1.0d, 10.0d, (-1.0d), 1.0d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 0.0d, 97.0d, 32.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 100.0d, 10.0d, 0.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) (short) -1, (double) (-1L));
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray11 = new double[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = bOBYQAOptimizer3.optimize((int) (short) 1, multivariateFunction8, goalType9, doubleArray11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 10.0d, (double) (short) 0);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) (-1.0f), (double) (short) -1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) 0, (double) 0.0f);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray15 = new double[] { 100.0d, 1.0E-8d, 0, (byte) 1, 0.0f, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = bOBYQAOptimizer3.optimize((int) (byte) 100, multivariateFunction7, goalType8, doubleArray15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d, 1.0E-8d, 0.0d, 1.0d, 0.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) 100, (double) (-1.0f));
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray15 = new double[] { 1, 10L, (-1), 100.0f, 0L, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = bOBYQAOptimizer3.optimize((int) 'a', multivariateFunction7, goalType8, doubleArray15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0d, 10.0d, (-1.0d), 100.0d, 0.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) (-1), (double) (-1));
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        int int8 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker9 = bOBYQAOptimizer1.getConvergenceChecker();
        int int10 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction12 = null;
        org.apache.commons.math.optimization.GoalType goalType13 = null;
        double[] doubleArray15 = new double[] { (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = bOBYQAOptimizer1.optimize(2, multivariateFunction12, goalType13, doubleArray15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (double) 1L, (double) 10);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray8 = new double[] { 1L };
        double[] doubleArray11 = new double[] { 1L, (byte) 100 };
        double[] doubleArray15 = new double[] { 100L, 0L, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = bOBYQAOptimizer3.optimize((int) 'a', multivariateFunction5, goalType6, doubleArray8, doubleArray11, doubleArray15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 2 != 1");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d, 0.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ', (double) 100L, 1.0d);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) 10.0f, 1.0E-8d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) 100L, (double) (short) 1);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        double[] doubleArray11 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = bOBYQAOptimizer3.optimize((int) (short) 10, multivariateFunction9, goalType10, doubleArray11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, 0.0d, 0.0d);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) (byte) -1, (-1.0d));
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, 100.0d, (double) 100);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        double[] doubleArray11 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = bOBYQAOptimizer3.optimize((int) (byte) 1, multivariateFunction9, goalType10, doubleArray11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, (double) (-1L), (double) 1);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray13 = new double[] { 2, 100, (-1L) };
        double[] doubleArray17 = new double[] { (byte) 0, (byte) 0, (short) -1 };
        double[] doubleArray19 = new double[] { 'a' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair20 = bOBYQAOptimizer3.optimize(1, multivariateFunction8, goalType9, doubleArray13, doubleArray17, doubleArray19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 2.0d, 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 97.0d }, 1.0E-15);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        int int8 = bOBYQAOptimizer1.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1));
        int int2 = bOBYQAOptimizer1.getEvaluations();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) (byte) 0, (double) ' ');
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass7 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1, (double) (-1), (double) (byte) 1);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        double[] doubleArray14 = new double[] { 1.0d, (byte) 10, (short) 0 };
        double[] doubleArray16 = new double[] { (short) 100 };
        double[] doubleArray19 = new double[] { '4', 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair20 = bOBYQAOptimizer1.optimize(0, multivariateFunction9, goalType10, doubleArray14, doubleArray16, doubleArray19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 52.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        double[] doubleArray15 = new double[] { (short) 1, 1.0d, 100, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = bOBYQAOptimizer1.optimize((-1), multivariateFunction9, goalType10, doubleArray15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0d, 1.0d, 100.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', (double) (-1L), (double) 10);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        int int7 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) (-1L), (double) (-1));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(goalType8);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) 0L, (double) 'a');
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) (byte) 100, 0.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass8 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) 1, (double) 10.0f);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) 100, (double) (short) 0);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, 0.0d, (double) (-1L));
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) 100L, (double) (byte) -1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray14 = new double[] { 100, 1.0d, (short) -1, 100, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair15 = bOBYQAOptimizer3.optimize((int) (byte) -1, multivariateFunction7, goalType8, doubleArray14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d, 1.0d, (-1.0d), 100.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (byte) 100, (double) 0);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (-1), (double) (short) 0);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray7 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = bOBYQAOptimizer3.optimize(1, multivariateFunction5, goalType6, doubleArray7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
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
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction12 = null;
        org.apache.commons.math.optimization.GoalType goalType13 = null;
        double[] doubleArray19 = new double[] { (short) 0, 0, 2, (short) 100, (byte) 1 };
        double[] doubleArray22 = new double[] { 100L, 1.0f };
        double[] doubleArray23 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair24 = bOBYQAOptimizer1.optimize((int) '#', multivariateFunction12, goalType13, doubleArray19, doubleArray22, doubleArray23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 2 != 5");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 0.0d, 0.0d, 2.0d, 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, 0.0d, (double) (-1L));
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType9 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction11 = null;
        org.apache.commons.math.optimization.GoalType goalType12 = null;
        double[] doubleArray17 = new double[] { 0.0d, (-1L), 0.0d, 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair18 = bOBYQAOptimizer3.optimize((int) ' ', multivariateFunction11, goalType12, doubleArray17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d, (-1.0d), 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) 2, (double) 10);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) 100L, (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass5 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) 1.0f, (-1.0d));
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray11 = new double[] { 1, (-1.0d) };
        double[] doubleArray14 = new double[] { 100, (-1L) };
        double[] doubleArray20 = new double[] { 10.0f, (short) 0, 10.0f, 0.0f, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair21 = bOBYQAOptimizer1.optimize(2, multivariateFunction7, goalType8, doubleArray11, doubleArray14, doubleArray20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (100)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 10.0d, 0.0d, 10.0d, 0.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
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
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker12 = bOBYQAOptimizer1.getConvergenceChecker();
        java.lang.Class<?> wildcardClass13 = realPointValuePairConvergenceChecker12.getClass();
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
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) 10, (double) '#');
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray8 = new double[] { 1 };
        double[] doubleArray9 = null;
        double[] doubleArray12 = new double[] { (short) -1, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair13 = bOBYQAOptimizer3.optimize((int) (short) 10, multivariateFunction5, goalType6, doubleArray8, doubleArray9, doubleArray12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 2 != 1");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d), 0.0d }, 1.0E-15);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) '4', (double) 10);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) '4', (double) 1);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1, (double) (-1), (double) (byte) 1);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 10.0d, (double) (short) 0);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction10 = null;
        org.apache.commons.math.optimization.GoalType goalType11 = null;
        double[] doubleArray12 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair13 = bOBYQAOptimizer3.optimize((int) (byte) -1, multivariateFunction10, goalType11, doubleArray12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4', (double) (short) 10, (double) 1.0f);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray12 = new double[] { 100L, 10.0d, (byte) 0, 10 };
        double[] doubleArray15 = new double[] { (byte) -1, (-1.0d) };
        double[] doubleArray16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair17 = bOBYQAOptimizer3.optimize((int) '4', multivariateFunction6, goalType7, doubleArray12, doubleArray15, doubleArray16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 2 != 4");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 10.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 10, (double) 'a', (double) 0L);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass7 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ', 100.0d, (double) 1.0f);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass6 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) 10L, (double) (short) 100);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, 100.0d, (double) 100);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction10 = null;
        org.apache.commons.math.optimization.GoalType goalType11 = null;
        double[] doubleArray14 = new double[] { 100.0d, 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair15 = bOBYQAOptimizer3.optimize((int) '#', multivariateFunction10, goalType11, doubleArray14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (-1.0d), (double) (short) 1);
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, 0.0d, (double) (byte) 1);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray10 = new double[] { 10L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair11 = bOBYQAOptimizer1.optimize((int) (byte) 0, multivariateFunction7, goalType8, doubleArray10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d }, 1.0E-15);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType9 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker10 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker11 = bOBYQAOptimizer1.getConvergenceChecker();
        java.lang.Class<?> wildcardClass12 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker10);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray10 = new double[] {};
        double[] doubleArray13 = new double[] { 100, 10L };
        double[] doubleArray17 = new double[] { (byte) -1, 10.0d, 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair18 = bOBYQAOptimizer1.optimize(0, multivariateFunction8, goalType9, doubleArray10, doubleArray13, doubleArray17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 2 != 0");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-1.0d), 10.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1, (-1.0d), (double) (short) -1);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass6 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) 10, (double) 1L);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray9 = new double[] { 10, (short) 10 };
        double[] doubleArray14 = new double[] { (short) 0, '4', (short) 10, 1.0f };
        double[] doubleArray20 = new double[] { 1.0E-8d, 100L, (byte) 100, (-1.0d), (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair21 = bOBYQAOptimizer3.optimize((int) '4', multivariateFunction5, goalType6, doubleArray9, doubleArray14, doubleArray20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 4 != 2");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.0d, 52.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 1.0E-8d, 100.0d, 100.0d, (-1.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) 'a', (double) (byte) -1);
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (byte) 100, (double) '4');
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) (short) 10, (double) 2);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 10, (double) (byte) 10, (double) (-1.0f));
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (-1.0f), (-1.0d));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        int int8 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction10 = null;
        org.apache.commons.math.optimization.GoalType goalType11 = null;
        double[] doubleArray12 = new double[] {};
        double[] doubleArray18 = new double[] { (byte) 1, ' ', (short) 1, (short) 100, (short) 1 };
        double[] doubleArray23 = new double[] { (-1L), 0.0d, (-1L), 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair24 = bOBYQAOptimizer3.optimize((int) '#', multivariateFunction10, goalType11, doubleArray12, doubleArray18, doubleArray23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 5 != 0");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 1.0d, 32.0d, 1.0d, 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { (-1.0d), 0.0d, (-1.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, 0.0d, (double) (short) 10);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, (double) (-1L), (double) 1);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        int int8 = bOBYQAOptimizer3.getMaxEvaluations();
        int int9 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) '#', 1.0E-8d);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        int int8 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction10 = null;
        org.apache.commons.math.optimization.GoalType goalType11 = null;
        double[] doubleArray14 = new double[] { 100.0f, 10.0f };
        double[] doubleArray18 = new double[] { 1L, (byte) 1, (-1.0f) };
        double[] doubleArray19 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair20 = bOBYQAOptimizer1.optimize((int) (byte) 100, multivariateFunction10, goalType11, doubleArray14, doubleArray18, doubleArray19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 3 != 2");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 1.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) (short) 10, (double) (short) -1);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ');
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = goalType4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2, (double) 'a', (double) 10L);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) 100, (double) 1L);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1, 10.0d, (double) (-1));
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, 100.0d, (double) 100);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass6 = realPointValuePairConvergenceChecker5.getClass();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) 'a', (double) 1L);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray12 = new double[] { 10.0d, (byte) 0, 100, (-1), (short) 100 };
        double[] doubleArray14 = new double[] { 100 };
        double[] doubleArray20 = new double[] { 1.0f, 1.0f, 10.0d, (short) 1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair21 = bOBYQAOptimizer3.optimize((int) (short) 1, multivariateFunction5, goalType6, doubleArray12, doubleArray14, doubleArray20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 5");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 0.0d, 100.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 1.0d, 1.0d, 10.0d, 1.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, 1.0d, (double) (short) 100);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray9 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = bOBYQAOptimizer3.optimize(2, multivariateFunction7, goalType8, doubleArray9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, 0.0d, (-1.0d));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, (double) '4', (double) 1L);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        int int8 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType9 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction11 = null;
        org.apache.commons.math.optimization.GoalType goalType12 = null;
        double[] doubleArray17 = new double[] { 100.0d, 10.0f, 1L, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair18 = bOBYQAOptimizer1.optimize((int) (short) 100, multivariateFunction11, goalType12, doubleArray17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d, 10.0d, 1.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) (short) 0, (double) (short) 0);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) 10, (double) (-1.0f));
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (double) 100, (double) (short) -1);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray14 = new double[] { 0.0f, 0.0d, '4', 1.0f, 1L, 100.0d };
        double[] doubleArray17 = new double[] { (short) 0, ' ' };
        double[] doubleArray24 = new double[] { 100.0f, 0.0d, 0, 1.0d, 10L, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair25 = bOBYQAOptimizer3.optimize((int) '#', multivariateFunction6, goalType7, doubleArray14, doubleArray17, doubleArray24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 2 != 6");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.0d, 0.0d, 52.0d, 1.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 100.0d, 0.0d, 0.0d, 1.0d, 10.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) (short) 100, (double) 1.0f);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray11 = new double[] { (byte) -1, 100L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = bOBYQAOptimizer3.optimize(100, multivariateFunction7, goalType8, doubleArray11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        java.lang.Class<?> wildcardClass8 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) 2, (double) 10.0f);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray8 = new double[] { (short) 0 };
        double[] doubleArray15 = new double[] { (byte) 10, 100, 1.0d, 100.0f, 1L, (byte) -1 };
        double[] doubleArray21 = new double[] { (short) 1, 100.0d, 10.0d, '#', 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair22 = bOBYQAOptimizer3.optimize((int) (byte) 10, multivariateFunction5, goalType6, doubleArray8, doubleArray15, doubleArray21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 6 != 1");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 100.0d, 1.0d, 100.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 1.0d, 100.0d, 10.0d, 35.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', (double) (byte) -1, (double) '#');
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass5 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = goalType7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, (double) 1L, (double) (byte) 0);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        int int8 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) 10.0f, (-1.0d));
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray8 = null;
        double[] doubleArray13 = new double[] { 100.0d, (short) 1, (-1.0f), 1.0f };
        double[] doubleArray18 = new double[] { (-1.0f), '4', 1L, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair19 = bOBYQAOptimizer3.optimize(10, multivariateFunction6, goalType7, doubleArray8, doubleArray13, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d, 1.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { (-1.0d), 52.0d, 1.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ', (double) 100L, (double) 100.0f);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (byte) -1, (double) (short) 100);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray14 = new double[] { 'a', (byte) 100, 100L, (-1.0f), '4', 1 };
        double[] doubleArray17 = new double[] { '#', 10.0d };
        double[] doubleArray18 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair19 = bOBYQAOptimizer3.optimize(0, multivariateFunction6, goalType7, doubleArray14, doubleArray17, doubleArray18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 2 != 6");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 97.0d, 100.0d, 100.0d, (-1.0d), 52.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 35.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        int int7 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1, (double) 0.0f, (double) (-1L));
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) 10.0f, 10.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray9 = new double[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = bOBYQAOptimizer3.optimize((int) ' ', multivariateFunction6, goalType7, doubleArray9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d }, 1.0E-15);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) 10, (double) (byte) 1);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) 'a', (double) 2);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (-1.0f), (double) ' ');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass6 = realPointValuePairConvergenceChecker5.getClass();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        int int2 = bOBYQAOptimizer1.getEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) (byte) 1, (double) (-1));
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) (-1L), 1.0E-8d);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) (-1.0f), (double) (-1));
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (double) 0L, (double) 100L);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray11 = new double[] { ' ', (-1.0f) };
        double[] doubleArray15 = new double[] { '4', (short) -1, '4' };
        double[] doubleArray22 = new double[] { (-1.0f), 10, (-1), (short) -1, (-1), 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair23 = bOBYQAOptimizer3.optimize((int) ' ', multivariateFunction7, goalType8, doubleArray11, doubleArray15, doubleArray22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 3 != 2");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 32.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 52.0d, (-1.0d), 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { (-1.0d), 10.0d, (-1.0d), (-1.0d), (-1.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray9 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = bOBYQAOptimizer1.optimize((int) ' ', multivariateFunction7, goalType8, doubleArray9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray8 = null;
        double[] doubleArray11 = new double[] { '#', 'a' };
        double[] doubleArray12 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair13 = bOBYQAOptimizer1.optimize(0, multivariateFunction6, goalType7, doubleArray8, doubleArray11, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 35.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) (byte) 10, (double) 0.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass6 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) (byte) -1, (double) 'a');
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        int int7 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (double) 100, (double) (short) -1);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray11 = new double[] { (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = bOBYQAOptimizer3.optimize((int) (byte) -1, multivariateFunction7, goalType8, doubleArray11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) 'a', (double) 2);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass5 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ', (double) 1, (double) 2);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', 1.0E-8d, (double) 100L);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray10 = new double[] { 10L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair11 = bOBYQAOptimizer3.optimize((int) (short) 100, multivariateFunction7, goalType8, doubleArray10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d }, 1.0E-15);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        int int8 = bOBYQAOptimizer1.getEvaluations();
        int int9 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType10 = bOBYQAOptimizer1.getGoalType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
    }
}

