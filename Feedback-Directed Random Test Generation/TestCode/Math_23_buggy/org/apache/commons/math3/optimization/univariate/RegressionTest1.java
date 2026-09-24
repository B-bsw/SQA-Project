package org.apache.commons.math3.optimization.univariate;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getMax();
        double double10 = brentOptimizer3.getMin();
        int int11 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer3.optimize((int) (short) 100, univariateFunction13, goalType14, (double) '4', (double) (-1L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        double double5 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer2.getConvergenceChecker();
        int int8 = brentOptimizer2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        double double9 = brentOptimizer3.getMin();
        int int10 = brentOptimizer3.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1.0f, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        double double5 = brentOptimizer2.getMin();
        double double6 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math3.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair12 = brentOptimizer2.optimize(10, univariateFunction8, goalType9, (double) (-1.0f), (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        int int10 = brentOptimizer3.getEvaluations();
        int int11 = brentOptimizer3.getEvaluations();
        int int12 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction14 = null;
        org.apache.commons.math3.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair18 = brentOptimizer3.optimize((int) (byte) -1, univariateFunction14, goalType15, (double) 100.0f, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        double double11 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair18 = brentOptimizer3.optimize((int) (short) 10, univariateFunction13, goalType14, (double) (short) 100, (double) 1L, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer3.optimize((int) ' ', univariateFunction9, goalType10, (double) (-1.0f), (double) '#', 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair15 = brentOptimizer3.optimize((int) '4', univariateFunction11, goalType12, (double) 0, (double) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        java.lang.Class<?> wildcardClass6 = brentOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, 1.0d);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        int int4 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        int int6 = brentOptimizer2.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair7 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair3 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getMax();
        int int6 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math3.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair12 = brentOptimizer2.optimize((int) 'a', univariateFunction8, goalType9, (double) (byte) 10, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        double double9 = brentOptimizer3.getMax();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair10 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMax();
        double double10 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize((int) (short) 100, univariateFunction12, goalType13, (double) '4', (double) 1L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10, (double) 10L);
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction4 = null;
        org.apache.commons.math3.optimization.GoalType goalType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair8 = brentOptimizer2.optimize((-1), univariateFunction4, goalType5, (double) (-1), (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        double double8 = brentOptimizer3.getMax();
        int int9 = brentOptimizer3.getMaxEvaluations();
        double double10 = brentOptimizer3.getStartValue();
        double double11 = brentOptimizer3.getMin();
        int int12 = brentOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass13 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        double double6 = brentOptimizer3.getMax();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair7 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math3.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair15 = brentOptimizer3.optimize((int) '4', univariateFunction10, goalType11, (double) (-1.0f), (double) 100L, 10.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1.0f, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getMax();
        double double9 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair15 = brentOptimizer3.optimize((int) 'a', univariateFunction11, goalType12, (double) (short) 0, (double) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        int int8 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        java.lang.Class<?> wildcardClass10 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(1.0d, (double) 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize((int) (short) 1, univariateFunction12, goalType13, (double) 'a', (double) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        java.lang.Class<?> wildcardClass8 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) -1, (double) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        int int8 = brentOptimizer3.getEvaluations();
        int int9 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize(100, univariateFunction12, goalType13, (double) 10, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 0, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        double double8 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        int int10 = brentOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass11 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1.0f, (double) 'a');
        int int3 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math3.optimization.GoalType goalType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair10 = brentOptimizer2.optimize((int) '4', univariateFunction5, goalType6, (double) (short) -1, (double) 0, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        double double7 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair13 = brentOptimizer3.optimize(10, univariateFunction9, goalType10, (double) 10, (double) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        int int8 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair12 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        double double12 = brentOptimizer3.getMin();
        double double13 = brentOptimizer3.getMax();
        int int14 = brentOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass15 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 0, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        int int8 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        double double10 = brentOptimizer3.getMin();
        java.lang.Class<?> wildcardClass11 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 10.0f);
        double double3 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair10 = brentOptimizer2.optimize((int) (byte) 1, univariateFunction6, goalType7, (double) (short) -1, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) ' ', (double) 0, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) '4', (double) '#', univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        java.lang.Class<?> wildcardClass6 = brentOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) (byte) 1);
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction4 = null;
        org.apache.commons.math3.optimization.GoalType goalType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair8 = brentOptimizer2.optimize((int) (byte) 0, univariateFunction4, goalType5, (double) (byte) 1, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math3.optimization.GoalType goalType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair10 = brentOptimizer2.optimize((int) '#', univariateFunction5, goalType6, (double) (short) 1, (double) ' ', (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) '#', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        int int6 = brentOptimizer3.getEvaluations();
        double double7 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (-1.0f), (double) 1L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        double double4 = brentOptimizer2.getStartValue();
        double double5 = brentOptimizer2.getStartValue();
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 0L, (double) 1, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 10.0f);
        double double3 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = univariatePointValuePairConvergenceChecker5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10.0f, (double) 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        double double9 = brentOptimizer3.getMin();
        double double10 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer3.optimize((-1), univariateFunction12, goalType13, 1.0d, (double) (-1L), (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getEvaluations();
        double double8 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math3.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer3.optimize((int) ' ', univariateFunction10, goalType11, (double) 10L, (double) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getStartValue();
        double double10 = brentOptimizer3.getMin();
        double double11 = brentOptimizer3.getMax();
        int int12 = brentOptimizer3.getMaxEvaluations();
        int int13 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction15 = null;
        org.apache.commons.math3.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair19 = brentOptimizer3.optimize((int) (short) 1, univariateFunction15, goalType16, (double) (byte) 100, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getStartValue();
        double double10 = brentOptimizer3.getMin();
        double double11 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer3.optimize(100, univariateFunction13, goalType14, (double) (byte) 100, (double) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMin();
        int int8 = brentOptimizer3.getEvaluations();
        double double9 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize((int) (short) -1, univariateFunction11, goalType12, (double) 'a', 100.0d, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMin();
        int int10 = brentOptimizer3.getMaxEvaluations();
        double double11 = brentOptimizer3.getMin();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair12 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        double double8 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        double double10 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
        double double12 = brentOptimizer3.getMin();
        java.lang.Class<?> wildcardClass13 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100, (double) ' ', univariatePointValuePairConvergenceChecker2);
        java.lang.Class<?> wildcardClass4 = brentOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) '#', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        int int6 = brentOptimizer3.getEvaluations();
        double double7 = brentOptimizer3.getMax();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        double double8 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        double double10 = brentOptimizer3.getMin();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        int int11 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType12 = brentOptimizer3.getGoalType();
        int int13 = brentOptimizer3.getMaxEvaluations();
        int int14 = brentOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass15 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        double double8 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        double double10 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize(10, univariateFunction12, goalType13, (double) (byte) 10, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        int int6 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer2.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = univariatePointValuePairConvergenceChecker7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) ' ', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer3.optimize((int) 'a', univariateFunction6, goalType7, (double) 1L, (double) 0, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1.0f, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer3.optimize((int) (short) 0, univariateFunction9, goalType10, 10.0d, (double) 10L, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        int int11 = brentOptimizer3.getEvaluations();
        double double12 = brentOptimizer3.getMax();
        int int13 = brentOptimizer3.getEvaluations();
        int int14 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType15 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(goalType15);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize(0, univariateFunction11, goalType12, (double) (short) 1, (double) (short) 1, (double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMin();
        int int8 = brentOptimizer3.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair9 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        double double8 = brentOptimizer3.getMax();
        double double9 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        java.lang.Class<?> wildcardClass12 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        double double8 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        double double10 = brentOptimizer3.getStartValue();
        double double11 = brentOptimizer3.getStartValue();
        double double12 = brentOptimizer3.getMax();
        double double13 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction15 = null;
        org.apache.commons.math3.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair19 = brentOptimizer3.optimize((int) (short) 10, univariateFunction15, goalType16, (double) 1.0f, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        int int9 = brentOptimizer3.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair10 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        int int11 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType12 = brentOptimizer3.getGoalType();
        int int13 = brentOptimizer3.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10, (double) 1L, univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer3.optimize(0, univariateFunction6, goalType7, 1.0d, (double) (-1.0f), (double) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMin();
        int int10 = brentOptimizer3.getMaxEvaluations();
        double double11 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass13 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        int int9 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair15 = brentOptimizer3.optimize(1, univariateFunction11, goalType12, (double) 10, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getMin();
        double double6 = brentOptimizer2.getMax();
        double double7 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair13 = brentOptimizer2.optimize((int) (short) 0, univariateFunction9, goalType10, (double) 100, (double) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        double double8 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math3.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer3.optimize((int) (short) 0, univariateFunction10, goalType11, (double) (short) 0, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) '4', (double) (short) 0, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMin();
        int int10 = brentOptimizer3.getMaxEvaluations();
        double double11 = brentOptimizer3.getMin();
        double double12 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction14 = null;
        org.apache.commons.math3.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair19 = brentOptimizer3.optimize(0, univariateFunction14, goalType15, (double) (short) 100, (double) '4', (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 0.0f, (double) (short) 100, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        double double9 = brentOptimizer3.getMin();
        int int10 = brentOptimizer3.getEvaluations();
        double double11 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer3.optimize((int) ' ', univariateFunction13, goalType14, (double) ' ', (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        int int8 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        double double11 = brentOptimizer3.getMin();
        java.lang.Class<?> wildcardClass12 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10L, (double) 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 0.0f, (double) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMax();
        int int8 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math3.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair15 = brentOptimizer3.optimize((int) (byte) -1, univariateFunction10, goalType11, (double) (byte) 100, (double) (short) 0, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        int int12 = brentOptimizer3.getMaxEvaluations();
        double double13 = brentOptimizer3.getStartValue();
        double double14 = brentOptimizer3.getMax();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair15 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        int int6 = brentOptimizer2.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair7 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        double double8 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        double double10 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
        int int12 = brentOptimizer3.getEvaluations();
        double double13 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction15 = null;
        org.apache.commons.math3.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair20 = brentOptimizer3.optimize((int) (byte) -1, univariateFunction15, goalType16, (double) 10L, (double) 1.0f, (double) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100, (double) (-1.0f), univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        double double7 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair9 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 1, (double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        double double9 = brentOptimizer3.getMin();
        double double10 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer3.optimize(0, univariateFunction12, goalType13, (double) 100, (double) '4', (double) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getMin();
        int int6 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer2.optimize((int) (short) 100, univariateFunction9, goalType10, (double) 10L, (double) (-1.0f), (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((-1.0d), (double) 10, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        double double5 = brentOptimizer2.getMin();
        java.lang.Class<?> wildcardClass6 = brentOptimizer2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMax();
        double double10 = brentOptimizer3.getMin();
        int int11 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer3.optimize((int) (short) 1, univariateFunction13, goalType14, (double) (short) 10, (double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        double double6 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math3.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair13 = brentOptimizer3.optimize(1, univariateFunction8, goalType9, (double) '4', (double) 0L, 1.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair12 = brentOptimizer3.optimize((int) (byte) -1, univariateFunction7, goalType8, (double) 10, 0.0d, (double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        double double8 = brentOptimizer3.getMax();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair9 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) '4', (double) (-1.0f), univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) '4', (double) '#', univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair12 = brentOptimizer3.optimize(100, univariateFunction7, goalType8, (double) (byte) 10, 0.0d, (double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 100, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer3.optimize((int) (short) -1, univariateFunction7, goalType8, (double) (short) 0, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 0L, (double) (short) 10, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(1.0d, 10.0d);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        int int4 = brentOptimizer2.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair5 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer3.optimize(10, univariateFunction9, goalType10, 0.0d, (double) (-1L), (double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        int int8 = brentOptimizer3.getMaxEvaluations();
        double double9 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair15 = brentOptimizer3.optimize((int) (byte) 0, univariateFunction11, goalType12, (double) 'a', (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (-1.0f), (double) (short) 1, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 0.0f, (double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10, (double) 1L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math3.optimization.GoalType goalType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair9 = brentOptimizer3.optimize((int) (byte) -1, univariateFunction5, goalType6, (double) (-1), (double) 1L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (-1.0f), (double) 100, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        int int11 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType12 = brentOptimizer3.getGoalType();
        int int13 = brentOptimizer3.getMaxEvaluations();
        double double14 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction16 = null;
        org.apache.commons.math3.optimization.GoalType goalType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair21 = brentOptimizer3.optimize((int) ' ', univariateFunction16, goalType17, 10.0d, (double) (short) 0, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 0, (double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(1.0d, 10.0d);
        java.lang.Class<?> wildcardClass3 = brentOptimizer2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(1.0d, 10.0d);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        int int4 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer2.optimize(100, univariateFunction7, goalType8, 100.0d, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        int int10 = brentOptimizer3.getEvaluations();
        int int11 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair18 = brentOptimizer3.optimize((int) (short) 1, univariateFunction13, goalType14, 0.0d, (-1.0d), (double) 1L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, 1.0d);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        double double4 = brentOptimizer2.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer2.optimize((int) (byte) 1, univariateFunction6, goalType7, (double) 10.0f, (double) 1L, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        int int8 = brentOptimizer3.getEvaluations();
        int int9 = brentOptimizer3.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair10 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        int int6 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer3.optimize((int) (short) 1, univariateFunction9, goalType10, (double) (short) 1, (double) ' ', (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (-1), (double) 1, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        int int12 = brentOptimizer3.getMaxEvaluations();
        double double13 = brentOptimizer3.getStartValue();
        double double14 = brentOptimizer3.getMax();
        double double15 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction17 = null;
        org.apache.commons.math3.optimization.GoalType goalType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair22 = brentOptimizer3.optimize(0, univariateFunction17, goalType18, (double) 'a', (double) 1.0f, (double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        double double6 = brentOptimizer3.getMin();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        double double10 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize((int) (byte) 100, univariateFunction12, goalType13, (double) '#', (double) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, (double) ' ', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        double double5 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair12 = brentOptimizer3.optimize((int) (short) 0, univariateFunction7, goalType8, (double) (-1L), (double) 100L, (double) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        int int5 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass7 = brentOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 10, (double) 'a');
        int int3 = brentOptimizer2.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair4 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        double double8 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        double double10 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
        int int12 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType13 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction15 = null;
        org.apache.commons.math3.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair20 = brentOptimizer3.optimize(100, univariateFunction15, goalType16, (double) 100.0f, (double) 100.0f, 1.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(goalType13);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, 1.0d);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        java.lang.Class<?> wildcardClass5 = brentOptimizer2.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMin();
        int int10 = brentOptimizer3.getMaxEvaluations();
        double double11 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction14 = null;
        org.apache.commons.math3.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair19 = brentOptimizer3.optimize((-1), univariateFunction14, goalType15, 10.0d, (double) (byte) 1, (double) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10.0f, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize((int) (byte) 1, univariateFunction12, goalType13, (double) 1L, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 100, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        double double8 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        double double10 = brentOptimizer3.getMin();
        java.lang.Class<?> wildcardClass11 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(0.0d, 0.0d, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) '4');
        double double3 = brentOptimizer2.getStartValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1);
        java.lang.Class<?> wildcardClass3 = brentOptimizer2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(0.0d, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getMax();
        double double9 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        int int11 = brentOptimizer3.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair12 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 10, (double) ' ');
        double double3 = brentOptimizer2.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math3.optimization.GoalType goalType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair9 = brentOptimizer2.optimize((int) '#', univariateFunction5, goalType6, (-1.0d), (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair18 = brentOptimizer3.optimize((int) (byte) 1, univariateFunction13, goalType14, (double) (short) 100, 100.0d, 100.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 10, (double) 10.0f);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math3.optimization.GoalType goalType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair10 = brentOptimizer2.optimize((int) (byte) -1, univariateFunction5, goalType6, (double) (byte) 0, (double) (byte) 0, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType3);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        double double8 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        double double10 = brentOptimizer3.getMax();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) '#', (double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize((int) ' ', univariateFunction11, goalType12, (-1.0d), 10.0d, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getMax();
        java.lang.Class<?> wildcardClass9 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        double double8 = brentOptimizer3.getMin();
        java.lang.Class<?> wildcardClass9 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 0.0f, (double) (short) 10, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, 1.0d);
        int int3 = brentOptimizer2.getMaxEvaluations();
        java.lang.Class<?> wildcardClass4 = brentOptimizer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        int int5 = brentOptimizer2.getEvaluations();
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMin();
        int int8 = brentOptimizer3.getEvaluations();
        double double9 = brentOptimizer3.getMin();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair10 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction4 = null;
        org.apache.commons.math3.optimization.GoalType goalType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair8 = brentOptimizer2.optimize((int) (short) 100, univariateFunction4, goalType5, (double) (byte) 1, (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        int int9 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        int int11 = brentOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass12 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        double double8 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        int int10 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = goalType11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(goalType11);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (-1.0f), (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10.0f, 10.0d, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math3.optimization.GoalType goalType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair9 = brentOptimizer3.optimize((int) (byte) 0, univariateFunction5, goalType6, (double) (byte) 0, (double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        double double4 = brentOptimizer2.getMin();
        int int5 = brentOptimizer2.getEvaluations();
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getMax();
        double double9 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        double double11 = brentOptimizer3.getStartValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair12 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) (byte) -1, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        int int6 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer2.getConvergenceChecker();
        double double9 = brentOptimizer2.getStartValue();
        int int10 = brentOptimizer2.getMaxEvaluations();
        java.lang.Class<?> wildcardClass11 = brentOptimizer2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        double double8 = brentOptimizer3.getMax();
        int int9 = brentOptimizer3.getEvaluations();
        double double10 = brentOptimizer3.getStartValue();
        double double11 = brentOptimizer3.getMin();
        java.lang.Class<?> wildcardClass12 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        int int8 = brentOptimizer3.getMaxEvaluations();
        double double9 = brentOptimizer3.getStartValue();
        double double10 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = goalType11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(goalType11);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 1, (double) 100.0f, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math3.optimization.GoalType goalType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair10 = brentOptimizer3.optimize(1, univariateFunction5, goalType6, (double) (short) -1, 0.0d, 10.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        int int6 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = univariatePointValuePairConvergenceChecker7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        int int3 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer2.optimize(0, univariateFunction6, goalType7, (double) ' ', (double) 100.0f, (double) 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        double double6 = brentOptimizer3.getStartValue();
        java.lang.Class<?> wildcardClass7 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMin();
        int int10 = brentOptimizer3.getMaxEvaluations();
        double double11 = brentOptimizer3.getStartValue();
        java.lang.Class<?> wildcardClass12 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 0, (double) 10.0f, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        double double8 = brentOptimizer3.getMax();
        int int9 = brentOptimizer3.getMaxEvaluations();
        double double10 = brentOptimizer3.getStartValue();
        double double11 = brentOptimizer3.getStartValue();
        java.lang.Class<?> wildcardClass12 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        int int8 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        double double10 = brentOptimizer3.getMax();
        int int11 = brentOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass12 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10L, (double) 0L, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 0.0f, (double) 0.0f, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (-1), (double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        int int9 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer3.optimize((int) (short) 10, univariateFunction13, goalType14, (double) (-1L), (double) 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        double double6 = brentOptimizer3.getMin();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair13 = brentOptimizer3.optimize((int) (short) 0, univariateFunction9, goalType10, (double) (short) 1, (double) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        int int9 = brentOptimizer3.getEvaluations();
        int int10 = brentOptimizer3.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        int int8 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize((-1), univariateFunction12, goalType13, (double) 10, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, 1.0d);
        int int3 = brentOptimizer2.getMaxEvaluations();
        double double4 = brentOptimizer2.getMin();
        java.lang.Class<?> wildcardClass5 = brentOptimizer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        double double8 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        double double10 = brentOptimizer3.getStartValue();
        double double11 = brentOptimizer3.getStartValue();
        double double12 = brentOptimizer3.getMax();
        double double13 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction15 = null;
        org.apache.commons.math3.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair20 = brentOptimizer3.optimize(10, univariateFunction15, goalType16, (double) (byte) 1, (double) (byte) -1, (double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(0.0d, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (-1.0f), (double) (-1), univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        double double8 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        double double10 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize((int) (short) -1, univariateFunction12, goalType13, (double) '#', (double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        double double8 = brentOptimizer3.getMax();
        int int9 = brentOptimizer3.getEvaluations();
        double double10 = brentOptimizer3.getStartValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) ' ', (double) '#', univariatePointValuePairConvergenceChecker2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair4 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        int int11 = brentOptimizer3.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair12 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        double double8 = brentOptimizer3.getMin();
        int int9 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize(0, univariateFunction11, goalType12, (double) (short) 1, (double) '4', (double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(1.0d, 10.0d);
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction4 = null;
        org.apache.commons.math3.optimization.GoalType goalType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair8 = brentOptimizer2.optimize((int) (short) 100, univariateFunction4, goalType5, (double) (byte) 0, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        int int8 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math3.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair15 = brentOptimizer3.optimize(10, univariateFunction10, goalType11, (double) ' ', 1.0d, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, (double) ' ', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        double double5 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair12 = brentOptimizer3.optimize((int) (byte) 1, univariateFunction7, goalType8, (double) (-1), (double) (short) -1, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        int int9 = brentOptimizer3.getMaxEvaluations();
        double double10 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = univariatePointValuePairConvergenceChecker11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (-1.0f), 100.0d, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        double double5 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer2.getConvergenceChecker();
        int int7 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair13 = brentOptimizer2.optimize((int) ' ', univariateFunction9, goalType10, (double) 1, (double) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        int int9 = brentOptimizer3.getMaxEvaluations();
        int int10 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize(100, univariateFunction12, goalType13, (double) 10, 100.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 0.0f, (double) (byte) 100, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getEvaluations();
        double double8 = brentOptimizer3.getStartValue();
        java.lang.Class<?> wildcardClass9 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction14 = null;
        org.apache.commons.math3.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair18 = brentOptimizer3.optimize((int) (byte) 10, univariateFunction14, goalType15, (double) (byte) 10, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMin();
        double double8 = brentOptimizer3.getMax();
        double double9 = brentOptimizer3.getStartValue();
        double double10 = brentOptimizer3.getStartValue();
        double double11 = brentOptimizer3.getStartValue();
        java.lang.Class<?> wildcardClass12 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) ' ', (double) (byte) 1, univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair6 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        int int11 = brentOptimizer3.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair12 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) ' ', (double) 100.0f, univariatePointValuePairConvergenceChecker2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair4 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        double double11 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair18 = brentOptimizer3.optimize(0, univariateFunction13, goalType14, (double) 1.0f, (-1.0d), (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, (double) (byte) 10);
        int int3 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math3.optimization.GoalType goalType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair10 = brentOptimizer2.optimize((-1), univariateFunction5, goalType6, (double) 100.0f, (double) '4', (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) ' ', (double) 100.0f, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getEvaluations();
        int int6 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair13 = brentOptimizer3.optimize(100, univariateFunction9, goalType10, (double) 100.0f, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        int int6 = brentOptimizer3.getEvaluations();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        double double10 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize(0, univariateFunction12, goalType13, (-1.0d), 1.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        double double10 = brentOptimizer3.getMax();
        java.lang.Class<?> wildcardClass11 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair12 = brentOptimizer3.optimize((int) (byte) 0, univariateFunction7, goalType8, (double) (byte) 1, (double) 10, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        int int9 = brentOptimizer3.getMaxEvaluations();
        double double10 = brentOptimizer3.getMax();
        double double11 = brentOptimizer3.getMax();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair12 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass5 = brentOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        int int8 = brentOptimizer3.getMaxEvaluations();
        double double9 = brentOptimizer3.getStartValue();
        double double10 = brentOptimizer3.getMax();
        double double11 = brentOptimizer3.getMin();
        java.lang.Class<?> wildcardClass12 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 'a', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair5 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 100, (double) (byte) 1, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math3.optimization.GoalType goalType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair9 = brentOptimizer3.optimize((int) (short) -1, univariateFunction5, goalType6, (double) (short) 100, (double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100, (double) (byte) 100, univariatePointValuePairConvergenceChecker2);
        java.lang.Class<?> wildcardClass4 = brentOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        int int9 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        int int11 = brentOptimizer3.getMaxEvaluations();
        double double12 = brentOptimizer3.getMax();
        double double13 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction15 = null;
        org.apache.commons.math3.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair20 = brentOptimizer3.optimize((int) (byte) 100, univariateFunction15, goalType16, (-1.0d), (double) 10.0f, (double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10, (double) 1L, univariatePointValuePairConvergenceChecker2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair4 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        double double6 = brentOptimizer3.getMin();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math3.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair15 = brentOptimizer3.optimize(100, univariateFunction10, goalType11, (double) (short) 1, (double) 0L, (double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        int int8 = brentOptimizer3.getEvaluations();
        double double9 = brentOptimizer3.getMin();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair10 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        int int6 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        int int8 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        int int10 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(goalType11);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        double double4 = brentOptimizer2.getMax();
        int int5 = brentOptimizer2.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair6 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertNull(goalType11);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        int int10 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMax();
        int int8 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math3.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair15 = brentOptimizer3.optimize((int) (byte) 0, univariateFunction10, goalType11, (-1.0d), (double) (-1), (double) 1L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        double double5 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer2.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = univariatePointValuePairConvergenceChecker8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMin();
        double double8 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math3.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer3.optimize(100, univariateFunction10, goalType11, (double) 10, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getEvaluations();
        int int8 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        double double10 = brentOptimizer3.getMin();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 100, (double) 1L);
        double double3 = brentOptimizer2.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math3.optimization.GoalType goalType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair10 = brentOptimizer2.optimize((int) (short) 0, univariateFunction5, goalType6, (double) (short) 1, (double) (short) -1, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        int int11 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType12 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType13 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType14 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction16 = null;
        org.apache.commons.math3.optimization.GoalType goalType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair20 = brentOptimizer3.optimize((int) (byte) 100, univariateFunction16, goalType17, (double) 100.0f, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertNull(goalType13);
        org.junit.Assert.assertNull(goalType14);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair5 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) '4', (double) 10, univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass5 = brentOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        double double6 = brentOptimizer3.getMin();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (-1L), (double) 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 'a', univariatePointValuePairConvergenceChecker2);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer3.optimize((int) 'a', univariateFunction7, goalType8, 0.0d, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 10.0f);
        java.lang.Class<?> wildcardClass3 = brentOptimizer2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) -1, (double) 10.0f, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        int int8 = brentOptimizer3.getEvaluations();
        double double9 = brentOptimizer3.getMin();
        int int10 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize((int) '#', univariateFunction12, goalType13, (double) 'a', (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) 100.0f, univariatePointValuePairConvergenceChecker2);
        java.lang.Class<?> wildcardClass4 = brentOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10, (double) 1L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMax();
        int int5 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair12 = brentOptimizer3.optimize((int) (byte) -1, univariateFunction7, goalType8, (double) '4', (double) (short) 0, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) -1, (double) (short) 1, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 10, (double) (short) 100);
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction4 = null;
        org.apache.commons.math3.optimization.GoalType goalType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair9 = brentOptimizer2.optimize((int) (short) 100, univariateFunction4, goalType5, (double) (short) 0, (double) 0, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 1, (double) 1, univariatePointValuePairConvergenceChecker2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair4 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        int int9 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize((int) (byte) 0, univariateFunction11, goalType12, (double) (byte) 100, (double) 100.0f, (double) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer2.getGoalType();
        double double7 = brentOptimizer2.getMax();
        double double8 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair15 = brentOptimizer2.optimize(0, univariateFunction11, goalType12, (double) (short) 1, 10.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) (short) 10, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMax();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(0.0d, (double) 10, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) (byte) -1, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(1.0d, 10.0d);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        double double4 = brentOptimizer2.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer2.optimize((-1), univariateFunction6, goalType7, (double) (byte) 1, 10.0d, (double) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        int int9 = brentOptimizer3.getMaxEvaluations();
        int int10 = brentOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass11 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 10);
        double double3 = brentOptimizer2.getMin();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getMin();
        java.lang.Class<?> wildcardClass6 = brentOptimizer2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        double double8 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        double double10 = brentOptimizer3.getMin();
        double double11 = brentOptimizer3.getStartValue();
        java.lang.Class<?> wildcardClass12 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getMin();
        int int6 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer2.optimize((-1), univariateFunction9, goalType10, (double) 0.0f, (double) 1L, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        int int8 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize((int) (short) -1, univariateFunction12, goalType13, 0.0d, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(1.0d, (double) '#');
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction4 = null;
        org.apache.commons.math3.optimization.GoalType goalType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair9 = brentOptimizer2.optimize((int) (byte) -1, univariateFunction4, goalType5, (double) '#', (-1.0d), (double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        int int11 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType12 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType13 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker14 = brentOptimizer3.getConvergenceChecker();
        int int15 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertNull(goalType13);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        int int9 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair12 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getMaxEvaluations();
        int int8 = brentOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass9 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        double double5 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer2.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair9 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 10.0f);
        double double3 = brentOptimizer2.getStartValue();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair12 = brentOptimizer2.optimize((int) (short) 10, univariateFunction7, goalType8, (double) 100.0f, (double) 10, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        double double5 = brentOptimizer3.getMin();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math3.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair13 = brentOptimizer3.optimize((int) (byte) 1, univariateFunction8, goalType9, (double) (-1.0f), 0.0d, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer3.optimize((int) (short) 1, univariateFunction9, goalType10, (double) (short) 10, (double) 0, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getMin();
        double double10 = brentOptimizer3.getMin();
        java.lang.Class<?> wildcardClass11 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(0.0d, (double) (short) 100, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10, (double) 1L, univariatePointValuePairConvergenceChecker2);
        java.lang.Class<?> wildcardClass4 = brentOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        double double9 = brentOptimizer3.getStartValue();
        int int10 = brentOptimizer3.getEvaluations();
        int int11 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair18 = brentOptimizer3.optimize((int) (byte) 1, univariateFunction13, goalType14, (double) (byte) 100, (double) (short) 100, (double) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        double double8 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = univariatePointValuePairConvergenceChecker9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair10 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer3.optimize(1, univariateFunction12, goalType13, (double) (-1.0f), (double) (short) 1, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer3.optimize((int) (byte) 100, univariateFunction9, goalType10, 100.0d, (double) 1, (double) 1L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getStartValue();
        double double10 = brentOptimizer3.getMin();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10L, 0.0d, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        int int8 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        double double10 = brentOptimizer3.getMax();
        double double11 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair18 = brentOptimizer3.optimize((int) (byte) -1, univariateFunction13, goalType14, 10.0d, (double) 0L, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        int int9 = brentOptimizer3.getMaxEvaluations();
        int int10 = brentOptimizer3.getEvaluations();
        double double11 = brentOptimizer3.getMax();
        java.lang.Class<?> wildcardClass12 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        double double11 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair18 = brentOptimizer3.optimize(1, univariateFunction13, goalType14, (double) 1, (double) (byte) 10, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) '4');
        java.lang.Class<?> wildcardClass3 = brentOptimizer2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 0, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(1.0d, (double) 100L, univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass5 = brentOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        int int8 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        double double10 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize((int) 'a', univariateFunction12, goalType13, (double) '#', (double) 1L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getEvaluations();
        double double8 = brentOptimizer3.getMax();
        double double9 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        double double11 = brentOptimizer3.getMax();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair12 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMin();
        java.lang.Class<?> wildcardClass10 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        double double4 = brentOptimizer2.getMin();
        java.lang.Class<?> wildcardClass5 = brentOptimizer2.getClass();
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 1, (double) (-1), univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getEvaluations();
        double double8 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = goalType9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (-1.0f), (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10.0f, (double) 10);
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction4 = null;
        org.apache.commons.math3.optimization.GoalType goalType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair9 = brentOptimizer2.optimize(10, univariateFunction4, goalType5, (double) (-1.0f), (double) 'a', (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getMax();
        java.lang.Class<?> wildcardClass10 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        double double10 = brentOptimizer3.getMax();
        double double11 = brentOptimizer3.getStartValue();
        java.lang.Class<?> wildcardClass12 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getMax();
        double double10 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer3.optimize((int) 'a', univariateFunction12, goalType13, (double) 0, (double) ' ', (double) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        int int9 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize((-1), univariateFunction11, goalType12, (double) (short) 1, (double) '4', (double) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(1.0d, 10.0d);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        int int4 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        int int6 = brentOptimizer2.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair7 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 1, (double) 1, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        int int6 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        java.lang.Class<?> wildcardClass4 = brentOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        int int10 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair12 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(goalType11);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 1, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 100, (double) 1L);
        double double3 = brentOptimizer2.getMax();
        double double4 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer2.getGoalType();
        double double6 = brentOptimizer2.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math3.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair13 = brentOptimizer2.optimize((int) (short) 10, univariateFunction8, goalType9, (double) (short) -1, (double) 10L, 100.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        double double7 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer3.optimize((int) (byte) 10, univariateFunction9, goalType10, (double) ' ', 0.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer3.optimize((int) (short) 1, univariateFunction12, goalType13, (double) 10, (double) 100.0f, (double) 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getMax();
        int int9 = brentOptimizer3.getEvaluations();
        int int10 = brentOptimizer3.getMaxEvaluations();
        int int11 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair18 = brentOptimizer3.optimize((int) (short) 10, univariateFunction13, goalType14, (double) '4', (double) (short) 0, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        int int9 = brentOptimizer3.getEvaluations();
        double double10 = brentOptimizer3.getStartValue();
        java.lang.Class<?> wildcardClass11 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        double double4 = brentOptimizer2.getStartValue();
        double double5 = brentOptimizer2.getMax();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair6 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        int int6 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        int int8 = brentOptimizer3.getMaxEvaluations();
        double double9 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair15 = brentOptimizer3.optimize((int) 'a', univariateFunction11, goalType12, 0.0d, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math3.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair12 = brentOptimizer3.optimize((int) (short) 100, univariateFunction8, goalType9, (double) (short) 1, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 0.0f, (double) 100.0f, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10, (double) (-1), univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getEvaluations();
        double double8 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        double double10 = brentOptimizer3.getStartValue();
        java.lang.Class<?> wildcardClass11 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        int int8 = brentOptimizer3.getEvaluations();
        int int9 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        int int12 = brentOptimizer3.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair13 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        double double5 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair12 = brentOptimizer3.optimize((int) (byte) 10, univariateFunction7, goalType8, (double) (short) 0, (double) (byte) -1, (double) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        double double9 = brentOptimizer3.getMin();
        int int10 = brentOptimizer3.getEvaluations();
        double double11 = brentOptimizer3.getMin();
        java.lang.Class<?> wildcardClass12 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 10, (double) 10.0f);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 0.0f, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 0L, (double) 100L, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        int int8 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        int int10 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        double double12 = brentOptimizer3.getMax();
        int int13 = brentOptimizer3.getEvaluations();
        int int14 = brentOptimizer3.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair15 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math3.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair15 = brentOptimizer3.optimize((int) (short) 10, univariateFunction10, goalType11, (double) 0.0f, (double) (short) 10, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        int int11 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType12 = brentOptimizer3.getGoalType();
        double double13 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) '#', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        double double6 = brentOptimizer3.getMax();
        java.lang.Class<?> wildcardClass7 = brentOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        int int8 = brentOptimizer3.getMaxEvaluations();
        double double9 = brentOptimizer3.getStartValue();
        double double10 = brentOptimizer3.getMax();
        double double11 = brentOptimizer3.getStartValue();
        java.lang.Class<?> wildcardClass12 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        int int5 = brentOptimizer3.getEvaluations();
        int int6 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math3.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair12 = brentOptimizer3.optimize((int) '4', univariateFunction8, goalType9, (double) 0L, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1.0f, (double) 'a');
        int int3 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math3.optimization.GoalType goalType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair9 = brentOptimizer2.optimize((int) ' ', univariateFunction5, goalType6, (double) 10, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (-1), (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        int int9 = brentOptimizer3.getMaxEvaluations();
        int int10 = brentOptimizer3.getEvaluations();
        double double11 = brentOptimizer3.getMax();
        double double12 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction14 = null;
        org.apache.commons.math3.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair18 = brentOptimizer3.optimize((int) 'a', univariateFunction14, goalType15, (double) ' ', 100.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        int int3 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair10 = brentOptimizer2.optimize((int) '#', univariateFunction6, goalType7, (double) (short) 100, (double) 1L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        double double9 = brentOptimizer3.getMin();
        int int10 = brentOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass11 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        int int8 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        double double10 = brentOptimizer3.getStartValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 0, (double) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 0, (double) 10L, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        double double9 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair15 = brentOptimizer3.optimize((int) ' ', univariateFunction11, goalType12, (double) 1L, (double) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        int int8 = brentOptimizer3.getMaxEvaluations();
        double double9 = brentOptimizer3.getStartValue();
        double double10 = brentOptimizer3.getMax();
        double double11 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair18 = brentOptimizer3.optimize((int) (short) 10, univariateFunction13, goalType14, 0.0d, (-1.0d), (double) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMax();
        int int8 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math3.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair15 = brentOptimizer3.optimize((int) (byte) 1, univariateFunction10, goalType11, (double) (byte) 10, (double) 10.0f, 100.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (-1), 1.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, 1.0d);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        int int4 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        int int6 = brentOptimizer2.getMaxEvaluations();
        int int7 = brentOptimizer2.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair8 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        int int6 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer2.optimize((int) (byte) 1, univariateFunction9, goalType10, 0.0d, (double) '4', (double) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        int int11 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType12 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType13 = brentOptimizer3.getGoalType();
        double double14 = brentOptimizer3.getStartValue();
        int int15 = brentOptimizer3.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertNull(goalType13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        int int3 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        java.lang.Class<?> wildcardClass5 = brentOptimizer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1.0f, (double) 100);
        double double3 = brentOptimizer2.getMin();
        java.lang.Class<?> wildcardClass4 = brentOptimizer2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((-1.0d), (double) (short) 1, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 0, (double) (byte) 100, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 'a', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair10 = brentOptimizer3.optimize((int) 'a', univariateFunction6, goalType7, (double) (-1), (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        double double5 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer2.getConvergenceChecker();
        int int7 = brentOptimizer2.getEvaluations();
        double double8 = brentOptimizer2.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math3.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair15 = brentOptimizer2.optimize((int) ' ', univariateFunction10, goalType11, (double) (-1), (double) ' ', (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1L, (double) ' ', univariatePointValuePairConvergenceChecker2);
        java.lang.Class<?> wildcardClass4 = brentOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair13 = brentOptimizer3.optimize(0, univariateFunction9, goalType10, (double) 0.0f, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMin();
        int int10 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer3.optimize((int) ' ', univariateFunction12, goalType13, (double) (short) -1, (double) 100, 10.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 'a', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        double double5 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer3.optimize((int) 'a', univariateFunction7, goalType8, 0.0d, (double) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer3.optimize(10, univariateFunction12, goalType13, (double) 100, (double) ' ', (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        double double5 = brentOptimizer3.getMin();
        int int6 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math3.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair12 = brentOptimizer3.optimize((int) 'a', univariateFunction8, goalType9, (double) (byte) -1, (double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100, 1.0d);
        double double3 = brentOptimizer2.getStartValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (-1L), (double) 10L, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) ' ', (double) 100.0f, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer3.getConvergenceChecker();
        int int6 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) -1, (double) 10L, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10, (double) (short) 10, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
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
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        int int8 = brentOptimizer3.getEvaluations();
        double double9 = brentOptimizer3.getMin();
        int int10 = brentOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass11 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 'a', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMax();
        int int8 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer3.optimize(100, univariateFunction9, goalType10, 0.0d, (double) (byte) -1, (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, 1.0d);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        double double4 = brentOptimizer2.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair10 = brentOptimizer2.optimize((int) 'a', univariateFunction6, goalType7, 100.0d, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        double double8 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        double double10 = brentOptimizer3.getStartValue();
        double double11 = brentOptimizer3.getStartValue();
        double double12 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker13 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction15 = null;
        org.apache.commons.math3.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair20 = brentOptimizer3.optimize((int) 'a', univariateFunction15, goalType16, (double) (short) 10, (double) (short) 100, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker13);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) (-1L), univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getMax();
        double double9 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        int int11 = brentOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass12 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 'a', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        double double5 = brentOptimizer3.getMax();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair6 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        double double8 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        double double10 = brentOptimizer3.getStartValue();
        double double11 = brentOptimizer3.getStartValue();
        double double12 = brentOptimizer3.getMax();
        java.lang.Class<?> wildcardClass13 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) -1, (double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 100, (double) (byte) 1, univariatePointValuePairConvergenceChecker2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair4 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math3.optimization.GoalType goalType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair9 = brentOptimizer2.optimize((int) 'a', univariateFunction5, goalType6, (double) 10.0f, (double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType3);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(1.0d, 10.0d);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair5 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (-1), (double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        java.lang.Class<?> wildcardClass10 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        double double4 = brentOptimizer2.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer2.optimize((int) (short) 10, univariateFunction6, goalType7, 10.0d, (double) (byte) 10, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10.0f, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) ' ', 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair3 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        int int8 = brentOptimizer3.getEvaluations();
        int int9 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        double double12 = brentOptimizer3.getStartValue();
        java.lang.Class<?> wildcardClass13 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        double double6 = brentOptimizer3.getMin();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        double double10 = brentOptimizer3.getMin();
        java.lang.Class<?> wildcardClass11 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction14 = null;
        org.apache.commons.math3.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair18 = brentOptimizer3.optimize((-1), univariateFunction14, goalType15, (double) (-1L), (double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getEvaluations();
        double double8 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair15 = brentOptimizer3.optimize((int) (short) -1, univariateFunction11, goalType12, (double) 0L, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        double double4 = brentOptimizer2.getStartValue();
        double double5 = brentOptimizer2.getMax();
        int int6 = brentOptimizer2.getMaxEvaluations();
        double double7 = brentOptimizer2.getMax();
        double double8 = brentOptimizer2.getMax();
        java.lang.Class<?> wildcardClass9 = brentOptimizer2.getClass();
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1L, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10, (double) 10L);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        java.lang.Class<?> wildcardClass4 = brentOptimizer2.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) ' ', (double) 100.0f, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer3.optimize((int) (byte) 0, univariateFunction7, goalType8, (double) 100, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        double double8 = brentOptimizer3.getMax();
        int int9 = brentOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass10 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getMax();
        int int10 = brentOptimizer3.getMaxEvaluations();
        int int11 = brentOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass12 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        int int8 = brentOptimizer3.getEvaluations();
        double double9 = brentOptimizer3.getMax();
        int int10 = brentOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass11 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) ' ', (double) 100.0f, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        int int11 = brentOptimizer3.getMaxEvaluations();
        double double12 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction14 = null;
        org.apache.commons.math3.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair18 = brentOptimizer3.optimize((int) (short) 100, univariateFunction14, goalType15, (double) (short) -1, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) -1, (double) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        double double8 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        double double10 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
        int int12 = brentOptimizer3.getEvaluations();
        double double13 = brentOptimizer3.getMax();
        int int14 = brentOptimizer3.getMaxEvaluations();
        double double15 = brentOptimizer3.getMax();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 0.0f, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 'a', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        java.lang.Class<?> wildcardClass5 = brentOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 10.0f);
        double double3 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        int int6 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math3.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair13 = brentOptimizer2.optimize((int) (short) 1, univariateFunction8, goalType9, (double) (byte) 100, (double) 10L, (double) 1L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10.0f, (double) ' ', univariatePointValuePairConvergenceChecker2);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        double double12 = brentOptimizer3.getMin();
        double double13 = brentOptimizer3.getMax();
        int int14 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction16 = null;
        org.apache.commons.math3.optimization.GoalType goalType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair20 = brentOptimizer3.optimize(0, univariateFunction16, goalType17, (double) 1.0f, 100.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getMax();
        java.lang.Class<?> wildcardClass7 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        int int6 = brentOptimizer3.getEvaluations();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair13 = brentOptimizer3.optimize((int) (short) 1, univariateFunction9, goalType10, (double) (short) -1, 100.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        int int9 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        int int11 = brentOptimizer3.getMaxEvaluations();
        double double12 = brentOptimizer3.getMax();
        double double13 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction15 = null;
        org.apache.commons.math3.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair20 = brentOptimizer3.optimize((-1), univariateFunction15, goalType16, (double) '#', (double) 100, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        int int6 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer2.getConvergenceChecker();
        double double9 = brentOptimizer2.getStartValue();
        int int10 = brentOptimizer2.getMaxEvaluations();
        int int11 = brentOptimizer2.getEvaluations();
        java.lang.Class<?> wildcardClass12 = brentOptimizer2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        int int11 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType12 = brentOptimizer3.getGoalType();
        int int13 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker14 = brentOptimizer3.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair15 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker14);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        int int8 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
        double double12 = brentOptimizer3.getMin();
        double double13 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction15 = null;
        org.apache.commons.math3.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair20 = brentOptimizer3.optimize((int) (byte) -1, univariateFunction15, goalType16, (double) (byte) 10, (double) 10.0f, (double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) -1, (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getMax();
        double double10 = brentOptimizer3.getMin();
        java.lang.Class<?> wildcardClass11 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 10, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMax();
        int int8 = brentOptimizer3.getEvaluations();
        double double9 = brentOptimizer3.getMax();
        int int10 = brentOptimizer3.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) 1L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math3.optimization.GoalType goalType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair10 = brentOptimizer3.optimize((int) (short) 1, univariateFunction5, goalType6, 0.0d, (double) (short) 0, (double) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100, (double) 0.0f, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10.0f, (double) '4');
        double double3 = brentOptimizer2.getStartValue();
        java.lang.Class<?> wildcardClass4 = brentOptimizer2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (-1L), 10.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (-1), (double) (-1.0f), univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair3 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        int int8 = brentOptimizer3.getEvaluations();
        int int9 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        double double12 = brentOptimizer3.getStartValue();
        double double13 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction15 = null;
        org.apache.commons.math3.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair20 = brentOptimizer3.optimize(0, univariateFunction15, goalType16, (double) (short) 10, 1.0d, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 1, (double) (short) 1);
        double double3 = brentOptimizer2.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math3.optimization.GoalType goalType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair10 = brentOptimizer2.optimize((int) '4', univariateFunction5, goalType6, (double) (short) 10, (double) 1L, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        int int5 = brentOptimizer3.getEvaluations();
        int int6 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math3.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair13 = brentOptimizer3.optimize(1, univariateFunction8, goalType9, (double) 100, (double) 0, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getEvaluations();
        double double8 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        double double12 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction14 = null;
        org.apache.commons.math3.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair19 = brentOptimizer3.optimize((int) ' ', univariateFunction14, goalType15, (-1.0d), (double) (short) 1, (double) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math3.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair15 = brentOptimizer3.optimize((int) (byte) 100, univariateFunction10, goalType11, (double) 10L, 1.0d, (double) 1L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) '#', 10.0d, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math3.optimization.GoalType goalType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair9 = brentOptimizer3.optimize((int) 'a', univariateFunction5, goalType6, 10.0d, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        int int8 = brentOptimizer3.getMaxEvaluations();
        double double9 = brentOptimizer3.getMin();
        int int10 = brentOptimizer3.getMaxEvaluations();
        int int11 = brentOptimizer3.getEvaluations();
        int int12 = brentOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass13 = brentOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (-1), (double) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((-1.0d), (double) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (-1), 0.0d, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, 1.0d);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        double double4 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer2.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getMax();
        double double9 = brentOptimizer3.getMin();
        double double10 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer3.optimize(10, univariateFunction13, goalType14, 1.0d, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1L, (double) (byte) 0, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        double double11 = brentOptimizer3.getStartValue();
        double double12 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction14 = null;
        org.apache.commons.math3.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair19 = brentOptimizer3.optimize(1, univariateFunction14, goalType15, 100.0d, (double) 100L, (double) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        int int8 = brentOptimizer3.getEvaluations();
        int int9 = brentOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass10 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        double double5 = brentOptimizer3.getMin();
        double double6 = brentOptimizer3.getStartValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair7 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        double double8 = brentOptimizer3.getMax();
        double double9 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair15 = brentOptimizer3.optimize((int) (byte) 1, univariateFunction11, goalType12, (double) (byte) 10, (double) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getMax();
        int int6 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer2.optimize((int) (byte) 100, univariateFunction9, goalType10, (double) 10L, (double) (short) 1, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        int int9 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        int int11 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        int int11 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType12 = brentOptimizer3.getGoalType();
        double double13 = brentOptimizer3.getMin();
        double double14 = brentOptimizer3.getMax();
        java.lang.Class<?> wildcardClass15 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        double double5 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer3.optimize((-1), univariateFunction7, goalType8, (double) 'a', (double) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(0.0d, (double) 'a', univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        double double5 = brentOptimizer3.getMin();
        double double6 = brentOptimizer3.getStartValue();
        double double7 = brentOptimizer3.getMax();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair8 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 0, (double) ' ', univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, (double) (short) 10);
        int int3 = brentOptimizer2.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair4 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 100, (double) 1L);
        double double3 = brentOptimizer2.getMax();
        double double4 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer2.getGoalType();
        double double6 = brentOptimizer2.getMin();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair7 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        int int8 = brentOptimizer3.getEvaluations();
        int int9 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = goalType10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) '4', univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer3.getConvergenceChecker();
        double double6 = brentOptimizer3.getMax();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        double double4 = brentOptimizer2.getMax();
        int int5 = brentOptimizer2.getMaxEvaluations();
        java.lang.Class<?> wildcardClass6 = brentOptimizer2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(0.0d, 1.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        int int8 = brentOptimizer3.getMaxEvaluations();
        double double9 = brentOptimizer3.getMin();
        double double10 = brentOptimizer3.getMax();
        java.lang.Class<?> wildcardClass11 = brentOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 1, (double) 1, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer3.optimize((int) (byte) 100, univariateFunction7, goalType8, (double) (byte) 0, (double) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        int int8 = brentOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass9 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (-1.0d), univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        int int6 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        double double10 = brentOptimizer3.getStartValue();
        int int11 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        int int8 = brentOptimizer3.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair9 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        double double6 = brentOptimizer3.getStartValue();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        int int9 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) -1, 10.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 'a');
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction4 = null;
        org.apache.commons.math3.optimization.GoalType goalType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair9 = brentOptimizer2.optimize((int) (short) -1, univariateFunction4, goalType5, 0.0d, (double) (short) 0, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) '4', (double) '#', univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getEvaluations();
        int int8 = brentOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass9 = brentOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        int int11 = brentOptimizer3.getEvaluations();
        double double12 = brentOptimizer3.getMax();
        double double13 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction15 = null;
        org.apache.commons.math3.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair19 = brentOptimizer3.optimize((int) (byte) 0, univariateFunction15, goalType16, 10.0d, (double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1L, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((-1.0d), (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        int int5 = brentOptimizer2.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair6 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1);
        double double3 = brentOptimizer2.getStartValue();
        double double4 = brentOptimizer2.getMax();
        int int5 = brentOptimizer2.getEvaluations();
        java.lang.Class<?> wildcardClass6 = brentOptimizer2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 1, (double) 1, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair7 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 1L);
        double double3 = brentOptimizer2.getMax();
        double double4 = brentOptimizer2.getMin();
        java.lang.Class<?> wildcardClass5 = brentOptimizer2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(1.0d, 10.0d);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        int int4 = brentOptimizer2.getEvaluations();
        java.lang.Class<?> wildcardClass5 = brentOptimizer2.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(1.0d, 10.0d);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        double double4 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer2.getGoalType();
        int int6 = brentOptimizer2.getMaxEvaluations();
        java.lang.Class<?> wildcardClass7 = brentOptimizer2.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        double double5 = brentOptimizer3.getMin();
        int int6 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math3.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair13 = brentOptimizer3.optimize((int) (short) 100, univariateFunction8, goalType9, (double) 0L, (double) (-1.0f), 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        int int9 = brentOptimizer3.getMaxEvaluations();
        double double10 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair18 = brentOptimizer3.optimize(1, univariateFunction13, goalType14, 0.0d, (double) '4', 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getMin();
        int int6 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair13 = brentOptimizer2.optimize(10, univariateFunction9, goalType10, (double) (short) 1, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(1.0d, (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        int int9 = brentOptimizer3.getMaxEvaluations();
        double double10 = brentOptimizer3.getMax();
        java.lang.Class<?> wildcardClass11 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair15 = brentOptimizer3.optimize(10, univariateFunction11, goalType12, 100.0d, (double) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMin();
        int int10 = brentOptimizer3.getMaxEvaluations();
        double double11 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer3.getConvergenceChecker();
        int int13 = brentOptimizer3.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(1.0d, 10.0d);
        int int3 = brentOptimizer2.getMaxEvaluations();
        double double4 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair10 = brentOptimizer2.optimize(100, univariateFunction6, goalType7, (double) (byte) 1, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10, (double) 1L, univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair6 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMin();
        double double8 = brentOptimizer3.getMax();
        double double9 = brentOptimizer3.getStartValue();
        double double10 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize((int) (byte) -1, univariateFunction12, goalType13, (double) (-1L), 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 1L);
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction4 = null;
        org.apache.commons.math3.optimization.GoalType goalType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair8 = brentOptimizer2.optimize(10, univariateFunction4, goalType5, (double) 10.0f, (double) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        int int10 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair18 = brentOptimizer3.optimize((int) (short) 100, univariateFunction13, goalType14, (double) 0L, (double) 1.0f, (double) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(goalType11);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        int int8 = brentOptimizer3.getMaxEvaluations();
        double double9 = brentOptimizer3.getStartValue();
        double double10 = brentOptimizer3.getMax();
        int int11 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair18 = brentOptimizer3.optimize((int) (short) 10, univariateFunction13, goalType14, 100.0d, (-1.0d), (double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getMax();
        double double10 = brentOptimizer3.getMin();
        int int11 = brentOptimizer3.getMaxEvaluations();
        int int12 = brentOptimizer3.getEvaluations();
        double double13 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = univariatePointValuePairConvergenceChecker10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (-1), 10.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(1.0d, 10.0d);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        double double4 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer2.getGoalType();
        int int6 = brentOptimizer2.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair7 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getStartValue();
        double double10 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer3.optimize(100, univariateFunction12, goalType13, 0.0d, (double) (byte) 10, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        int int3 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        int int5 = brentOptimizer2.getEvaluations();
        java.lang.Class<?> wildcardClass6 = brentOptimizer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 1, (double) 1);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        double double4 = brentOptimizer2.getStartValue();
        java.lang.Class<?> wildcardClass5 = brentOptimizer2.getClass();
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) 0.0f, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 1, (double) 1, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        double double5 = brentOptimizer3.getMin();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (-1), (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMax();
        int int8 = brentOptimizer3.getMaxEvaluations();
        int int9 = brentOptimizer3.getEvaluations();
        double double10 = brentOptimizer3.getStartValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair13 = brentOptimizer3.optimize((int) (short) 0, univariateFunction9, goalType10, 0.0d, (double) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getEvaluations();
        double double8 = brentOptimizer3.getMax();
        double double9 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        double double11 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair18 = brentOptimizer3.optimize(0, univariateFunction13, goalType14, (double) (-1), 100.0d, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, (double) (byte) 10, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair10 = brentOptimizer3.optimize((int) (short) 0, univariateFunction6, goalType7, (double) (short) 10, 1.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        int int5 = brentOptimizer3.getEvaluations();
        int int6 = brentOptimizer3.getMaxEvaluations();
        double double7 = brentOptimizer3.getMin();
        double double8 = brentOptimizer3.getStartValue();
        double double9 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(0.0d, (double) (short) 10, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getEvaluations();
        double double8 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair15 = brentOptimizer3.optimize((int) '#', univariateFunction11, goalType12, (double) (short) 100, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        double double6 = brentOptimizer3.getMax();
        double double7 = brentOptimizer3.getMax();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair8 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        double double9 = brentOptimizer3.getStartValue();
        int int10 = brentOptimizer3.getEvaluations();
        int int11 = brentOptimizer3.getEvaluations();
        double double12 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType13 = brentOptimizer3.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = goalType13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(goalType13);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        int int8 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize((int) (byte) 10, univariateFunction11, goalType12, (double) '4', (double) 0L, (double) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100.0f, (double) 100, univariatePointValuePairConvergenceChecker2);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getEvaluations();
        int int8 = brentOptimizer3.getEvaluations();
        int int9 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair15 = brentOptimizer3.optimize((int) (short) 100, univariateFunction11, goalType12, (double) 100, (double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        int int5 = brentOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass6 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(1.0d, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMax();
        int int8 = brentOptimizer3.getMaxEvaluations();
        int int9 = brentOptimizer3.getEvaluations();
        double double10 = brentOptimizer3.getMax();
        java.lang.Class<?> wildcardClass11 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMin();
        int int10 = brentOptimizer3.getMaxEvaluations();
        double double11 = brentOptimizer3.getMin();
        int int12 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction14 = null;
        org.apache.commons.math3.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair19 = brentOptimizer3.optimize(10, univariateFunction14, goalType15, 0.0d, 0.0d, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1L, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMin();
        int int10 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer3.optimize((int) (byte) 0, univariateFunction12, goalType13, (double) (-1.0f), (double) (-1L), 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getEvaluations();
        double double8 = brentOptimizer3.getMax();
        java.lang.Class<?> wildcardClass9 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100, (double) ' ', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer3.optimize((int) (short) -1, univariateFunction6, goalType7, (double) 0L, (double) (short) 100, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        int int6 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        int int9 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize((int) (byte) 100, univariateFunction11, goalType12, (double) (byte) 0, (double) 100L, (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getMax();
        int int9 = brentOptimizer3.getEvaluations();
        int int10 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer3.optimize((int) (byte) -1, univariateFunction12, goalType13, (double) 1, (double) 1L, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }
}

