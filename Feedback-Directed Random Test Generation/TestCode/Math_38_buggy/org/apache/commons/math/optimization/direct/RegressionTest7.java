package org.apache.commons.math.optimization.direct;

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
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) (byte) 100, (double) (byte) -1);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray11 = new double[] { 1.0f, 100, 10.0f, (byte) -1 };
        double[] doubleArray18 = new double[] { (short) 0, 0, 100.0f, 100, 'a', 0.0f };
        double[] doubleArray19 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair20 = bOBYQAOptimizer3.optimize((int) (byte) 10, multivariateFunction5, goalType6, doubleArray11, doubleArray18, doubleArray19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 6 != 4");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 100.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 0.0d, 0.0d, 100.0d, 100.0d, 97.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (byte) -1, (double) 0.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, (double) 1L, (double) (byte) 0);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass7 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, 10.0d, (double) (short) -1);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) 100L, 0.0d);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) (-1.0f), (double) (-1L));
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray9 = new double[] { (short) 10, (short) 0 };
        double[] doubleArray11 = new double[] { 100.0f };
        double[] doubleArray17 = new double[] { (short) 10, 2, (byte) 100, (-1), 0L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair18 = bOBYQAOptimizer3.optimize((int) (byte) 10, multivariateFunction5, goalType6, doubleArray9, doubleArray11, doubleArray17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 2");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 2.0d, 100.0d, (-1.0d), 0.0d }, 1.0E-15);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) 1.0f, (double) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray9 = new double[] { (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = bOBYQAOptimizer3.optimize((int) (short) 100, multivariateFunction6, goalType7, doubleArray9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) 10, 10.0d);
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
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray12 = new double[] { (short) 1, (short) 1, 10.0d };
        double[] doubleArray16 = new double[] { 100L, 100.0f, (byte) -1 };
        double[] doubleArray20 = new double[] { 0.0d, ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair21 = bOBYQAOptimizer1.optimize(10, multivariateFunction7, goalType8, doubleArray12, doubleArray16, doubleArray20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 1 is smaller than the minimum (100)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d, 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 0.0d, 32.0d, 32.0d }, 1.0E-15);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) (short) 0, (double) 10L);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (-1.0d), (double) 0);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray9 = new double[] { 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = bOBYQAOptimizer3.optimize((int) (byte) 0, multivariateFunction5, goalType6, doubleArray9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 97.0d, 32.0d }, 1.0E-15);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        java.lang.Class<?> wildcardClass8 = realPointValuePairConvergenceChecker7.getClass();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1, 0.0d, 1.0E-8d);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray12 = new double[] { 10.0d, 0, (-1.0f), (byte) 0 };
        double[] doubleArray13 = new double[] {};
        double[] doubleArray19 = new double[] { (-1), 1.0f, 100.0f, '#', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair20 = bOBYQAOptimizer3.optimize((int) (short) 1, multivariateFunction6, goalType7, doubleArray12, doubleArray13, doubleArray19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 0 != 4");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 0.0d, (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { (-1.0d), 1.0d, 100.0d, 35.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', (double) (-1L), (double) 10);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        int int8 = bOBYQAOptimizer3.getEvaluations();
        int int9 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
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
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction14 = null;
        org.apache.commons.math.optimization.GoalType goalType15 = null;
        double[] doubleArray20 = new double[] { 100L, 100, (byte) -1, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair21 = bOBYQAOptimizer1.optimize(10, multivariateFunction14, goalType15, doubleArray20);
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
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) 2, (double) 0.0f);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) 'a', (double) (byte) 1);
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 10, (double) 100.0f, 0.0d);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 10.0d, (double) 1.0f);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray7 = null;
        double[] doubleArray9 = new double[] { '#' };
        double[] doubleArray10 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair11 = bOBYQAOptimizer3.optimize((int) 'a', multivariateFunction5, goalType6, doubleArray7, doubleArray9, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ', (double) 0.0f, (double) '4');
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        int int8 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1, (double) 100.0f, 10.0d);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass5 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType9 = bOBYQAOptimizer1.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = goalType9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(goalType9);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ', (double) (byte) -1, 0.0d);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        int int7 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker9 = bOBYQAOptimizer1.getConvergenceChecker();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker9);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (-1.0d), (double) ' ');
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) (byte) -1, (double) 0.0f);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        java.lang.Class<?> wildcardClass5 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) (short) 0, (double) (short) -1);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker9 = bOBYQAOptimizer1.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker9);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) (byte) 0, (double) ' ');
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) 1, (double) '4');
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass6 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ', (double) 0L, (double) (short) 10);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        java.lang.Class<?> wildcardClass7 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, 1.0E-8d, (double) 100);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass6 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker9 = bOBYQAOptimizer1.getConvergenceChecker();
        java.lang.Class<?> wildcardClass10 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) '#', (double) (byte) 1);
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) (byte) 0, (double) ' ');
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, 100.0d, (double) 100);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType9 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNull(goalType9);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, 100.0d, (double) 1.0f);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray12 = new double[] { 0.0f, (-1), (short) 10, (byte) -1, 'a' };
        double[] doubleArray16 = new double[] { 1, 100L, 100L };
        double[] doubleArray22 = new double[] { (short) 0, '#', 0.0d, (byte) -1, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair23 = bOBYQAOptimizer3.optimize((int) (byte) -1, multivariateFunction5, goalType6, doubleArray12, doubleArray16, doubleArray22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 3 != 5");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, (-1.0d), 10.0d, (-1.0d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 1.0d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 0.0d, 35.0d, 0.0d, (-1.0d), 0.0d }, 1.0E-15);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 10, (double) (short) 100, (double) '#');
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray10 = new double[] { 0.0d, 10.0d };
        double[] doubleArray12 = new double[] { (short) -1 };
        double[] doubleArray14 = new double[] { (-1) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair15 = bOBYQAOptimizer3.optimize(100, multivariateFunction6, goalType7, doubleArray10, doubleArray12, doubleArray14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 2");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a');
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction3 = null;
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        double[] doubleArray7 = new double[] { 100.0f, 0L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = bOBYQAOptimizer1.optimize(0, multivariateFunction3, goalType4, doubleArray7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) (short) 1, (double) (short) 100);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) 10, (double) 100L);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray12 = new double[] { 1.0f, (byte) 100, 0L, 1.0E-8d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair13 = bOBYQAOptimizer3.optimize(1, multivariateFunction6, goalType7, doubleArray12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0d, 100.0d, 0.0d, 1.0E-8d }, 1.0E-15);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray8 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = bOBYQAOptimizer1.optimize((-1), multivariateFunction6, goalType7, doubleArray8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (-1.0d), 1.0d);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 10, (double) 100L, (double) (byte) 10);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) (byte) 10, (double) 0.0f);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction10 = null;
        org.apache.commons.math.optimization.GoalType goalType11 = null;
        double[] doubleArray14 = new double[] { (-1L), (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair15 = bOBYQAOptimizer3.optimize((int) (short) 100, multivariateFunction10, goalType11, doubleArray14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) (-1.0f), (double) (byte) 10);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray9 = new double[] { (byte) -1 };
        double[] doubleArray16 = new double[] { (short) 0, 1.0E-8d, (short) 10, 0L, 100.0f, 100L };
        double[] doubleArray19 = new double[] { (-1.0f), 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair20 = bOBYQAOptimizer3.optimize((int) 'a', multivariateFunction6, goalType7, doubleArray9, doubleArray16, doubleArray19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 6 != 1");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.0d, 1.0E-8d, 10.0d, 0.0d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { (-1.0d), 1.0d }, 1.0E-15);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        java.lang.Class<?> wildcardClass5 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) (-1.0f), (double) (-1L));
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) (byte) 10, (double) 0.0f);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (-1), (double) (short) 0);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) 100, (double) (short) 10);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass5 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray13 = new double[] { (byte) 10, '#', 0L, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = bOBYQAOptimizer1.optimize((int) (byte) -1, multivariateFunction7, goalType8, doubleArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 10.0d, 35.0d, 0.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) 100L, (double) ' ');
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        double[] doubleArray11 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = bOBYQAOptimizer1.optimize((int) (byte) 10, multivariateFunction9, goalType10, doubleArray11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) 'a', (double) (byte) -1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray15 = new double[] { (-1.0f), 0, 10, 100.0d, ' ', 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = bOBYQAOptimizer3.optimize((int) (short) 100, multivariateFunction7, goalType8, doubleArray15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d), 0.0d, 10.0d, 100.0d, 32.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) (byte) 0, (double) ' ');
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) 0, (double) 100.0f);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) (byte) 0, (double) 100.0f);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) ' ', 0.0d);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray10 = new double[] { 100L, (byte) -1 };
        double[] doubleArray16 = new double[] { (byte) 100, ' ', '#', (short) -1, (short) 0 };
        double[] doubleArray19 = new double[] { (-1), ' ' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair20 = bOBYQAOptimizer3.optimize((-1), multivariateFunction6, goalType7, doubleArray10, doubleArray16, doubleArray19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 5 != 2");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d, 32.0d, 35.0d, (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { (-1.0d), 32.0d }, 1.0E-15);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) 100.0f, 10.0d);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray8 = new double[] { 10.0d };
        double[] doubleArray10 = new double[] { 10.0d };
        double[] doubleArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = bOBYQAOptimizer3.optimize((int) (short) -1, multivariateFunction5, goalType6, doubleArray8, doubleArray10, doubleArray11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d }, 1.0E-15);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) 100, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) 10, (double) (byte) 10);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) 1.0f, 1.0E-8d);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        int int7 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', 1.0d, (double) 10L);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass5 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (short) 1, (double) (short) 0);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (double) (byte) 100, (double) 1);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (byte) -1, (double) 0.0f);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray10 = new double[] { 100.0d, '4', 100L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair11 = bOBYQAOptimizer3.optimize((int) ' ', multivariateFunction5, goalType6, doubleArray10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 52.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) 10.0f, (double) (byte) 1);
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) (short) -1, (double) (-1.0f));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1, (double) 100L, (double) 1.0f);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray13 = new double[] { 0, 0L, 100.0f, '#', 0L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = bOBYQAOptimizer3.optimize(1, multivariateFunction6, goalType7, doubleArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, 0.0d, 100.0d, 35.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) (-1.0f), 10.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer3.getConvergenceChecker();
        int int9 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType10 = bOBYQAOptimizer3.getGoalType();
        int int11 = bOBYQAOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass12 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray9 = null;
        double[] doubleArray14 = new double[] { 1, (byte) 0, (byte) 0, (short) 0 };
        double[] doubleArray15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = bOBYQAOptimizer1.optimize((int) ' ', multivariateFunction7, goalType8, doubleArray9, doubleArray14, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) (short) 1, (double) (short) 10);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        int int7 = bOBYQAOptimizer1.getEvaluations();
        int int8 = bOBYQAOptimizer1.getMaxEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) 1.0f, (double) 0);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) 0L, 10.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) (-1L), (double) (short) 1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass5 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) 10L, (double) (byte) 100);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType9 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType10 = bOBYQAOptimizer1.getGoalType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(goalType10);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) (-1.0f), (double) ' ');
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        int int8 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker9 = bOBYQAOptimizer3.getConvergenceChecker();
        int int10 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) 10L, (double) (short) 10);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        int int7 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer3.getGoalType();
        int int9 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ', (double) 'a', (double) (byte) 0);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ', (double) ' ', (double) 1.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        int int7 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) 'a', 0.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) 2, (double) (short) 10);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (-1.0f), (double) ' ');
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        java.lang.Class<?> wildcardClass5 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) 'a', (double) 1);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray12 = new double[] { (-1.0d), 10.0f, (-1.0d), (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair13 = bOBYQAOptimizer3.optimize(0, multivariateFunction6, goalType7, doubleArray12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d), 10.0d, (-1.0d), 0.0d }, 1.0E-15);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, 0.0d, 0.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 10);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        int int7 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer1.getGoalType();
        int int9 = bOBYQAOptimizer1.getMaxEvaluations();
        int int10 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker11 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction13 = null;
        org.apache.commons.math.optimization.GoalType goalType14 = null;
        double[] doubleArray19 = new double[] { 10.0d, 1.0f, 1.0E-8d, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair20 = bOBYQAOptimizer1.optimize((int) (short) 1, multivariateFunction13, goalType14, doubleArray19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker11);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 10.0d, 1.0d, 1.0E-8d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        int int8 = bOBYQAOptimizer1.getMaxEvaluations();
        int int9 = bOBYQAOptimizer1.getMaxEvaluations();
        java.lang.Class<?> wildcardClass10 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        int int8 = bOBYQAOptimizer1.getEvaluations();
        int int9 = bOBYQAOptimizer1.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (-1L), (double) 10.0f);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) (short) 10, (double) 10);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (-1.0d), 0.0d);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
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
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        int int8 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) (byte) 0, (double) (short) -1);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass5 = realPointValuePairConvergenceChecker4.getClass();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 10, (double) (short) 0, (double) (short) 100);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) (-1.0f), (double) ' ');
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        int int7 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2, (double) (short) 1, (double) (short) 1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) ' ', (double) 1L);
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (-1.0f), (double) (byte) 10);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray8 = new double[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = bOBYQAOptimizer3.optimize((int) (short) 10, multivariateFunction5, goalType6, doubleArray8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 35.0d }, 1.0E-15);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray12 = new double[] { ' ', 'a', 'a', 1.0E-8d };
        double[] doubleArray14 = new double[] { 10.0f };
        double[] doubleArray16 = new double[] { 100L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair17 = bOBYQAOptimizer1.optimize((int) 'a', multivariateFunction6, goalType7, doubleArray12, doubleArray14, doubleArray16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 4");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 32.0d, 97.0d, 97.0d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d }, 1.0E-15);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) '4', 0.0d);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        int int8 = bOBYQAOptimizer1.getEvaluations();
        int int9 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) 0, (double) (short) -1);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) 0, 100.0d);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray12 = new double[] { 0, 10.0d, 1L, 1, '#' };
        double[] doubleArray17 = new double[] { (byte) 10, 100.0d, 0, 100 };
        double[] doubleArray24 = new double[] { ' ', 10.0d, '#', 10.0f, (-1), (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair25 = bOBYQAOptimizer3.optimize((int) (byte) 1, multivariateFunction5, goalType6, doubleArray12, doubleArray17, doubleArray24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 4 != 5");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, 10.0d, 1.0d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 100.0d, 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 32.0d, 10.0d, 35.0d, 10.0d, (-1.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ', (double) (byte) 100, (double) 100);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        int int7 = bOBYQAOptimizer1.getEvaluations();
        int int8 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (double) 10, (double) (-1));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2, (double) 'a', (double) 10L);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray13 = new double[] { 1.0E-8d, (byte) 0, (byte) 1, (-1L), '#' };
        double[] doubleArray18 = new double[] { 0, 0.0f, '#', (-1) };
        double[] doubleArray20 = new double[] { 1L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair21 = bOBYQAOptimizer3.optimize((int) (short) 0, multivariateFunction6, goalType7, doubleArray13, doubleArray18, doubleArray20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 4 != 5");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0E-8d, 0.0d, 1.0d, (-1.0d), 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 0.0d, 0.0d, 35.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) 100L, (double) (short) 1);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer3.getGoalType();
        int int8 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker9 = bOBYQAOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass10 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, 100.0d, (double) 100);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 10.0d, (double) (short) 0);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer3.getConvergenceChecker();
        int int9 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, (double) 0, (double) 10);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray8 = null;
        double[] doubleArray13 = new double[] { 100L, 10.0f, (-1.0d), (byte) -1 };
        double[] doubleArray16 = new double[] { (byte) 0, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair17 = bOBYQAOptimizer3.optimize((int) (short) 1, multivariateFunction6, goalType7, doubleArray8, doubleArray13, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d, 10.0d, (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        int int7 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType9 = bOBYQAOptimizer1.getGoalType();
        int int10 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker11 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction13 = null;
        org.apache.commons.math.optimization.GoalType goalType14 = null;
        double[] doubleArray21 = new double[] { (short) 1, 1.0f, (short) 100, 10.0f, 10, 1.0f };
        double[] doubleArray22 = new double[] {};
        double[] doubleArray29 = new double[] { (-1L), 0, 10.0d, (short) 100, (short) -1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair30 = bOBYQAOptimizer1.optimize((-1), multivariateFunction13, goalType14, doubleArray21, doubleArray22, doubleArray29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 0 != 6");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker11);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 1.0d, 1.0d, 100.0d, 10.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { (-1.0d), 0.0d, 10.0d, 100.0d, (-1.0d), 32.0d }, 1.0E-15);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        java.lang.Class<?> wildcardClass8 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), 100.0d, (double) ' ');
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        double[] doubleArray13 = new double[] { 1.0E-8d, (short) 10 };
        double[] doubleArray14 = new double[] {};
        double[] doubleArray17 = new double[] { (-1L), 1.0E-8d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair18 = bOBYQAOptimizer1.optimize((int) (byte) 100, multivariateFunction9, goalType10, doubleArray13, doubleArray14, doubleArray17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 0 != 2");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0E-8d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-1.0d), 1.0E-8d }, 1.0E-15);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) 0L, (double) '4');
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        java.lang.Class<?> wildcardClass9 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4', (double) 100.0f, 0.0d);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass5 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) (byte) -1, 100.0d);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', 0.0d, (double) (byte) -1);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, 1.0d, (-1.0d));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ', 1.0E-8d, 1.0E-8d);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) 10L, (double) ' ');
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) 100.0f, (double) 1L);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) 'a', (double) 2);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray10 = new double[] { (short) 0, 10.0d, 0L };
        double[] doubleArray15 = new double[] { (short) 1, 100L, (short) 1, 100 };
        double[] doubleArray16 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair17 = bOBYQAOptimizer3.optimize((int) 'a', multivariateFunction5, goalType6, doubleArray10, doubleArray15, doubleArray16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 4 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0d, 100.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ');
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        int int7 = bOBYQAOptimizer1.getEvaluations();
        int int8 = bOBYQAOptimizer1.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) (short) 0, (-1.0d));
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray13 = new double[] { 100.0d, ' ', (byte) 100, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = bOBYQAOptimizer3.optimize(100, multivariateFunction7, goalType8, doubleArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d, 32.0d, 100.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray12 = new double[] { '#', 100.0f, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair13 = bOBYQAOptimizer1.optimize((int) ' ', multivariateFunction7, goalType8, doubleArray12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 35.0d, 100.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', (double) (byte) -1, 0.0d);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', 1.0E-8d, 10.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass5 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) (short) -1, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) (short) 100, (double) 1.0f);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        double[] doubleArray12 = new double[] { (-1L) };
        double[] doubleArray13 = new double[] {};
        double[] doubleArray16 = new double[] { ' ', (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair17 = bOBYQAOptimizer3.optimize(0, multivariateFunction9, goalType10, doubleArray12, doubleArray13, doubleArray16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 0 != 1");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 32.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) 0.0f, (double) (-1L));
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray7 = new double[] {};
        double[] doubleArray12 = new double[] { (short) 100, (byte) 100, (byte) -1, 100.0f };
        double[] doubleArray16 = new double[] { 1L, (byte) 0, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair17 = bOBYQAOptimizer3.optimize(1, multivariateFunction5, goalType6, doubleArray7, doubleArray12, doubleArray16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 4 != 0");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 100.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 1.0d, 0.0d, 32.0d }, 1.0E-15);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        int int8 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType9 = bOBYQAOptimizer1.getGoalType();
        int int10 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker11 = bOBYQAOptimizer1.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker11);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray8 = new double[] { 0 };
        double[] doubleArray9 = new double[] {};
        double[] doubleArray15 = new double[] { ' ', 2, 100, (byte) 0, 1.0E-8d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = bOBYQAOptimizer1.optimize((int) (short) 100, multivariateFunction5, goalType6, doubleArray8, doubleArray9, doubleArray15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 0 != 1");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 32.0d, 2.0d, 100.0d, 0.0d, 1.0E-8d }, 1.0E-15);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2, (double) (byte) 10, (double) (short) 10);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray7 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = bOBYQAOptimizer3.optimize((int) (short) 10, multivariateFunction5, goalType6, doubleArray7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, 10.0d, (double) (byte) 1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        int int7 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction10 = null;
        org.apache.commons.math.optimization.GoalType goalType11 = null;
        double[] doubleArray18 = new double[] { 10L, 100, (byte) 0, 0, 2, (byte) 1 };
        double[] doubleArray22 = new double[] { 2, (byte) 1, 1 };
        double[] doubleArray25 = new double[] { (byte) 100, 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair26 = bOBYQAOptimizer3.optimize((int) (byte) 0, multivariateFunction10, goalType11, doubleArray18, doubleArray22, doubleArray25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 3 != 6");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 10.0d, 100.0d, 0.0d, 0.0d, 2.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 2.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 100.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) (short) 1, (double) 'a');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass5 = realPointValuePairConvergenceChecker4.getClass();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) 100L, (double) (byte) -1);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray13 = new double[] { (short) -1, 10.0d, 1.0f };
        double[] doubleArray16 = new double[] { (-1), 0.0f };
        double[] doubleArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair18 = bOBYQAOptimizer1.optimize((int) '4', multivariateFunction8, goalType9, doubleArray13, doubleArray16, doubleArray17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 2 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d), 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d), 0.0d }, 1.0E-15);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) 1.0f, (double) (byte) 100);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 10, (double) (short) 0, (double) (short) 100);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray8 = new double[] { 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = bOBYQAOptimizer3.optimize((int) (short) 10, multivariateFunction5, goalType6, doubleArray8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), 0.0d, (double) 10.0f);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2, (double) (short) 10, (double) 10);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) (byte) -1, (double) 'a');
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        double[] doubleArray14 = new double[] { (byte) 1, (-1.0d), (byte) 100 };
        double[] doubleArray16 = new double[] { ' ' };
        double[] doubleArray21 = new double[] { 0, 0.0d, (-1), 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair22 = bOBYQAOptimizer3.optimize((-1), multivariateFunction9, goalType10, doubleArray14, doubleArray16, doubleArray21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 0.0d, 0.0d, (-1.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) (byte) 10, (double) 100.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        double[] doubleArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = bOBYQAOptimizer1.optimize(10, multivariateFunction9, goalType10, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) (short) 100, (double) 100);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
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
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        int int7 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
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
        int int11 = bOBYQAOptimizer1.getEvaluations();
        java.lang.Class<?> wildcardClass12 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) (-1.0f), (double) (short) 10);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) 1.0f, (double) (byte) -1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray8 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = bOBYQAOptimizer1.optimize((int) (byte) 1, multivariateFunction6, goalType7, doubleArray8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (-1.0d), (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray14 = new double[] { 1, (byte) 1, 0L, ' ', 0L, 100.0f };
        double[] doubleArray20 = new double[] { 10L, 100, (short) -1, 10.0f, 'a' };
        double[] doubleArray27 = new double[] { (byte) 1, (byte) 10, (byte) 0, 0, 0L, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair28 = bOBYQAOptimizer3.optimize(0, multivariateFunction6, goalType7, doubleArray14, doubleArray20, doubleArray27);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 5 != 6");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1.0d, 1.0d, 0.0d, 32.0d, 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 10.0d, 100.0d, (-1.0d), 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 1.0d, 10.0d, 0.0d, 0.0d, 0.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) '4', 0.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        int int8 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction10 = null;
        org.apache.commons.math.optimization.GoalType goalType11 = null;
        double[] doubleArray17 = new double[] { 1.0d, (-1.0f), (byte) 100, '#', 10L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair18 = bOBYQAOptimizer1.optimize(0, multivariateFunction10, goalType11, doubleArray17);
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
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, (-1.0d), 100.0d, 35.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, (double) 10, (-1.0d));
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray10 = new double[] { (-1), 100.0d, 10 };
        double[] doubleArray16 = new double[] { '4', 1L, (-1.0d), (byte) 10, 1.0d };
        double[] doubleArray17 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair18 = bOBYQAOptimizer3.optimize((int) 'a', multivariateFunction5, goalType6, doubleArray10, doubleArray16, doubleArray17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 5 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 52.0d, 1.0d, (-1.0d), 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2, 0.0d, (double) 100.0f);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) (byte) 1, (double) ' ');
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) (-1), (double) (-1));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer3.getGoalType();
        int int8 = bOBYQAOptimizer3.getMaxEvaluations();
        int int9 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker10 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker10);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker9 = bOBYQAOptimizer1.getConvergenceChecker();
        int int10 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction12 = null;
        org.apache.commons.math.optimization.GoalType goalType13 = null;
        double[] doubleArray19 = new double[] { (short) -1, 1.0E-8d, (-1.0f), 1, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair20 = bOBYQAOptimizer1.optimize((-1), multivariateFunction12, goalType13, doubleArray19);
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
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { (-1.0d), 1.0E-8d, (-1.0d), 1.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, 10.0d, (-1.0d));
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1, (double) (byte) 0, (double) 'a');
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray11 = new double[] { 10, (-1.0d), 1.0d, (byte) 100 };
        double[] doubleArray15 = new double[] { (-1L), (byte) 1, (short) 1 };
        double[] doubleArray21 = new double[] { (byte) 10, (-1L), (short) 100, (-1.0f), 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair22 = bOBYQAOptimizer3.optimize((int) (byte) 100, multivariateFunction5, goalType6, doubleArray11, doubleArray15, doubleArray21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 3 != 4");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d, (-1.0d), 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d), 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 10.0d, (-1.0d), 100.0d, (-1.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        double[] doubleArray15 = new double[] { 1.0f, 1.0d, ' ', (byte) 1 };
        double[] doubleArray18 = new double[] { (short) 10, 10 };
        double[] doubleArray23 = new double[] { (byte) 0, (byte) -1, (short) -1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair24 = bOBYQAOptimizer1.optimize(2, multivariateFunction9, goalType10, doubleArray15, doubleArray18, doubleArray23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 2 != 4");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0d, 1.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', (double) ' ', 0.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray14 = new double[] { (short) 100, 10L, 2, (byte) -1, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair15 = bOBYQAOptimizer1.optimize((int) '4', multivariateFunction7, goalType8, doubleArray14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d, 10.0d, 2.0d, (-1.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        int int9 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType10 = bOBYQAOptimizer1.getGoalType();
        java.lang.Class<?> wildcardClass11 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker9 = bOBYQAOptimizer1.getConvergenceChecker();
        int int10 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 10, (double) (short) 100, (double) (short) 100);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass5 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, 100.0d, (double) 100);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        int int8 = bOBYQAOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass9 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        int int8 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) 0, (double) (byte) 0);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) 100.0f, 0.0d);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray8 = new double[] { 1L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = bOBYQAOptimizer3.optimize(100, multivariateFunction5, goalType6, doubleArray8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) (-1L), 100.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) (-1.0f), (double) (-1));
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray10 = new double[] { 1.0f, 100, 0 };
        double[] doubleArray17 = new double[] { (short) -1, (short) 1, (short) 100, 10L, (-1), (byte) 10 };
        double[] doubleArray24 = new double[] { 2, (short) -1, (byte) 1, 10.0f, 10L, 2 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair25 = bOBYQAOptimizer3.optimize((int) (byte) 10, multivariateFunction5, goalType6, doubleArray10, doubleArray17, doubleArray24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 6 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-1.0d), 1.0d, 100.0d, 10.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 2.0d, (-1.0d), 1.0d, 10.0d, 10.0d, 2.0d }, 1.0E-15);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) 2, 10.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (-1.0d), (double) 1L);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        int int8 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType9 = bOBYQAOptimizer1.getGoalType();
        java.lang.Class<?> wildcardClass10 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 10, 1.0E-8d, (double) 100L);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) (byte) 10, (double) 1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass5 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ', (double) 2, 1.0d);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        double[] doubleArray12 = new double[] { 0 };
        double[] doubleArray15 = new double[] { 1.0d, (short) 1 };
        double[] doubleArray16 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair17 = bOBYQAOptimizer3.optimize((int) (short) 100, multivariateFunction9, goalType10, doubleArray12, doubleArray15, doubleArray16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 2 != 1");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        int int9 = bOBYQAOptimizer1.getMaxEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 10, 10.0d, (double) 100L);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (-1L), (double) (-1.0f));
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 10.0d, (double) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray15 = new double[] { 10L, 100, (byte) 10, (byte) -1, (byte) -1 };
        double[] doubleArray22 = new double[] { 100.0d, 0.0d, 2, (short) 10, 100, (-1.0d) };
        double[] doubleArray25 = new double[] { 0.0d, 100L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair26 = bOBYQAOptimizer3.optimize((-1), multivariateFunction8, goalType9, doubleArray15, doubleArray22, doubleArray25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 6 != 5");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 100.0d, 10.0d, (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d, 0.0d, 2.0d, 10.0d, 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 0.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        java.lang.Class<?> wildcardClass7 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', (double) 1, (double) (short) -1);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) 10L, (double) (byte) -1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray8 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = bOBYQAOptimizer3.optimize(0, multivariateFunction6, goalType7, doubleArray8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) '#', 0.0d);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray13 = new double[] { (byte) 100, (byte) 1, (short) 0, 0, (-1L) };
        double[] doubleArray20 = new double[] { 2, (-1), 100.0f, 'a', 1.0f, 'a' };
        double[] doubleArray23 = new double[] { 1.0d, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair24 = bOBYQAOptimizer1.optimize((int) '4', multivariateFunction6, goalType7, doubleArray13, doubleArray20, doubleArray23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 6 != 5");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d, 1.0d, 0.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 2.0d, (-1.0d), 100.0d, 97.0d, 1.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (double) 0L, (double) 100L);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray16 = new double[] { '4', 0.0f, 1.0d, (byte) 1, (short) 10, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair17 = bOBYQAOptimizer3.optimize((int) (short) 10, multivariateFunction8, goalType9, doubleArray16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 52.0d, 0.0d, 1.0d, 1.0d, 10.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker9 = bOBYQAOptimizer1.getConvergenceChecker();
        int int10 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction12 = null;
        org.apache.commons.math.optimization.GoalType goalType13 = null;
        double[] doubleArray16 = new double[] { (byte) 1, ' ' };
        double[] doubleArray21 = new double[] { 1.0d, (short) 0, 100.0f, (byte) 10 };
        double[] doubleArray27 = new double[] { ' ', (-1L), (byte) 10, 0L, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair28 = bOBYQAOptimizer1.optimize(0, multivariateFunction12, goalType13, doubleArray16, doubleArray21, doubleArray27);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 4 != 2");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 1.0d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 1.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 32.0d, (-1.0d), 10.0d, 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) 0.0f, (double) '#');
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass5 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        java.lang.Class<?> wildcardClass5 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, 100.0d, (double) (-1));
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType9 = bOBYQAOptimizer1.getGoalType();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(goalType9);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) (short) 100, (double) 100);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 0.0d, (double) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) 10L, (double) (short) 10);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer3.getGoalType();
        int int8 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (double) 'a', 10.0d);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray7 = new double[] {};
        double[] doubleArray9 = new double[] { 10L };
        double[] doubleArray14 = new double[] { (-1L), (byte) 10, 10, 100L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair15 = bOBYQAOptimizer3.optimize((int) (byte) 10, multivariateFunction5, goalType6, doubleArray7, doubleArray9, doubleArray14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 0");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d), 10.0d, 10.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) (-1L), (double) (short) 10);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray8 = new double[] { 'a' };
        double[] doubleArray11 = new double[] { 1, (-1L) };
        double[] doubleArray18 = new double[] { 1.0f, 0L, (short) 10, 10.0f, (byte) 10, 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair19 = bOBYQAOptimizer3.optimize(0, multivariateFunction5, goalType6, doubleArray8, doubleArray11, doubleArray18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 2 != 1");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 1.0d, 0.0d, 10.0d, 10.0d, 10.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
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
        java.lang.Class<?> wildcardClass12 = realPointValuePairConvergenceChecker11.getClass();
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
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (-1.0d), (double) (short) 1);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass5 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (-1.0d), (double) 1L);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray12 = new double[] { 1.0E-8d, 1L, '#', ' ', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair13 = bOBYQAOptimizer3.optimize((int) (short) 10, multivariateFunction5, goalType6, doubleArray12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0E-8d, 1.0d, 35.0d, 32.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        int int8 = bOBYQAOptimizer1.getMaxEvaluations();
        int int9 = bOBYQAOptimizer1.getMaxEvaluations();
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
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) 1, (double) 0.0f);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = bOBYQAOptimizer3.optimize(2, multivariateFunction5, goalType6, doubleArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) 100.0f, (double) (byte) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray12 = new double[] { 1.0E-8d, 0.0d, 10 };
        double[] doubleArray14 = new double[] { ' ' };
        double[] doubleArray17 = new double[] { 100.0d, 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair18 = bOBYQAOptimizer1.optimize((int) (short) 0, multivariateFunction7, goalType8, doubleArray12, doubleArray14, doubleArray17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0E-8d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) 2, 1.0E-8d);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2, 0.0d, (double) 0L);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass7 = realPointValuePairConvergenceChecker6.getClass();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) 1.0f, 1.0E-8d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) (short) 1, (double) 100.0f);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass5 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) 10L, (double) (short) 100);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) 1L, (double) (byte) 100);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1, (double) '#', (double) (short) 10);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray8 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = bOBYQAOptimizer3.optimize((int) (byte) 1, multivariateFunction6, goalType7, doubleArray8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, 10.0d, (double) (short) 100);
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1, (double) (short) -1, (double) (byte) 10);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4', (double) (byte) 0, (double) (byte) 1);
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) (byte) 100, 0.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray13 = new double[] { (short) 0, 1.0d, (byte) 100, (byte) 100 };
        double[] doubleArray16 = new double[] { (-1), 0 };
        double[] doubleArray22 = new double[] { 10.0d, 100, (byte) 10, 1.0d, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair23 = bOBYQAOptimizer3.optimize((int) (short) 1, multivariateFunction7, goalType8, doubleArray13, doubleArray16, doubleArray22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 2 != 4");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, 1.0d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 10.0d, 100.0d, 10.0d, 1.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) 1L, (double) 0L);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray12 = new double[] { (-1.0f), (-1L), 0, (byte) 10, 2 };
        double[] doubleArray15 = new double[] { '#', 10 };
        double[] doubleArray17 = new double[] { 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair18 = bOBYQAOptimizer3.optimize((int) ' ', multivariateFunction5, goalType6, doubleArray12, doubleArray15, doubleArray17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 2 != 5");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d), (-1.0d), 0.0d, 10.0d, 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 35.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
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
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction12 = null;
        org.apache.commons.math.optimization.GoalType goalType13 = null;
        double[] doubleArray15 = new double[] { 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = bOBYQAOptimizer1.optimize(100, multivariateFunction12, goalType13, doubleArray15);
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
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d }, 1.0E-15);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) (short) -1, (double) (-1L));
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        double[] doubleArray13 = new double[] { '#', '4' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = bOBYQAOptimizer3.optimize((int) '#', multivariateFunction9, goalType10, doubleArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 35.0d, 52.0d }, 1.0E-15);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, (double) (-1L), (double) 1);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass6 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2, (double) 1L, (double) 1L);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) 2, (double) (-1L));
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) (-1.0f), (double) (byte) 0);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) ' ', (double) 0L);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) (byte) -1, (double) 2);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray14 = new double[] { 1.0d, (short) 0, (-1.0d), 2, 0L, '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair15 = bOBYQAOptimizer3.optimize((int) 'a', multivariateFunction6, goalType7, doubleArray14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1.0d, 0.0d, (-1.0d), 2.0d, 0.0d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4', (double) 100.0f, 0.0d);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray11 = new double[] { (byte) 10, (byte) 10, 0.0d };
        double[] doubleArray18 = new double[] { 0L, 100, 10.0f, '#', (byte) 10, (byte) 100 };
        double[] doubleArray20 = new double[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair21 = bOBYQAOptimizer3.optimize((int) (short) -1, multivariateFunction6, goalType7, doubleArray11, doubleArray18, doubleArray20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 6 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 0.0d, 100.0d, 10.0d, 35.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) (short) 1, (double) 0.0f);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray7 = new double[] {};
        double[] doubleArray9 = new double[] { 10 };
        double[] doubleArray14 = new double[] { 0, (byte) 10, (short) 1, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair15 = bOBYQAOptimizer3.optimize((int) (short) -1, multivariateFunction5, goalType6, doubleArray7, doubleArray9, doubleArray14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 0");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.0d, 10.0d, 1.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) 0, (double) 100.0f);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass6 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) 0, (double) 0.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        double[] doubleArray11 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = bOBYQAOptimizer3.optimize((int) '4', multivariateFunction9, goalType10, doubleArray11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray13 = new double[] { (short) -1, (short) 1, 100L, 1.0f, (short) 0, 1 };
        double[] doubleArray19 = new double[] { (-1), 'a', 10.0f, (-1), 100.0d };
        double[] doubleArray20 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair21 = bOBYQAOptimizer1.optimize((int) (byte) 100, multivariateFunction5, goalType6, doubleArray13, doubleArray19, doubleArray20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 5 != 6");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d), 1.0d, 100.0d, 1.0d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { (-1.0d), 97.0d, 10.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 10, (double) (byte) 100, (double) 'a');
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) 0L, (double) '4');
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        double[] doubleArray14 = new double[] { 100, 1, 100.0d };
        double[] doubleArray18 = new double[] { 1L, 0.0d, 'a' };
        double[] doubleArray22 = new double[] { 1, (-1L), 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair23 = bOBYQAOptimizer3.optimize(0, multivariateFunction9, goalType10, doubleArray14, doubleArray18, doubleArray22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooLargeException; message: 100 is larger than the maximum (1)");
        } catch (org.apache.commons.math.exception.NumberIsTooLargeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 1.0d, 0.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 1.0d, (-1.0d), 0.0d }, 1.0E-15);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 0.0d, (double) (byte) -1);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray7 = new double[] {};
        double[] doubleArray8 = new double[] {};
        double[] doubleArray14 = new double[] { (byte) -1, 0L, 10L, 10L, 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair15 = bOBYQAOptimizer3.optimize(100, multivariateFunction5, goalType6, doubleArray7, doubleArray8, doubleArray14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 5 != 0");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d), 0.0d, 10.0d, 10.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray15 = new double[] { 100.0f, 100, 2, (short) 0, 0 };
        double[] doubleArray20 = new double[] { (short) 100, (byte) 100, (short) 0, 1.0E-8d };
        double[] doubleArray24 = new double[] { (short) -1, (-1L), (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair25 = bOBYQAOptimizer1.optimize(100, multivariateFunction8, goalType9, doubleArray15, doubleArray20, doubleArray24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 4 != 5");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d, 100.0d, 2.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d, 100.0d, 0.0d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { (-1.0d), (-1.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#');
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = goalType5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ', 10.0d, 0.0d);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4', (double) (short) 1, (-1.0d));
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        java.lang.Class<?> wildcardClass9 = realPointValuePairConvergenceChecker8.getClass();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) (-1L), (double) (-1));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        double[] doubleArray14 = new double[] { (byte) 0, (byte) -1, (short) 0 };
        double[] doubleArray17 = new double[] { (short) 1, 0.0f };
        double[] doubleArray19 = new double[] { (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair20 = bOBYQAOptimizer3.optimize(0, multivariateFunction9, goalType10, doubleArray14, doubleArray17, doubleArray19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 2 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.0d, (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ', (-1.0d), (double) '#');
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        int int9 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1, (double) (byte) 0, (double) 'a');
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray7 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair8 = bOBYQAOptimizer3.optimize((int) (short) 0, multivariateFunction5, goalType6, doubleArray7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, 0.0d, (double) ' ');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', (double) 1, (double) '4');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) (byte) 0, (double) ' ');
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, 0.0d, (double) (-1L));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray11 = new double[] { (-1), 10.0d };
        double[] doubleArray14 = new double[] { '#', 0.0f };
        double[] doubleArray19 = new double[] { 2, 0, 0.0d, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair20 = bOBYQAOptimizer3.optimize((int) (short) 100, multivariateFunction7, goalType8, doubleArray11, doubleArray14, doubleArray19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (35)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 35.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 2.0d, 0.0d, 0.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 10.0d, (double) (short) 0);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass8 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction4 = null;
        org.apache.commons.math.optimization.GoalType goalType5 = null;
        double[] doubleArray9 = new double[] { (byte) -1, 0L, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = bOBYQAOptimizer1.optimize(2, multivariateFunction4, goalType5, doubleArray9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), 0.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', 10.0d, (double) (short) 100);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) 100.0f, (-1.0d));
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray12 = new double[] { 0, 0.0f, 100.0f, (byte) 10, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair13 = bOBYQAOptimizer3.optimize(0, multivariateFunction5, goalType6, doubleArray12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, 0.0d, 100.0d, 10.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        int int7 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) 1.0f, 0.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (double) 1, 10.0d);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, (double) 100, (double) 0L);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (-1.0d), 0.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, 10.0d, 10.0d);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (-1), (double) (short) 0);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) (-1L), (double) (-1));
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) 100, 0.0d);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, (double) (-1L), (double) 1);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray14 = new double[] { 0, (short) 0, ' ', 10L, (byte) -1 };
        double[] doubleArray20 = new double[] { (short) 10, 100, 100L, (byte) 10, 'a' };
        double[] doubleArray26 = new double[] { 0, 2, (-1L), 1L, 1.0E-8d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair27 = bOBYQAOptimizer3.optimize(100, multivariateFunction7, goalType8, doubleArray14, doubleArray20, doubleArray26);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (10)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.0d, 0.0d, 32.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 10.0d, 100.0d, 100.0d, 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 0.0d, 2.0d, (-1.0d), 1.0d, 1.0E-8d }, 1.0E-15);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', 1.0E-8d, (double) 100L);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) 1.0f, (double) 0);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) (-1.0f), 100.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 100.0d, (double) '4');
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        int int8 = bOBYQAOptimizer1.getEvaluations();
        java.lang.Class<?> wildcardClass9 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (double) 100L, 1.0E-8d);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType9 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker10 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType11 = bOBYQAOptimizer1.getGoalType();
        int int12 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker10);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) 10, 0.0d);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) 10, (double) 1);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (byte) -1, (double) (short) 100);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (short) 100, (double) '#');
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1, (double) 10.0f, 100.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        int int7 = bOBYQAOptimizer3.getMaxEvaluations();
        int int8 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4', (-1.0d), (double) (short) 1);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        java.lang.Class<?> wildcardClass7 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (double) 10L, (double) 1);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray15 = new double[] { 10.0f, (byte) 10, 'a', 10.0f, 10, 100.0d };
        double[] doubleArray20 = new double[] { 10L, 0.0f, 2, 10 };
        double[] doubleArray21 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair22 = bOBYQAOptimizer1.optimize((int) (byte) 1, multivariateFunction7, goalType8, doubleArray15, doubleArray20, doubleArray21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 4 != 6");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 10.0d, 97.0d, 10.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 10.0d, 0.0d, 2.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ', (double) ' ', (double) 1.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        int int8 = bOBYQAOptimizer1.getEvaluations();
        int int9 = bOBYQAOptimizer1.getMaxEvaluations();
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
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (-1.0f), (double) 100);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) 1.0f, 1.0E-8d);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction4 = null;
        org.apache.commons.math.optimization.GoalType goalType5 = null;
        double[] doubleArray6 = null;
        double[] doubleArray9 = new double[] { 2, (byte) -1 };
        double[] doubleArray15 = new double[] { 0.0d, (-1.0d), (byte) 0, (byte) 100, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = bOBYQAOptimizer1.optimize(10, multivariateFunction4, goalType5, doubleArray6, doubleArray9, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 2.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d, (-1.0d), 0.0d, 100.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) 100L, (double) 100L);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray11 = new double[] { 2, (byte) 100, 1.0d };
        double[] doubleArray12 = null;
        double[] doubleArray15 = new double[] { (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = bOBYQAOptimizer1.optimize((-1), multivariateFunction6, goalType7, doubleArray11, doubleArray12, doubleArray15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 2 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 2.0d, 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, (double) (short) 10, (double) (short) 1);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 10, (double) ' ', (double) (-1));
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) ' ', (double) 1L);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass5 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4', (double) (short) 1, (double) 0L);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2, (double) (byte) 1, (double) 1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray16 = new double[] { (byte) 1, (byte) 100, 2, '#', 2, 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair17 = bOBYQAOptimizer3.optimize((int) ' ', multivariateFunction8, goalType9, doubleArray16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 1.0d, 100.0d, 2.0d, 35.0d, 2.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (short) -1, (double) (byte) 10);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, 0.0d, (double) (-1L));
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        int int8 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction10 = null;
        org.apache.commons.math.optimization.GoalType goalType11 = null;
        double[] doubleArray16 = new double[] { 1, 1.0d, 100, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair17 = bOBYQAOptimizer3.optimize(1, multivariateFunction10, goalType11, doubleArray16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 1.0d, 1.0d, 100.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray10 = new double[] {};
        double[] doubleArray11 = null;
        double[] doubleArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair13 = bOBYQAOptimizer1.optimize((int) '#', multivariateFunction8, goalType9, doubleArray10, doubleArray11, doubleArray12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, 0.0d, (double) 1);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', (double) 100, (double) 2);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, 0.0d, (double) (-1L));
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer3.getGoalType();
        java.lang.Class<?> wildcardClass9 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1, (-1.0d), (double) 100L);
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#');
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) (short) 100, 100.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray13 = new double[] { (-1.0f), 0.0d, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = bOBYQAOptimizer1.optimize(0, multivariateFunction8, goalType9, doubleArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d), 0.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
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
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction12 = null;
        org.apache.commons.math.optimization.GoalType goalType13 = null;
        double[] doubleArray20 = new double[] { (short) 1, 0.0f, (short) 0, 10.0f, (short) 10, 100.0f };
        double[] doubleArray23 = new double[] { (byte) -1, (-1.0d) };
        double[] doubleArray26 = new double[] { (-1.0f), (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair27 = bOBYQAOptimizer1.optimize((-1), multivariateFunction12, goalType13, doubleArray20, doubleArray23, doubleArray26);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 2 != 6");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker9);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 1.0d, 0.0d, 0.0d, 10.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ', (double) '#', (double) 2);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) 'a', (double) (byte) -1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray13 = new double[] { (-1L), (byte) 1, (short) 1, 100L };
        double[] doubleArray16 = new double[] { (short) 100, 100 };
        double[] doubleArray22 = new double[] { (short) 0, 100L, (short) 10, 1.0E-8d, 0L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair23 = bOBYQAOptimizer3.optimize((int) (short) 100, multivariateFunction7, goalType8, doubleArray13, doubleArray16, doubleArray22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 2 != 4");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d), 1.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 0.0d, 100.0d, 10.0d, 1.0E-8d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) 0L, (double) '4');
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass8 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, 10.0d, (double) (-1.0f));
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        java.lang.Class<?> wildcardClass7 = realPointValuePairConvergenceChecker6.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (short) 10, (double) '#');
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray11 = new double[] { 0.0d, 10L, (short) 0, '#' };
        double[] doubleArray13 = new double[] { (short) 10 };
        double[] doubleArray14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair15 = bOBYQAOptimizer3.optimize(10, multivariateFunction5, goalType6, doubleArray11, doubleArray13, doubleArray14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 4");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d, 10.0d, 0.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 10.0d }, 1.0E-15);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) 1.0f, (double) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        int int7 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        double[] doubleArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = bOBYQAOptimizer1.optimize((int) (short) 10, multivariateFunction9, goalType10, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) 10.0f, 100.0d);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray12 = new double[] { '4', 1.0E-8d, 100.0f, (byte) 10 };
        double[] doubleArray13 = new double[] {};
        double[] doubleArray18 = new double[] { (byte) 0, 1.0E-8d, 10.0f, '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair19 = bOBYQAOptimizer3.optimize((int) (short) -1, multivariateFunction6, goalType7, doubleArray12, doubleArray13, doubleArray18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 0 != 4");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 52.0d, 1.0E-8d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 0.0d, 1.0E-8d, 10.0d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray10 = new double[] { (byte) 1 };
        double[] doubleArray11 = new double[] {};
        double[] doubleArray15 = new double[] { (short) 0, (byte) 1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = bOBYQAOptimizer1.optimize(0, multivariateFunction7, goalType8, doubleArray10, doubleArray11, doubleArray15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 0 != 1");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d, 1.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType9 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker10 = bOBYQAOptimizer1.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker10);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) (byte) 0, (double) (byte) 1);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) 100.0f, (double) 'a');
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray13 = new double[] { (byte) 100, (byte) 10, 0L, 10.0d, (byte) 10, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = bOBYQAOptimizer3.optimize((-1), multivariateFunction5, goalType6, doubleArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d, 10.0d, 0.0d, 10.0d, 10.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) (-1.0f), (double) (short) -1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) (-1L), (double) (-1));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray11 = new double[] { (byte) -1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = bOBYQAOptimizer3.optimize((int) (byte) -1, multivariateFunction7, goalType8, doubleArray11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), 0.0d }, 1.0E-15);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) (byte) 0, (double) ' ');
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass6 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) 0, (double) 2);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray16 = new double[] { (short) 0, (byte) -1, (byte) 1, (-1L), '4', (short) 10 };
        double[] doubleArray23 = new double[] { (byte) 0, (short) 1, '4', 1.0d, (short) 1, 10L };
        double[] doubleArray24 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair25 = bOBYQAOptimizer1.optimize((int) (byte) 10, multivariateFunction8, goalType9, doubleArray16, doubleArray23, doubleArray24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (1)");
        } catch (org.apache.commons.math.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.0d, (-1.0d), 1.0d, (-1.0d), 52.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 0.0d, 1.0d, 52.0d, 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        java.lang.Class<?> wildcardClass7 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ');
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray13 = new double[] { ' ', 1, '#', (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = bOBYQAOptimizer1.optimize(2, multivariateFunction7, goalType8, doubleArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 32.0d, 1.0d, 35.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) 'a', 1.0d);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) 0L, (double) (byte) 100);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray13 = new double[] { (short) 0, (short) 10, 1.0d, '4', (byte) 10, (byte) 10 };
        double[] doubleArray18 = new double[] { 'a', (short) 10, 10L, 0 };
        double[] doubleArray21 = new double[] { 2, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair22 = bOBYQAOptimizer3.optimize((int) (byte) -1, multivariateFunction5, goalType6, doubleArray13, doubleArray18, doubleArray21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 4 != 6");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, 10.0d, 1.0d, 52.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 97.0d, 10.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 2.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        int int7 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType9 = bOBYQAOptimizer1.getGoalType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(goalType9);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) (byte) 0, (double) ' ');
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        int int8 = bOBYQAOptimizer3.getMaxEvaluations();
        int int9 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, 100.0d, (double) 100.0f);
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) 1.0f, (double) 0);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray13 = new double[] { (byte) 0, (byte) 100, 0.0d, 1L, 2 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = bOBYQAOptimizer3.optimize((int) (short) 0, multivariateFunction6, goalType7, doubleArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, 100.0d, 0.0d, 1.0d, 2.0d }, 1.0E-15);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) (byte) -1, (double) (byte) 1);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray12 = new double[] { (-1L), 1.0d, 1.0d, '4', '4' };
        double[] doubleArray17 = new double[] { ' ', 100, (byte) -1, 1.0E-8d };
        double[] doubleArray22 = new double[] { (short) 100, 0.0d, (-1L), 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair23 = bOBYQAOptimizer3.optimize((int) (short) -1, multivariateFunction5, goalType6, doubleArray12, doubleArray17, doubleArray22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 4 != 5");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d), 1.0d, 1.0d, 52.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 32.0d, 100.0d, (-1.0d), 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d, 0.0d, (-1.0d), 1.0d }, 1.0E-15);
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) 10.0f, 100.0d);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray9 = new double[] { 10.0d };
        double[] doubleArray16 = new double[] { (short) 0, (short) 0, 1.0d, (-1.0f), 100.0f, (-1) };
        double[] doubleArray17 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair18 = bOBYQAOptimizer3.optimize((int) (short) 1, multivariateFunction6, goalType7, doubleArray9, doubleArray16, doubleArray17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 6 != 1");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.0d, 0.0d, 1.0d, (-1.0d), 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) (byte) 0, (double) ' ');
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        int int8 = bOBYQAOptimizer3.getEvaluations();
        int int9 = bOBYQAOptimizer3.getEvaluations();
        int int10 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker11 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker11);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) (short) 0, 0.0d);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ', (double) 2, 1.0d);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray7 = new double[] {};
        double[] doubleArray11 = new double[] { (byte) 100, 'a', 1L };
        double[] doubleArray16 = new double[] { (-1), 100, 100.0d, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair17 = bOBYQAOptimizer3.optimize(2, multivariateFunction5, goalType6, doubleArray7, doubleArray11, doubleArray16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 3 != 0");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, 97.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d), 100.0d, 100.0d, 32.0d }, 1.0E-15);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray8 = new double[] { (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = bOBYQAOptimizer1.optimize(100, multivariateFunction5, goalType6, doubleArray8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray10 = new double[] { 0 };
        double[] doubleArray15 = new double[] { 1.0E-8d, 2, 1.0E-8d, (short) -1 };
        double[] doubleArray16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair17 = bOBYQAOptimizer1.optimize(0, multivariateFunction7, goalType8, doubleArray10, doubleArray15, doubleArray16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 4 != 1");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0E-8d, 2.0d, 1.0E-8d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        int int7 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        double[] doubleArray16 = new double[] { 10L, 100.0f, 100.0f, ' ', 1 };
        double[] doubleArray21 = new double[] { (byte) 1, 0L, 100.0f, (-1L) };
        double[] doubleArray24 = new double[] { (byte) 0, 1.0E-8d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair25 = bOBYQAOptimizer1.optimize(100, multivariateFunction9, goalType10, doubleArray16, doubleArray21, doubleArray24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 4 != 5");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, 100.0d, 100.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 1.0d, 0.0d, 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 0.0d, 1.0E-8d }, 1.0E-15);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2, 100.0d, (double) (-1.0f));
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) (short) -1, (double) (-1L));
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        double[] doubleArray13 = new double[] { 1.0d, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = bOBYQAOptimizer3.optimize((int) ' ', multivariateFunction9, goalType10, doubleArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, (double) 1L, (double) (byte) 0);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray11 = new double[] { (-1.0f), (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = bOBYQAOptimizer3.optimize((int) (byte) 10, multivariateFunction7, goalType8, doubleArray11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), 1.0d }, 1.0E-15);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (-1L), (double) 10.0f);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1, (double) (-1), (double) (byte) 1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass5 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (double) 10L, 0.0d);
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) ' ', (double) 1L);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) '#', (double) (short) -1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray9 = new double[] { (byte) 1 };
        double[] doubleArray14 = new double[] { (byte) 1, 0.0f, ' ', 10.0f };
        double[] doubleArray17 = new double[] { (-1L), 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair18 = bOBYQAOptimizer3.optimize((int) (short) 1, multivariateFunction6, goalType7, doubleArray9, doubleArray14, doubleArray17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 4 != 1");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1.0d, 0.0d, 32.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-1.0d), 1.0d }, 1.0E-15);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) (short) -1, (double) (short) -1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray9 = new double[] { (byte) 100 };
        double[] doubleArray11 = new double[] { 100 };
        double[] doubleArray17 = new double[] { (short) 0, (-1.0f), 'a', 1.0f, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair18 = bOBYQAOptimizer3.optimize(0, multivariateFunction6, goalType7, doubleArray9, doubleArray11, doubleArray17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 5 != 1");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d, (-1.0d), 97.0d, 1.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) (byte) 0, (double) (byte) 1);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = bOBYQAOptimizer3.optimize((int) (byte) -1, multivariateFunction6, goalType7, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 10.0d, (double) (short) 0);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
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
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        int int7 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        double[] doubleArray13 = new double[] { (short) 10, '4' };
        double[] doubleArray18 = new double[] { 1, (short) 100, (byte) 0, (short) 100 };
        double[] doubleArray19 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair20 = bOBYQAOptimizer1.optimize((int) '#', multivariateFunction9, goalType10, doubleArray13, doubleArray18, doubleArray19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 4 != 2");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 1.0d, 100.0d, 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, 0.0d, (double) 1.0f);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
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
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) (-1.0f), (double) (short) 1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) 100, 0.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, 0.0d, (double) (short) 0);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray9 = new double[] { 100, 2 };
        double[] doubleArray15 = new double[] { (-1.0f), 'a', 10.0f, 1.0E-8d, 1.0f };
        double[] doubleArray22 = new double[] { (-1), 1L, (-1), 10.0d, 10.0d, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair23 = bOBYQAOptimizer3.optimize((int) 'a', multivariateFunction5, goalType6, doubleArray9, doubleArray15, doubleArray22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 5 != 2");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d, 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d), 97.0d, 10.0d, 1.0E-8d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { (-1.0d), 1.0d, (-1.0d), 10.0d, 10.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), 1.0d, (double) (byte) 0);
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) (byte) 0, (double) ' ');
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray13 = new double[] { (short) 1, 1.0f, 10L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = bOBYQAOptimizer3.optimize(0, multivariateFunction8, goalType9, doubleArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0d, 1.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) 10L, (double) ' ');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (byte) -1, (double) (short) 100);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        int int7 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType9 = bOBYQAOptimizer1.getGoalType();
        int int10 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker11 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType12 = bOBYQAOptimizer1.getGoalType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker11);
        org.junit.Assert.assertNull(goalType12);
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1, (double) (byte) 0, (double) (short) 0);
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, 100.0d, (double) 100);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass7 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100, (double) (byte) 1, (double) 1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) 2, (double) 10);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray11 = new double[] { 2, (short) 1, (-1L), 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair12 = bOBYQAOptimizer3.optimize(10, multivariateFunction5, goalType6, doubleArray11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 2.0d, 1.0d, (-1.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        java.lang.Class<?> wildcardClass8 = realPointValuePairConvergenceChecker7.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, 1.0d, (double) 0L);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, 0.0d, (double) (-1L));
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker9 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker9);
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', 1.0E-8d, (double) (short) 0);
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (double) (byte) 10, (double) 100.0f);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', 0.0d, 10.0d);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray12 = new double[] { 100.0d, 1.0E-8d, 100.0f, (byte) 0, 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair13 = bOBYQAOptimizer3.optimize((int) (byte) 10, multivariateFunction5, goalType6, doubleArray12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 1.0E-8d, 100.0d, 0.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 10, (double) (-1L), (double) 100);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass6 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) 0, (double) (short) -1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#');
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) '4', (double) 0L);
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) 1.0f, 1.0E-8d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ', (double) (short) 100, (double) '#');
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 1.0E-8d, (double) 1L);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        java.lang.Class<?> wildcardClass8 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), 0.0d, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, 10.0d, (double) (short) 0);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer3.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = goalType8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(goalType8);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
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
        int int12 = bOBYQAOptimizer1.getMaxEvaluations();
        int int13 = bOBYQAOptimizer1.getMaxEvaluations();
        int int14 = bOBYQAOptimizer1.getEvaluations();
        int int15 = bOBYQAOptimizer1.getEvaluations();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        int int8 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType9 = bOBYQAOptimizer1.getGoalType();
        int int10 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction12 = null;
        org.apache.commons.math.optimization.GoalType goalType13 = null;
        double[] doubleArray18 = new double[] { 0.0d, 1, 1.0E-8d, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair19 = bOBYQAOptimizer1.optimize((int) (byte) 1, multivariateFunction12, goalType13, doubleArray18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 0.0d, 1.0d, 1.0E-8d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) (short) 100, (double) (byte) 0);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) (-1.0f), (double) (byte) -1);
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (-1.0d), (double) (short) 1);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) 1L, (double) 10.0f);
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (-1), (double) (short) 0);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) (byte) 0, (double) 100);
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, 10.0d, (double) (byte) 1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray13 = new double[] { (short) 0, (short) 100, (short) -1, 0, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = bOBYQAOptimizer3.optimize((int) ' ', multivariateFunction6, goalType7, doubleArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, 100.0d, (-1.0d), 0.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) (byte) 10, (double) 1);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, 10.0d, (double) 1L);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) 10, (double) 100);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray10 = new double[] { 100.0d, 10L, 0 };
        double[] doubleArray13 = new double[] { 1L, 'a' };
        double[] doubleArray15 = new double[] { 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = bOBYQAOptimizer3.optimize((int) (short) 0, multivariateFunction5, goalType6, doubleArray10, doubleArray13, doubleArray15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 2 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, 0.0d, (double) 10.0f);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) 0.0f, (double) (-1L));
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, 100.0d, (double) 100);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        double[] doubleArray14 = new double[] { (-1.0d), 1.0E-8d, 100 };
        double[] doubleArray15 = new double[] {};
        double[] doubleArray21 = new double[] { 1, (short) 0, 1.0E-8d, 100, 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair22 = bOBYQAOptimizer3.optimize(1, multivariateFunction9, goalType10, doubleArray14, doubleArray15, doubleArray21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 0 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d), 1.0E-8d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 1.0d, 0.0d, 1.0E-8d, 100.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (double) '#', (double) (short) 100);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) 100, (double) (-1.0f));
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray10 = new double[] { (-1.0d), 1.0f, 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair11 = bOBYQAOptimizer3.optimize(0, multivariateFunction5, goalType6, doubleArray10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), 1.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) '#', (double) (short) -1);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (-1.0d), (double) 1L);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (double) 0L, (double) 100L);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray15 = new double[] { 0, 0.0f, 1.0d, 1.0f, (short) 100, '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = bOBYQAOptimizer3.optimize((int) (short) 1, multivariateFunction7, goalType8, doubleArray15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d, 0.0d, 1.0d, 1.0d, 100.0d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) 'a', (double) (byte) -1);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, 0.0d, (double) 'a');
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, (double) (byte) -1, 100.0d);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray13 = new double[] { 100, 1, 100, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair14 = bOBYQAOptimizer3.optimize((int) 'a', multivariateFunction7, goalType8, doubleArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d, 1.0d, 100.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        int int7 = bOBYQAOptimizer1.getEvaluations();
        java.lang.Class<?> wildcardClass8 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4', (double) (short) 10, (double) (short) 0);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) (byte) 0, (double) ' ');
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        int int8 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker9 = bOBYQAOptimizer3.getConvergenceChecker();
        int int10 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction12 = null;
        org.apache.commons.math.optimization.GoalType goalType13 = null;
        double[] doubleArray18 = new double[] { 100L, '4', 'a', '4' };
        double[] doubleArray20 = new double[] { 10.0d };
        double[] doubleArray23 = new double[] { (short) 1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair24 = bOBYQAOptimizer3.optimize((int) (short) 100, multivariateFunction12, goalType13, doubleArray18, doubleArray20, doubleArray23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 4");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 52.0d, 97.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) '4', (double) 100L);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass6 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) 1.0f, (double) 1L);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (double) (-1L), 0.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4', (double) (short) 10, (double) (short) 0);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4', (double) (-1), 1.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        java.lang.Class<?> wildcardClass7 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) 0, (double) 100.0f);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 100);
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 100, 1.0d, (double) 100.0f);
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) 100.0f, (double) 2);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        int int8 = bOBYQAOptimizer1.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ', (double) 100L, (double) 100.0f);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray12 = new double[] { 0.0f, 10.0d, (short) 0, 100L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair13 = bOBYQAOptimizer3.optimize((int) (short) 0, multivariateFunction6, goalType7, doubleArray12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, 10.0d, 0.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (double) 1L, (double) 10);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        int int7 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer1.getConvergenceChecker();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertNull(goalType9);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray14 = new double[] { '#', 2, 1.0f, (short) 1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair15 = bOBYQAOptimizer1.optimize((int) 'a', multivariateFunction7, goalType8, doubleArray14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 35.0d, 2.0d, 1.0d, 1.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', (double) (-1L), (double) 10);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNull(goalType8);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, 10.0d, (double) 10);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) 2, (double) 10.0f);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass5 = realPointValuePairConvergenceChecker4.getClass();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (-1.0f), (double) ' ');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray15 = new double[] { 1.0E-8d, (short) 0, 10L, 0.0d, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = bOBYQAOptimizer3.optimize((int) ' ', multivariateFunction7, goalType8, doubleArray15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0E-8d, 0.0d, 10.0d, 0.0d, 10.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) (-1L), 0.0d);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 10, (-1.0d), (-1.0d));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, 0.0d, (double) 'a');
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (double) 1.0f, (double) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray12 = new double[] { (byte) -1, 10.0f };
        double[] doubleArray15 = new double[] { (-1), 1.0f };
        double[] doubleArray22 = new double[] { 10L, 10, 0L, (byte) -1, '#', 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair23 = bOBYQAOptimizer3.optimize(100, multivariateFunction8, goalType9, doubleArray12, doubleArray15, doubleArray22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 6 != 2");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 10.0d, 10.0d, 0.0d, (-1.0d), 35.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) 10.0f, (double) '4');
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) (byte) 100, 1.0E-8d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker9 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction11 = null;
        org.apache.commons.math.optimization.GoalType goalType12 = null;
        double[] doubleArray16 = new double[] { (short) 100, (short) 10, 100.0f };
        double[] doubleArray20 = new double[] { 2, (short) -1, (byte) 100 };
        double[] doubleArray25 = new double[] { '#', (short) 100, 1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair26 = bOBYQAOptimizer1.optimize(0, multivariateFunction11, goalType12, doubleArray16, doubleArray20, doubleArray25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 4 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker9);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 2.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 35.0d, 100.0d, 1.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) ' ');
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker7 = bOBYQAOptimizer1.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker7);
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, 0.0d, 0.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray12 = new double[] { 100L, 1.0d, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair13 = bOBYQAOptimizer3.optimize(10, multivariateFunction7, goalType8, doubleArray12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 1.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction3 = null;
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        double[] doubleArray7 = new double[] { 2, (short) 100 };
        double[] doubleArray8 = new double[] {};
        double[] doubleArray10 = new double[] { 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair11 = bOBYQAOptimizer1.optimize(1, multivariateFunction3, goalType4, doubleArray7, doubleArray8, doubleArray10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 0 != 2");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 2.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a');
        int int2 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        int int6 = bOBYQAOptimizer1.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, (double) (-1L), (double) 1);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray8 = new double[] { 2 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair9 = bOBYQAOptimizer3.optimize(0, multivariateFunction5, goalType6, doubleArray8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 2.0d }, 1.0E-15);
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(1, (double) '4', 1.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((-1), (double) (short) 1, (double) (-1.0f));
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) 0L, 1.0d);
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        int int3 = bOBYQAOptimizer1.getMaxEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray9 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair10 = bOBYQAOptimizer1.optimize((int) (byte) 1, multivariateFunction7, goalType8, doubleArray9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, 0.0d, (double) (-1L));
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer3.getGoalType();
        int int8 = bOBYQAOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass9 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.GoalType goalType2 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker3 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        double[] doubleArray10 = new double[] { (byte) 10 };
        double[] doubleArray12 = new double[] { (-1.0d) };
        double[] doubleArray16 = new double[] { (short) -1, 10, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair17 = bOBYQAOptimizer1.optimize((int) (short) 10, multivariateFunction7, goalType8, doubleArray10, doubleArray12, doubleArray16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 3 != 1");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d), 10.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) 2, (double) (byte) -1);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1);
        int int2 = bOBYQAOptimizer1.getEvaluations();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer1.getConvergenceChecker();
        int int7 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType9 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType10 = bOBYQAOptimizer1.getGoalType();
        int int11 = bOBYQAOptimizer1.getEvaluations();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) (short) 1, (double) (byte) 0);
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 0, (double) (-1L), (double) 0L);
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) -1, (double) 1.0f, 1.0E-8d);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType7 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4');
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker2 = bOBYQAOptimizer1.getConvergenceChecker();
        int int3 = bOBYQAOptimizer1.getEvaluations();
        int int4 = bOBYQAOptimizer1.getEvaluations();
        int int5 = bOBYQAOptimizer1.getEvaluations();
        int int6 = bOBYQAOptimizer1.getEvaluations();
        java.lang.Class<?> wildcardClass7 = bOBYQAOptimizer1.getClass();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) 'a', (double) (-1L), (double) 10);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray10 = new double[] {};
        double[] doubleArray12 = new double[] { 1.0E-8d };
        double[] doubleArray15 = new double[] { 0L, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = bOBYQAOptimizer3.optimize((int) (short) 10, multivariateFunction8, goalType9, doubleArray10, doubleArray12, doubleArray15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 1 != 0");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2, (double) ' ', (double) 1.0f);
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        double[] doubleArray9 = new double[] { 0.0f, (-1.0f) };
        double[] doubleArray15 = new double[] { 100.0d, (-1), (short) 1, 0.0d, (-1L) };
        double[] doubleArray18 = new double[] { '4', (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair19 = bOBYQAOptimizer3.optimize((int) (short) 0, multivariateFunction5, goalType6, doubleArray9, doubleArray15, doubleArray18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 5 != 2");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d, (-1.0d), 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 52.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) '#', 0.0d);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (byte) 1, (double) (-1), 1.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker8 = bOBYQAOptimizer3.getConvergenceChecker();
        int int9 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType10 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4', (double) (short) 10, (double) 1.0f);
        int int4 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) (-1.0f), (double) ' ');
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        int int7 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (short) 0, (short) 10 };
        double[] doubleArray21 = new double[] { 0.0f, 1.0d, 0.0f, 100.0d, (byte) 1, 1.0E-8d };
        double[] doubleArray22 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair23 = bOBYQAOptimizer3.optimize((int) (byte) 10, multivariateFunction9, goalType10, doubleArray14, doubleArray21, doubleArray22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 6 != 3");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 0.0d, 1.0d, 0.0d, 100.0d, 1.0d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) '4', (double) 1);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker5 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker6 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker6);
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(2, (double) 10.0f, (double) 10);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(10, (double) (short) 0, (double) 2);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 10, (-1.0d), (double) (byte) 10);
        java.lang.Class<?> wildcardClass4 = bOBYQAOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, (double) 10, 10.0d);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        int int6 = bOBYQAOptimizer3.getMaxEvaluations();
        int int7 = bOBYQAOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(100, 10.0d, (double) (short) 0);
        org.apache.commons.math.optimization.GoalType goalType4 = bOBYQAOptimizer3.getGoalType();
        int int5 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer3.getGoalType();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        double[] doubleArray16 = new double[] { 1, 100L, 'a', 100L, 0L, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair17 = bOBYQAOptimizer3.optimize((int) (byte) 1, multivariateFunction8, goalType9, doubleArray16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 1.0d, 100.0d, 97.0d, 100.0d, 0.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '#', (double) (-1L), (double) (-1));
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.apache.commons.math.optimization.GoalType goalType5 = bOBYQAOptimizer3.getGoalType();
        int int6 = bOBYQAOptimizer3.getEvaluations();
        int int7 = bOBYQAOptimizer3.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer3.getGoalType();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) '4', (double) 2, 1.0d);
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 1, (double) (short) 100, (double) 1.0f);
        int int4 = bOBYQAOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        double[] doubleArray9 = new double[] { '4' };
        double[] doubleArray12 = new double[] { '4', (byte) -1 };
        double[] doubleArray14 = new double[] { 1.0E-8d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair15 = bOBYQAOptimizer3.optimize((int) (short) -1, multivariateFunction6, goalType7, doubleArray9, doubleArray12, doubleArray14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 2 != 1");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 52.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1.0E-8d }, 1.0E-15);
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer1 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) -1);
        int int2 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker4 = bOBYQAOptimizer1.getConvergenceChecker();
        int int5 = bOBYQAOptimizer1.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = bOBYQAOptimizer1.getGoalType();
        int int7 = bOBYQAOptimizer1.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType8 = bOBYQAOptimizer1.getGoalType();
        org.apache.commons.math.optimization.ConvergenceChecker<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairConvergenceChecker9 = bOBYQAOptimizer1.getConvergenceChecker();
        org.apache.commons.math.analysis.MultivariateFunction multivariateFunction11 = null;
        org.apache.commons.math.optimization.GoalType goalType12 = null;
        double[] doubleArray14 = new double[] { 10.0d };
        double[] doubleArray20 = new double[] { 100, (byte) 100, 1.0E-8d, (byte) 0, 0L };
        double[] doubleArray25 = new double[] { 100.0f, 100L, 100, 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair26 = bOBYQAOptimizer1.optimize((int) 'a', multivariateFunction11, goalType12, doubleArray14, doubleArray20, doubleArray25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.DimensionMismatchException; message: 5 != 1");
        } catch (org.apache.commons.math.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNotNull(realPointValuePairConvergenceChecker9);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d, 100.0d, 1.0E-8d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 100.0d, 100.0d, 100.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer((int) (short) 0, (double) 1.0f, (double) 1);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        org.apache.commons.math.optimization.direct.BOBYQAOptimizer bOBYQAOptimizer3 = new org.apache.commons.math.optimization.direct.BOBYQAOptimizer(0, (double) (-1L), (double) (byte) 100);
    }
}

