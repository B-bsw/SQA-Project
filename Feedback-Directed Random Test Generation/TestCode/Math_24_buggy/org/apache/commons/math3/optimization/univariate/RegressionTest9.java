package org.apache.commons.math3.optimization.univariate;

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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        double double6 = brentOptimizer3.getMax();
        int int7 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
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
        int int13 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker14 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction16 = null;
        org.apache.commons.math3.optimization.GoalType goalType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair21 = brentOptimizer3.optimize((int) (short) 100, univariateFunction16, goalType17, (double) 0L, (double) (-1L), 10.0d);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker14);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 1, (double) 1);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        double double4 = brentOptimizer2.getMin();
        double double5 = brentOptimizer2.getMax();
        int int6 = brentOptimizer2.getEvaluations();
        int int7 = brentOptimizer2.getEvaluations();
        double double8 = brentOptimizer2.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math3.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer2.optimize((int) (byte) 100, univariateFunction10, goalType11, 10.0d, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        int int5 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer2.getGoalType();
        int int7 = brentOptimizer2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) '#', (double) ' ');
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 100, (double) (short) 10, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer3.optimize((int) (byte) 10, univariateFunction6, goalType7, 0.0d, (double) 10L, 100.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
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
        org.apache.commons.math3.optimization.GoalType goalType12 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction14 = null;
        org.apache.commons.math3.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair19 = brentOptimizer3.optimize((int) '4', univariateFunction14, goalType15, (double) 10, 0.0d, (double) 10L);
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
        org.junit.Assert.assertNull(goalType12);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getMaxEvaluations();
        int int8 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
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
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair18 = brentOptimizer3.optimize((int) ' ', univariateFunction13, goalType14, (double) (-1), (double) (short) 0, (double) 10.0f);
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
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
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
        double double12 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker13 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker13);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100, (double) '4', univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        double double8 = brentOptimizer3.getMax();
        int int9 = brentOptimizer3.getMaxEvaluations();
        double double10 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
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
        int int14 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker15 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction17 = null;
        org.apache.commons.math3.optimization.GoalType goalType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair22 = brentOptimizer3.optimize((int) (byte) -1, univariateFunction17, goalType18, (double) 1.0f, (double) (-1), (double) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker15);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100, 1.0d);
        int int3 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        int int5 = brentOptimizer2.getEvaluations();
        int int6 = brentOptimizer2.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair7 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        int int9 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        double double11 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType12 = brentOptimizer3.getGoalType();
        int int13 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10, (double) 10.0f, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMax();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer3.optimize(10, univariateFunction7, goalType8, (double) 0L, (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        int int9 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        double double11 = brentOptimizer3.getMin();
        double double12 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getMaxEvaluations();
        int int8 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer3.optimize((int) (byte) -1, univariateFunction13, goalType14, 0.0d, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        double double6 = brentOptimizer3.getStartValue();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair13 = brentOptimizer3.optimize((int) (short) 100, univariateFunction9, goalType10, 0.0d, (double) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 'a', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        double double9 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        int int11 = brentOptimizer3.getEvaluations();
        int int12 = brentOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass13 = brentOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMin();
        double double8 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math3.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer3.optimize((int) 'a', univariateFunction10, goalType11, 0.0d, (double) 1L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 1, (double) '#');
        double double3 = brentOptimizer2.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math3.optimization.GoalType goalType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair9 = brentOptimizer2.optimize(1, univariateFunction5, goalType6, (double) (byte) 1, (double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        int int9 = brentOptimizer3.getEvaluations();
        int int10 = brentOptimizer3.getMaxEvaluations();
        double double11 = brentOptimizer3.getStartValue();
        double double12 = brentOptimizer3.getStartValue();
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
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 100, (double) 'a', univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getEvaluations();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getStartValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair9 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) '#', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getEvaluations();
        double double8 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        int int12 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType13 = brentOptimizer3.getGoalType();
        double double14 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType15 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(goalType13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(goalType15);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) (short) 100);
        double double3 = brentOptimizer2.getMax();
        double double4 = brentOptimizer2.getMin();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) '#', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getEvaluations();
        double double8 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = goalType11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertNull(goalType11);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        double double6 = brentOptimizer3.getMin();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        int int10 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
        double double12 = brentOptimizer3.getMin();
        double double13 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction15 = null;
        org.apache.commons.math3.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair19 = brentOptimizer3.optimize((-1), univariateFunction15, goalType16, (double) (-1L), (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, (double) 0.0f, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100.0f, univariatePointValuePairConvergenceChecker2);
        java.lang.Class<?> wildcardClass4 = brentOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1.0f, 10.0d);
        double double3 = brentOptimizer2.getStartValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 1, 10.0d);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        org.junit.Assert.assertNull(goalType3);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, 1.0d);
        double double3 = brentOptimizer2.getMin();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        double double4 = brentOptimizer2.getStartValue();
        double double5 = brentOptimizer2.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer2.getConvergenceChecker();
        int int7 = brentOptimizer2.getMaxEvaluations();
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
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
        double double12 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType13 = brentOptimizer3.getGoalType();
        int int14 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(goalType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        int int10 = brentOptimizer3.getMaxEvaluations();
        int int11 = brentOptimizer3.getEvaluations();
        int int12 = brentOptimizer3.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair13 = brentOptimizer3.doOptimize();
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        double double8 = brentOptimizer3.getMax();
        int int9 = brentOptimizer3.getMaxEvaluations();
        int int10 = brentOptimizer3.getEvaluations();
        int int11 = brentOptimizer3.getEvaluations();
        double double12 = brentOptimizer3.getMax();
        double double13 = brentOptimizer3.getStartValue();
        int int14 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMax();
        double double9 = brentOptimizer3.getMax();
        int int10 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize((-1), univariateFunction12, goalType13, (double) 100, (double) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10, (double) (short) 1, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 10);
        double double3 = brentOptimizer2.getMin();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getMin();
        int int6 = brentOptimizer2.getEvaluations();
        double double7 = brentOptimizer2.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair13 = brentOptimizer2.optimize((int) (byte) 10, univariateFunction9, goalType10, (double) '#', 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(0.0d, (double) (short) -1, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getMax();
        int int6 = brentOptimizer2.getMaxEvaluations();
        int int7 = brentOptimizer2.getEvaluations();
        int int8 = brentOptimizer2.getMaxEvaluations();
        double double9 = brentOptimizer2.getMax();
        double double10 = brentOptimizer2.getMax();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        int int5 = brentOptimizer3.getEvaluations();
        int int6 = brentOptimizer3.getMaxEvaluations();
        double double7 = brentOptimizer3.getMin();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair15 = brentOptimizer3.optimize(0, univariateFunction11, goalType12, (-1.0d), (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) '4', (double) (short) -1, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, (double) 1);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(1.0d, 10.0d);
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction4 = null;
        org.apache.commons.math3.optimization.GoalType goalType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair9 = brentOptimizer2.optimize(10, univariateFunction4, goalType5, (double) (short) 100, (double) 1, (double) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) '4', 100.0d);
        double double3 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        double double5 = brentOptimizer2.getStartValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getMax();
        double double10 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        double double12 = brentOptimizer3.getStartValue();
        int int13 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(1.0d, (double) 0.0f, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMin();
        int int8 = brentOptimizer3.getMaxEvaluations();
        double double9 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = univariatePointValuePairConvergenceChecker10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100.0f, (double) 10L, univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMin();
        double double10 = brentOptimizer3.getMax();
        int int11 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair18 = brentOptimizer3.optimize((int) (short) 10, univariateFunction13, goalType14, (double) 1L, (double) (short) 10, (double) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMin();
        int int8 = brentOptimizer3.getMaxEvaluations();
        double double9 = brentOptimizer3.getMax();
        int int10 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer3.optimize((int) (short) 100, univariateFunction12, goalType13, (double) 'a', 0.0d, (double) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        double double8 = brentOptimizer3.getMax();
        int int9 = brentOptimizer3.getMaxEvaluations();
        int int10 = brentOptimizer3.getEvaluations();
        double double11 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        double double8 = brentOptimizer3.getMax();
        int int9 = brentOptimizer3.getMaxEvaluations();
        int int10 = brentOptimizer3.getEvaluations();
        double double11 = brentOptimizer3.getMin();
        double double12 = brentOptimizer3.getStartValue();
        double double13 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(1.0d, 10.0d);
        int int3 = brentOptimizer2.getMaxEvaluations();
        double double4 = brentOptimizer2.getMax();
        double double5 = brentOptimizer2.getMin();
        double double6 = brentOptimizer2.getStartValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (-1L), (double) (short) 0, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        double double5 = brentOptimizer2.getMin();
        double double6 = brentOptimizer2.getStartValue();
        double double7 = brentOptimizer2.getStartValue();
        int int8 = brentOptimizer2.getMaxEvaluations();
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMax();
        int int8 = brentOptimizer3.getEvaluations();
        double double9 = brentOptimizer3.getStartValue();
        double double10 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(goalType11);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1L, (double) (short) 100);
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction4 = null;
        org.apache.commons.math3.optimization.GoalType goalType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair9 = brentOptimizer2.optimize((int) (byte) 10, univariateFunction4, goalType5, (double) (-1L), (double) '4', (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        double double8 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        double double10 = brentOptimizer3.getMax();
        int int11 = brentOptimizer3.getMaxEvaluations();
        double double12 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) '4', (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) -1, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100, (double) (byte) 100, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMax();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) ' ', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMax();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        java.lang.Class<?> wildcardClass8 = brentOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getMax();
        int int6 = brentOptimizer2.getEvaluations();
        double double7 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer2.getGoalType();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertNull(goalType9);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10, (double) 10L);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        double double4 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        double double6 = brentOptimizer2.getStartValue();
        double double7 = brentOptimizer2.getStartValue();
        int int8 = brentOptimizer2.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) '4', (double) (byte) 1);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        int int4 = brentOptimizer2.getEvaluations();
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getStartValue();
        double double9 = brentOptimizer3.getMin();
        double double10 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        double double12 = brentOptimizer3.getMax();
        int int13 = brentOptimizer3.getMaxEvaluations();
        int int14 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType15 = brentOptimizer3.getGoalType();
        int int16 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction18 = null;
        org.apache.commons.math3.optimization.GoalType goalType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair22 = brentOptimizer3.optimize((-1), univariateFunction18, goalType19, (double) (short) -1, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(goalType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
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
        double double12 = brentOptimizer3.getMin();
        double double13 = brentOptimizer3.getStartValue();
        double double14 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker15 = brentOptimizer3.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = univariatePointValuePairConvergenceChecker15.getClass();
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker15);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 1, (double) 1);
        double double3 = brentOptimizer2.getStartValue();
        double double4 = brentOptimizer2.getMax();
        int int5 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer2.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair7 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1L, (double) 100L);
        double double3 = brentOptimizer2.getMax();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) ' ', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMax();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMax();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getMax();
        double double9 = brentOptimizer3.getStartValue();
        double double10 = brentOptimizer3.getStartValue();
        int int11 = brentOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass12 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((-1.0d), (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 10, (double) (byte) 100);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        int int5 = brentOptimizer2.getEvaluations();
        int int6 = brentOptimizer2.getMaxEvaluations();
        double double7 = brentOptimizer2.getMin();
        java.lang.Class<?> wildcardClass8 = brentOptimizer2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(0.0d, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
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
        double double12 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker13 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction15 = null;
        org.apache.commons.math3.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair19 = brentOptimizer3.optimize((int) (byte) 0, univariateFunction15, goalType16, (double) '4', 0.0d);
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker13);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100.0f, (double) 10L);
        double double3 = brentOptimizer2.getStartValue();
        int int4 = brentOptimizer2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        double double9 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertNull(goalType11);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10L, (double) (short) 100, univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getMaxEvaluations();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getMax();
        double double7 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getMax();
        int int6 = brentOptimizer2.getMaxEvaluations();
        double double7 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer2.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = goalType8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10.0f, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math3.optimization.GoalType goalType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair9 = brentOptimizer3.optimize((int) (short) 0, univariateFunction5, goalType6, (double) (byte) 10, (double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 0L, (double) 100, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) (short) 10);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        double double8 = brentOptimizer3.getMin();
        int int9 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1L, univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair10 = brentOptimizer3.optimize((-1), univariateFunction6, goalType7, (double) 100, (double) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 1, (double) '#');
        int int3 = brentOptimizer2.getMaxEvaluations();
        int int4 = brentOptimizer2.getEvaluations();
        java.lang.Class<?> wildcardClass5 = brentOptimizer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) '#', (double) (-1L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
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
        int int12 = brentOptimizer3.getMaxEvaluations();
        int int13 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 1L);
        int int3 = brentOptimizer2.getMaxEvaluations();
        double double4 = brentOptimizer2.getMin();
        int int5 = brentOptimizer2.getMaxEvaluations();
        double double6 = brentOptimizer2.getStartValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 0, (double) (short) 100, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
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
        double double15 = brentOptimizer3.getMin();
        int int16 = brentOptimizer3.getEvaluations();
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
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
        int int14 = brentOptimizer3.getMaxEvaluations();
        double double15 = brentOptimizer3.getMin();
        int int16 = brentOptimizer3.getEvaluations();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        int int8 = brentOptimizer3.getMaxEvaluations();
        double double9 = brentOptimizer3.getMin();
        double double10 = brentOptimizer3.getMax();
        double double11 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType12 = brentOptimizer3.getGoalType();
        int int13 = brentOptimizer3.getMaxEvaluations();
        int int14 = brentOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass15 = brentOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        double double8 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        double double10 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
        double double12 = brentOptimizer3.getMin();
        int int13 = brentOptimizer3.getMaxEvaluations();
        double double14 = brentOptimizer3.getMax();
        java.lang.Class<?> wildcardClass15 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10.0f, (double) (short) 100);
        double double3 = brentOptimizer2.getMax();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getStartValue();
        int int6 = brentOptimizer2.getEvaluations();
        double double7 = brentOptimizer2.getStartValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass8 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) '4', (double) 1L);
        int int3 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math3.optimization.GoalType goalType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair10 = brentOptimizer2.optimize((int) ' ', univariateFunction5, goalType6, (double) (short) 1, (double) (byte) 1, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 1, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 100);
        double double3 = brentOptimizer2.getMin();
        int int4 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer2.getGoalType();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        double double5 = brentOptimizer2.getMin();
        int int6 = brentOptimizer2.getMaxEvaluations();
        int int7 = brentOptimizer2.getMaxEvaluations();
        double double8 = brentOptimizer2.getMin();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
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
        double double12 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker13 = brentOptimizer3.getConvergenceChecker();
        double double14 = brentOptimizer3.getMin();
        double double15 = brentOptimizer3.getMin();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) '4', 10.0d, univariatePointValuePairConvergenceChecker2);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 'a', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        double double9 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        double double11 = brentOptimizer3.getMax();
        java.lang.Class<?> wildcardClass12 = brentOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 10.0f);
        double double3 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        int int6 = brentOptimizer2.getEvaluations();
        double double7 = brentOptimizer2.getMax();
        int int8 = brentOptimizer2.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair9 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        double double8 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        double double10 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        double double12 = brentOptimizer3.getMin();
        double double13 = brentOptimizer3.getMin();
        java.lang.Class<?> wildcardClass14 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMax();
        int int10 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getMin();
        int int6 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer2.getGoalType();
        int int8 = brentOptimizer2.getMaxEvaluations();
        java.lang.Class<?> wildcardClass9 = brentOptimizer2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        double double8 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        double double10 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        double double12 = brentOptimizer3.getStartValue();
        java.lang.Class<?> wildcardClass13 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        int int6 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        int int8 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        int int10 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, 10.0d, univariatePointValuePairConvergenceChecker2);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        double double11 = brentOptimizer3.getMax();
        double double12 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType13 = brentOptimizer3.getGoalType();
        int int14 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(goalType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        int int11 = brentOptimizer3.getMaxEvaluations();
        double double12 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType13 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(goalType13);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMax();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 100, (double) 'a', univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getEvaluations();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math3.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer3.optimize(0, univariateFunction10, goalType11, (double) (-1L), 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((-1.0d), (double) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMin();
        double double10 = brentOptimizer3.getMin();
        int int11 = brentOptimizer3.getEvaluations();
        int int12 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker13 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType14 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker13);
        org.junit.Assert.assertNull(goalType14);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, (double) (short) 10, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 100, (double) 'a', univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getEvaluations();
        double double5 = brentOptimizer3.getMin();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
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
        double double12 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction14 = null;
        org.apache.commons.math3.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair18 = brentOptimizer3.optimize((int) (short) 10, univariateFunction14, goalType15, (double) 100.0f, 10.0d);
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        double double8 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        double double10 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        double double12 = brentOptimizer3.getStartValue();
        int int13 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) (byte) 1);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        int int10 = brentOptimizer3.getEvaluations();
        double double11 = brentOptimizer3.getStartValue();
        double double12 = brentOptimizer3.getStartValue();
        double double13 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction15 = null;
        org.apache.commons.math3.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair20 = brentOptimizer3.optimize((int) (short) 10, univariateFunction15, goalType16, (double) (byte) 0, (double) (-1), (double) '4');
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        double double9 = brentOptimizer3.getMin();
        int int10 = brentOptimizer3.getEvaluations();
        int int11 = brentOptimizer3.getMaxEvaluations();
        double double12 = brentOptimizer3.getMax();
        double double13 = brentOptimizer3.getMax();
        double double14 = brentOptimizer3.getMin();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
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
        double double14 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker15 = brentOptimizer3.getConvergenceChecker();
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker15);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
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
        int int14 = brentOptimizer3.getMaxEvaluations();
        double double15 = brentOptimizer3.getMax();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) '#', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        double double5 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer3.optimize((int) (byte) 100, univariateFunction7, goalType8, (double) (short) 1, (double) 1L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        int int9 = brentOptimizer3.getEvaluations();
        int int10 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer3.optimize((int) (byte) 0, univariateFunction12, goalType13, (double) (byte) 0, (double) (byte) 0, (double) (short) 100);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 10.0f);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getMin();
        java.lang.Class<?> wildcardClass6 = brentOptimizer2.getClass();
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        double double5 = brentOptimizer3.getStartValue();
        int int6 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) '#', univariatePointValuePairConvergenceChecker2);
        java.lang.Class<?> wildcardClass4 = brentOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(1.0d, 10.0d);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        int int4 = brentOptimizer2.getEvaluations();
        double double5 = brentOptimizer2.getMax();
        double double6 = brentOptimizer2.getMin();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10L, (double) (byte) 100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
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
        double double12 = brentOptimizer3.getMax();
        double double13 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction15 = null;
        org.apache.commons.math3.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair19 = brentOptimizer3.optimize((int) (byte) 1, univariateFunction15, goalType16, (double) 10, (double) (-1L));
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) -1, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 1, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math3.optimization.GoalType goalType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair10 = brentOptimizer3.optimize((int) (byte) 0, univariateFunction5, goalType6, (double) (byte) 0, (double) (short) 1, (double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        int int8 = brentOptimizer3.getEvaluations();
        double double9 = brentOptimizer3.getMin();
        int int10 = brentOptimizer3.getEvaluations();
        int int11 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer3.optimize((int) (short) 0, univariateFunction13, goalType14, (double) 1.0f, (double) 0);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMin();
        int int8 = brentOptimizer3.getMaxEvaluations();
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
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getMax();
        int int6 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer2.getGoalType();
        double double8 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair15 = brentOptimizer2.optimize((int) (byte) 100, univariateFunction11, goalType12, (double) (-1L), (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
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
        double double12 = brentOptimizer3.getMin();
        int int13 = brentOptimizer3.getMaxEvaluations();
        double double14 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType15 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(goalType15);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        int int11 = brentOptimizer3.getMaxEvaluations();
        int int12 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction14 = null;
        org.apache.commons.math3.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair18 = brentOptimizer3.optimize((int) ' ', univariateFunction14, goalType15, (double) 100L, (double) 1L);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getStartValue();
        double double9 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10.0f, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        double double4 = brentOptimizer2.getMax();
        int int5 = brentOptimizer2.getEvaluations();
        double double6 = brentOptimizer2.getStartValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair7 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
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
        double double13 = brentOptimizer3.getMax();
        int int14 = brentOptimizer3.getMaxEvaluations();
        double double15 = brentOptimizer3.getMax();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
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
        double double12 = brentOptimizer3.getStartValue();
        int int13 = brentOptimizer3.getMaxEvaluations();
        double double14 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker15 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker15);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        double double8 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        int int10 = brentOptimizer3.getEvaluations();
        int int11 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 100, (double) 1L);
        double double3 = brentOptimizer2.getStartValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair4 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
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
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        double double10 = brentOptimizer3.getMax();
        int int11 = brentOptimizer3.getMaxEvaluations();
        int int12 = brentOptimizer3.getEvaluations();
        int int13 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        double double9 = brentOptimizer3.getMin();
        int int10 = brentOptimizer3.getEvaluations();
        int int11 = brentOptimizer3.getMaxEvaluations();
        double double12 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction14 = null;
        org.apache.commons.math3.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair18 = brentOptimizer3.optimize((int) (byte) 100, univariateFunction14, goalType15, (double) (byte) 100, (double) '4');
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        int int9 = brentOptimizer3.getMaxEvaluations();
        double double10 = brentOptimizer3.getStartValue();
        double double11 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        int int9 = brentOptimizer3.getEvaluations();
        int int10 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer3.getConvergenceChecker();
        double double13 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker14 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker15 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType16 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType17 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker14);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker15);
        org.junit.Assert.assertNull(goalType16);
        org.junit.Assert.assertNull(goalType17);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, (double) ' ', univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer3.optimize((int) (short) 10, univariateFunction6, goalType7, (double) 10, (double) 0, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 'a', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        double double9 = brentOptimizer3.getMax();
        double double10 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) ' ', (double) 100.0f, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer3.getConvergenceChecker();
        int int6 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10.0f, (double) (short) 1);
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction4 = null;
        org.apache.commons.math3.optimization.GoalType goalType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair8 = brentOptimizer2.optimize((int) (byte) 10, univariateFunction4, goalType5, (double) 10, (double) 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 100, 0.0d, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMin();
        double double8 = brentOptimizer3.getMax();
        double double9 = brentOptimizer3.getStartValue();
        double double10 = brentOptimizer3.getMin();
        int int11 = brentOptimizer3.getMaxEvaluations();
        double double12 = brentOptimizer3.getMax();
        java.lang.Class<?> wildcardClass13 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        double double11 = brentOptimizer3.getMin();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, (double) (byte) -1, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer2.getGoalType();
        double double6 = brentOptimizer2.getMax();
        int int7 = brentOptimizer2.getMaxEvaluations();
        int int8 = brentOptimizer2.getEvaluations();
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
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
        double double12 = brentOptimizer3.getMin();
        int int13 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker14 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction16 = null;
        org.apache.commons.math3.optimization.GoalType goalType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair21 = brentOptimizer3.optimize((int) (byte) 0, univariateFunction16, goalType17, 0.0d, (double) (short) 100, (double) (byte) 1);
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
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker14);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) '4', (double) 100.0f);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) '4', 100.0d);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math3.optimization.GoalType goalType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair10 = brentOptimizer2.optimize((int) (byte) 1, univariateFunction5, goalType6, (double) 100, (double) (-1.0f), (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getMax();
        double double10 = brentOptimizer3.getMin();
        double double11 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType12 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(goalType12);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1L, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 100, (double) 1L);
        double double3 = brentOptimizer2.getMax();
        double double4 = brentOptimizer2.getStartValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair5 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker13 = brentOptimizer3.getConvergenceChecker();
        double double14 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getStartValue();
        double double10 = brentOptimizer3.getMin();
        double double11 = brentOptimizer3.getMin();
        double double12 = brentOptimizer3.getStartValue();
        int int13 = brentOptimizer3.getEvaluations();
        double double14 = brentOptimizer3.getMin();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getEvaluations();
        double double8 = brentOptimizer3.getMax();
        double double9 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        int int11 = brentOptimizer3.getEvaluations();
        double double12 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType13 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction15 = null;
        org.apache.commons.math3.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair19 = brentOptimizer3.optimize((int) (short) 100, univariateFunction15, goalType16, (double) '#', (double) (short) 100);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(goalType13);
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) ' ', (double) (byte) 100, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair10 = brentOptimizer3.optimize((int) 'a', univariateFunction6, goalType7, (double) 100, (double) 1L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) ' ', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMax();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        int int9 = brentOptimizer3.getMaxEvaluations();
        int int10 = brentOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass11 = brentOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        int int8 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
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
        org.apache.commons.math3.optimization.GoalType goalType13 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(goalType13);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        double double5 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair8 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        int int5 = brentOptimizer3.getEvaluations();
        int int6 = brentOptimizer3.getMaxEvaluations();
        double double7 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer3.optimize(0, univariateFunction9, goalType10, (double) 100.0f, (double) (-1L), (double) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        int int9 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        double double11 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer3.getConvergenceChecker();
        double double13 = brentOptimizer3.getMax();
        double double14 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType15 = brentOptimizer3.getGoalType();
        int int16 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(goalType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 100, (double) '#');
        int int3 = brentOptimizer2.getEvaluations();
        int int4 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer2.getGoalType();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        double double9 = brentOptimizer3.getMin();
        int int10 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        int int12 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction14 = null;
        org.apache.commons.math3.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair19 = brentOptimizer3.optimize(100, univariateFunction14, goalType15, (double) 'a', (double) (short) -1, 0.0d);
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
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10, (double) 10);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        java.lang.Class<?> wildcardClass6 = brentOptimizer2.getClass();
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) ' ', (double) 10);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (-1.0f), (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        int int9 = brentOptimizer3.getEvaluations();
        double double10 = brentOptimizer3.getMin();
        int int11 = brentOptimizer3.getMaxEvaluations();
        double double12 = brentOptimizer3.getMax();
        double double13 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction15 = null;
        org.apache.commons.math3.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair19 = brentOptimizer3.optimize((int) (byte) 1, univariateFunction15, goalType16, (double) 0L, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 100, (double) 10L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
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
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, (double) (short) 10, univariatePointValuePairConvergenceChecker2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair4 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        int int4 = brentOptimizer2.getEvaluations();
        double double5 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer2.getGoalType();
        int int7 = brentOptimizer2.getMaxEvaluations();
        double double8 = brentOptimizer2.getMax();
        double double9 = brentOptimizer2.getMin();
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 100L, univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getEvaluations();
        double double5 = brentOptimizer3.getMin();
        int int6 = brentOptimizer3.getEvaluations();
        int int7 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair10 = brentOptimizer3.optimize((-1), univariateFunction6, goalType7, (double) (byte) 100, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        int int3 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        int int5 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer2.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair7 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMin();
        double double10 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        double double12 = brentOptimizer3.getMin();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getMax();
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
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((-1.0d), (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
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
        double double15 = brentOptimizer3.getMax();
        double double16 = brentOptimizer3.getMax();
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 10.0f);
        double double3 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        int int6 = brentOptimizer2.getEvaluations();
        int int7 = brentOptimizer2.getEvaluations();
        double double8 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math3.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer2.optimize((int) (byte) 0, univariateFunction10, goalType11, (double) (-1L), (double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100, (double) (byte) 100, univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getMaxEvaluations();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getMax();
        java.lang.Class<?> wildcardClass7 = brentOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        int int8 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        double double10 = brentOptimizer3.getMin();
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
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(goalType11);
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getMax();
        int int9 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        int int11 = brentOptimizer3.getMaxEvaluations();
        int int12 = brentOptimizer3.getMaxEvaluations();
        double double13 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction15 = null;
        org.apache.commons.math3.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair20 = brentOptimizer3.optimize((int) (byte) 0, univariateFunction15, goalType16, (double) 100, (double) (byte) 10, (double) (short) 0);
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
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        double double6 = brentOptimizer3.getMin();
        double double7 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer3.optimize(100, univariateFunction9, goalType10, (double) (byte) 10, (double) 1, 1.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        int int8 = brentOptimizer3.getEvaluations();
        double double9 = brentOptimizer3.getMax();
        int int10 = brentOptimizer3.getEvaluations();
        int int11 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer3.optimize(100, univariateFunction13, goalType14, (double) 10.0f, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100.0f, 1.0d);
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
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        double double8 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        int int11 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10, (double) 10L);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getMin();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        int int6 = brentOptimizer2.getEvaluations();
        double double7 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer2.getGoalType();
        double double9 = brentOptimizer2.getMax();
        double double10 = brentOptimizer2.getMax();
        java.lang.Class<?> wildcardClass11 = brentOptimizer2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) 1L, univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair10 = brentOptimizer3.optimize((-1), univariateFunction6, goalType7, (double) 100.0f, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        double double5 = brentOptimizer3.getMin();
        double double6 = brentOptimizer3.getStartValue();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math3.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer3.optimize((int) '4', univariateFunction10, goalType11, (double) (short) 1, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
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
        int int14 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType15 = brentOptimizer3.getGoalType();
        double double16 = brentOptimizer3.getMax();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(goalType15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(0.0d, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getMax();
        int int6 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer2.getGoalType();
        double double8 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer2.getGoalType();
        double double10 = brentOptimizer2.getStartValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 100, (double) 1L);
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction4 = null;
        org.apache.commons.math3.optimization.GoalType goalType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair8 = brentOptimizer2.optimize(0, univariateFunction4, goalType5, 100.0d, (double) 1L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
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
        org.apache.commons.math3.optimization.GoalType goalType16 = brentOptimizer3.getGoalType();
        double double17 = brentOptimizer3.getStartValue();
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
        org.junit.Assert.assertNull(goalType16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) ' ', 1.0d, univariatePointValuePairConvergenceChecker2);
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getStartValue();
        int int10 = brentOptimizer3.getEvaluations();
        int int11 = brentOptimizer3.getEvaluations();
        double double12 = brentOptimizer3.getMax();
        double double13 = brentOptimizer3.getMin();
        double double14 = brentOptimizer3.getMin();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        int int10 = brentOptimizer3.getMaxEvaluations();
        double double11 = brentOptimizer3.getStartValue();
        int int12 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        double double9 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize(0, univariateFunction11, goalType12, (double) 10L, (-1.0d), (double) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        double double6 = brentOptimizer3.getMin();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getMax();
        int int10 = brentOptimizer3.getEvaluations();
        double double11 = brentOptimizer3.getMin();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 10);
        double double3 = brentOptimizer2.getMin();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getMin();
        double double6 = brentOptimizer2.getMin();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 1);
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction4 = null;
        org.apache.commons.math3.optimization.GoalType goalType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair8 = brentOptimizer2.optimize((int) (byte) 10, univariateFunction4, goalType5, (double) 0L, 100.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        double double6 = brentOptimizer3.getMin();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        double double10 = brentOptimizer3.getStartValue();
        double double11 = brentOptimizer3.getStartValue();
        double double12 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        double double5 = brentOptimizer3.getMin();
        int int6 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math3.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair12 = brentOptimizer3.optimize((int) (byte) 100, univariateFunction8, goalType9, (double) '#', (double) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
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
        int int14 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker15 = brentOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass16 = brentOptimizer3.getClass();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, (double) (short) 100);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        org.junit.Assert.assertNull(goalType3);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker16 = brentOptimizer3.getConvergenceChecker();
        double double17 = brentOptimizer3.getMin();
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
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        int int6 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math3.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair13 = brentOptimizer2.optimize((int) 'a', univariateFunction8, goalType9, 10.0d, (double) 10L, (double) 1.0f);
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
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair10 = brentOptimizer3.optimize((int) (short) 10, univariateFunction6, goalType7, (double) 100L, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        double double5 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer2.getConvergenceChecker();
        double double8 = brentOptimizer2.getMin();
        double double9 = brentOptimizer2.getMax();
        int int10 = brentOptimizer2.getEvaluations();
        int int11 = brentOptimizer2.getEvaluations();
        int int12 = brentOptimizer2.getMaxEvaluations();
        double double13 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType14 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker15 = brentOptimizer2.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(goalType14);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker15);
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, (double) 1.0f);
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction4 = null;
        org.apache.commons.math3.optimization.GoalType goalType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair8 = brentOptimizer2.optimize((int) 'a', univariateFunction4, goalType5, (double) 10L, (double) 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) '#', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer3.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair6 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        double double8 = brentOptimizer3.getStartValue();
        double double9 = brentOptimizer3.getMin();
        double double10 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getMax();
        int int6 = brentOptimizer2.getMaxEvaluations();
        double double7 = brentOptimizer2.getMin();
        double double8 = brentOptimizer2.getMin();
        int int9 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair15 = brentOptimizer2.optimize(100, univariateFunction11, goalType12, (double) ' ', (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10L, (double) (byte) 100);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        double double4 = brentOptimizer2.getMax();
        int int5 = brentOptimizer2.getMaxEvaluations();
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 1, (double) (short) 100, univariatePointValuePairConvergenceChecker2);
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, (double) (byte) 10);
        int int3 = brentOptimizer2.getMaxEvaluations();
        double double4 = brentOptimizer2.getMax();
        java.lang.Class<?> wildcardClass5 = brentOptimizer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) '#', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getEvaluations();
        double double8 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getEvaluations();
        int int8 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        double double10 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer3.optimize((int) '4', univariateFunction12, goalType13, (double) 0, (double) (-1), (double) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) '4', 100.0d);
        double double3 = brentOptimizer2.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math3.optimization.GoalType goalType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair10 = brentOptimizer2.optimize(0, univariateFunction5, goalType6, (double) (short) 10, (double) 'a', (double) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, (double) (byte) 10);
        int int3 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        int int5 = brentOptimizer2.getMaxEvaluations();
        int int6 = brentOptimizer2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10L, (double) (short) 100, univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer3.optimize((int) '#', univariateFunction7, goalType8, (double) (short) 10, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getMaxEvaluations();
        int int8 = brentOptimizer3.getMaxEvaluations();
        int int9 = brentOptimizer3.getMaxEvaluations();
        double double10 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(goalType11);
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getMax();
        int int9 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertNull(goalType11);
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        double double6 = brentOptimizer3.getMin();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        int int10 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
        double double12 = brentOptimizer3.getMin();
        int int13 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction15 = null;
        org.apache.commons.math3.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair19 = brentOptimizer3.optimize((int) (short) 1, univariateFunction15, goalType16, 0.0d, (double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100, (double) (byte) 1);
        int int3 = brentOptimizer2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
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
        double double12 = brentOptimizer3.getStartValue();
        double double13 = brentOptimizer3.getMax();
        double double14 = brentOptimizer3.getStartValue();
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        double double8 = brentOptimizer3.getMax();
        double double9 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        double double11 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
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
        double double13 = brentOptimizer3.getMin();
        double double14 = brentOptimizer3.getMax();
        double double15 = brentOptimizer3.getStartValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.doOptimize();
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        double double11 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer3.optimize((int) (byte) 1, univariateFunction13, goalType14, (double) 1.0f, (double) 0);
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, (double) (short) 10);
        int int3 = brentOptimizer2.getEvaluations();
        double double4 = brentOptimizer2.getMax();
        double double5 = brentOptimizer2.getMin();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
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
        double double12 = brentOptimizer3.getStartValue();
        double double13 = brentOptimizer3.getMax();
        java.lang.Class<?> wildcardClass14 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getStartValue();
        double double9 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        double double11 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType12 = brentOptimizer3.getGoalType();
        int int13 = brentOptimizer3.getMaxEvaluations();
        double double14 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        int int9 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        int int12 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker13 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker13);
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1.0f, (double) (short) 10);
        int int3 = brentOptimizer2.getMaxEvaluations();
        int int4 = brentOptimizer2.getEvaluations();
        double double5 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer2.getConvergenceChecker();
        java.lang.Class<?> wildcardClass7 = brentOptimizer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer2.getGoalType();
        double double7 = brentOptimizer2.getMax();
        double double8 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer2.getGoalType();
        int int11 = brentOptimizer2.getEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, (double) ' ', univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        int int8 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMin();
        double double8 = brentOptimizer3.getStartValue();
        double double9 = brentOptimizer3.getStartValue();
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
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 10L, univariatePointValuePairConvergenceChecker2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair4 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10.0f, (double) 10);
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction4 = null;
        org.apache.commons.math3.optimization.GoalType goalType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair9 = brentOptimizer2.optimize(0, univariateFunction4, goalType5, (double) (-1), (double) (short) -1, 1.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        int int4 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer2.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 10, 100.0d, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math3.optimization.GoalType goalType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair9 = brentOptimizer3.optimize((int) 'a', univariateFunction5, goalType6, 100.0d, (double) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, 1.0d);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        int int4 = brentOptimizer2.getMaxEvaluations();
        int int5 = brentOptimizer2.getMaxEvaluations();
        int int6 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer2.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10L, (double) 10);
        double double3 = brentOptimizer2.getMin();
        int int4 = brentOptimizer2.getEvaluations();
        int int5 = brentOptimizer2.getEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, (double) 100);
        int int3 = brentOptimizer2.getMaxEvaluations();
        double double4 = brentOptimizer2.getStartValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair5 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10, (double) 10);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        int int6 = brentOptimizer2.getMaxEvaluations();
        double double7 = brentOptimizer2.getMin();
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMin();
        double double10 = brentOptimizer3.getMax();
        double double11 = brentOptimizer3.getStartValue();
        double double12 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker13 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker13);
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getEvaluations();
        double double8 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        double double10 = brentOptimizer3.getMin();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer3.getConvergenceChecker();
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        int int6 = brentOptimizer3.getEvaluations();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        double double10 = brentOptimizer3.getMin();
        java.lang.Class<?> wildcardClass11 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(0.0d, 100.0d, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(1.0d, 10.0d);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        int int4 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer2.getConvergenceChecker();
        double double8 = brentOptimizer2.getMax();
        int int9 = brentOptimizer2.getMaxEvaluations();
        java.lang.Class<?> wildcardClass10 = brentOptimizer2.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        int int8 = brentOptimizer3.getEvaluations();
        double double9 = brentOptimizer3.getMax();
        int int10 = brentOptimizer3.getEvaluations();
        int int11 = brentOptimizer3.getEvaluations();
        double double12 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker13 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker13);
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 'a', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        double double9 = brentOptimizer3.getMax();
        double double10 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer3.optimize((int) (short) 0, univariateFunction12, goalType13, (double) (short) -1, (double) (byte) 0, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
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
        org.apache.commons.math3.optimization.GoalType goalType13 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType14 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(goalType13);
        org.junit.Assert.assertNull(goalType14);
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        int int5 = brentOptimizer3.getEvaluations();
        int int6 = brentOptimizer3.getMaxEvaluations();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize((int) (byte) 1, univariateFunction11, goalType12, (double) (-1), (double) (byte) 100, (double) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(goalType9);
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10, (double) 10);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        double double6 = brentOptimizer2.getMax();
        double double7 = brentOptimizer2.getMax();
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, 1.0d);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        int int4 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        int int6 = brentOptimizer2.getMaxEvaluations();
        int int7 = brentOptimizer2.getMaxEvaluations();
        int int8 = brentOptimizer2.getEvaluations();
        double double9 = brentOptimizer2.getMin();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(1.0d, 10.0d);
        int int3 = brentOptimizer2.getMaxEvaluations();
        double double4 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair12 = brentOptimizer2.optimize(1, univariateFunction7, goalType8, (double) (byte) -1, (double) 100, (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10.0f, (double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair3 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
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
        double double14 = brentOptimizer3.getMin();
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
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        int int8 = brentOptimizer3.getEvaluations();
        double double9 = brentOptimizer3.getStartValue();
        double double10 = brentOptimizer3.getMax();
        java.lang.Class<?> wildcardClass11 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
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
        int int12 = brentOptimizer3.getEvaluations();
        double double13 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType14 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction16 = null;
        org.apache.commons.math3.optimization.GoalType goalType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair20 = brentOptimizer3.optimize((int) ' ', univariateFunction16, goalType17, (double) (-1L), (double) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(goalType14);
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 10, (double) (byte) 100);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math3.optimization.GoalType goalType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair10 = brentOptimizer2.optimize((int) (short) 10, univariateFunction5, goalType6, (double) (byte) 1, (double) 0, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType3);
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) '4');
        double double3 = brentOptimizer2.getMax();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair4 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 0, (double) (short) 10, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        double double5 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer2.getConvergenceChecker();
        double double9 = brentOptimizer2.getMin();
        int int10 = brentOptimizer2.getMaxEvaluations();
        double double11 = brentOptimizer2.getMin();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100, 1.0d);
        int int3 = brentOptimizer2.getEvaluations();
        int int4 = brentOptimizer2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        int int5 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer2.getGoalType();
        int int7 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer2.getGoalType();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        double double5 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
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
        double double12 = brentOptimizer3.getMin();
        double double13 = brentOptimizer3.getMin();
        double double14 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction16 = null;
        org.apache.commons.math3.optimization.GoalType goalType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair20 = brentOptimizer3.optimize((int) (byte) -1, univariateFunction16, goalType17, (double) (short) 1, (double) (short) 10);
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        int int6 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        double double11 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer3.optimize((int) '#', univariateFunction13, goalType14, (double) 'a', (double) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        int int9 = brentOptimizer3.getMaxEvaluations();
        int int10 = brentOptimizer3.getMaxEvaluations();
        double double11 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        double double10 = brentOptimizer3.getMax();
        int int11 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer3.getConvergenceChecker();
        int int13 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction15 = null;
        org.apache.commons.math3.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair20 = brentOptimizer3.optimize((int) (short) 0, univariateFunction15, goalType16, (double) 100, (double) 0, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) '#', univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer3.optimize((int) ' ', univariateFunction6, goalType7, 100.0d, (double) (byte) 10, (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 10, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair12 = brentOptimizer3.optimize((-1), univariateFunction7, goalType8, (double) (byte) 10, (double) '#', (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        int int9 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        int int11 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer3.getConvergenceChecker();
        int int13 = brentOptimizer3.getMaxEvaluations();
        int int14 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) '4', (double) 10, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMax();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        int int6 = brentOptimizer3.getEvaluations();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getMax();
        double double9 = brentOptimizer3.getMin();
        double double10 = brentOptimizer3.getStartValue();
        int int11 = brentOptimizer3.getMaxEvaluations();
        double double12 = brentOptimizer3.getStartValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair13 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMin();
        double double8 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math3.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer3.optimize((int) (byte) -1, univariateFunction10, goalType11, (double) (byte) 0, (double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getEvaluations();
        double double8 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        double double11 = brentOptimizer3.getMin();
        double double12 = brentOptimizer3.getMin();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) ' ', (double) 100.0f, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMax();
        int int8 = brentOptimizer3.getMaxEvaluations();
        int int9 = brentOptimizer3.getEvaluations();
        double double10 = brentOptimizer3.getStartValue();
        double double11 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType12 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction14 = null;
        org.apache.commons.math3.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair19 = brentOptimizer3.optimize(10, univariateFunction14, goalType15, (double) 1L, (double) (-1.0f), (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(goalType12);
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getEvaluations();
        double double8 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        double double10 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize((int) (short) 100, univariateFunction12, goalType13, (double) 1, (double) ' ');
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair13 = brentOptimizer3.doOptimize();
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 1, (double) (byte) -1, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10, (double) (short) 10, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        double double5 = brentOptimizer3.getMin();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getMax();
        int int6 = brentOptimizer2.getMaxEvaluations();
        int int7 = brentOptimizer2.getEvaluations();
        int int8 = brentOptimizer2.getMaxEvaluations();
        double double9 = brentOptimizer2.getMax();
        double double10 = brentOptimizer2.getMax();
        double double11 = brentOptimizer2.getMin();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getMax();
        double double10 = brentOptimizer3.getMax();
        double double11 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        int int6 = brentOptimizer2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        double double5 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        double double8 = brentOptimizer3.getMax();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        double double7 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        double double5 = brentOptimizer2.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair12 = brentOptimizer2.optimize((int) (short) 10, univariateFunction7, goalType8, (double) 1L, (double) 10.0f, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        int int8 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        int int10 = brentOptimizer3.getMaxEvaluations();
        double double11 = brentOptimizer3.getStartValue();
        double double12 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        int int8 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        int int11 = brentOptimizer3.getEvaluations();
        double double12 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType13 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(goalType13);
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100, univariatePointValuePairConvergenceChecker2);
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 1);
        int int3 = brentOptimizer2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        int int8 = brentOptimizer3.getEvaluations();
        int int9 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        int int11 = brentOptimizer3.getMaxEvaluations();
        double double12 = brentOptimizer3.getMax();
        int int13 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        double double5 = brentOptimizer3.getMin();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair9 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 100);
        double double3 = brentOptimizer2.getMin();
        double double4 = brentOptimizer2.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer2.optimize(0, univariateFunction6, goalType7, (double) 1, (-1.0d), (double) 1L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
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
        double double13 = brentOptimizer3.getStartValue();
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
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) ' ', (double) (short) 100);
        java.lang.Class<?> wildcardClass3 = brentOptimizer2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 1L);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        double double5 = brentOptimizer2.getStartValue();
        java.lang.Class<?> wildcardClass6 = brentOptimizer2.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getStartValue();
        int int10 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        double double12 = brentOptimizer3.getStartValue();
        int int13 = brentOptimizer3.getEvaluations();
        double double14 = brentOptimizer3.getMin();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        double double6 = brentOptimizer3.getMin();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        double double10 = brentOptimizer3.getStartValue();
        double double11 = brentOptimizer3.getStartValue();
        int int12 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker13 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker13);
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 10, (double) 10.0f);
        int int3 = brentOptimizer2.getMaxEvaluations();
        int int4 = brentOptimizer2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getMin();
        java.lang.Class<?> wildcardClass10 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        double double8 = brentOptimizer3.getStartValue();
        double double9 = brentOptimizer3.getMax();
        int int10 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 0.0f, 100.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 10, 100.0d, univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer3.optimize((int) (short) 10, univariateFunction6, goalType7, (double) 10L, (double) (short) -1, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        int int5 = brentOptimizer3.getEvaluations();
        int int6 = brentOptimizer3.getMaxEvaluations();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getMax();
        java.lang.Class<?> wildcardClass9 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        int int9 = brentOptimizer3.getMaxEvaluations();
        int int10 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker13 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker13);
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', 10.0d, univariatePointValuePairConvergenceChecker2);
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getEvaluations();
        int int8 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        int int10 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize(1, univariateFunction12, goalType13, (double) 0.0f, (double) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4836");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getMin();
        int int6 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer2.getGoalType();
        double double8 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer2.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4837");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 10.0f);
        double double3 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        int int6 = brentOptimizer2.getEvaluations();
        double double7 = brentOptimizer2.getMax();
        int int8 = brentOptimizer2.getMaxEvaluations();
        int int9 = brentOptimizer2.getEvaluations();
        int int10 = brentOptimizer2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4838");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 0, (double) 100, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4839");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        int int6 = brentOptimizer3.getEvaluations();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getMax();
        int int9 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
        int int12 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction14 = null;
        org.apache.commons.math3.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair19 = brentOptimizer3.optimize((int) '4', univariateFunction14, goalType15, 1.0d, (double) '#', 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4840");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 1, (double) 1);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math3.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair13 = brentOptimizer2.optimize(100, univariateFunction8, goalType9, (double) 100.0f, (double) 100.0f, (double) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 10, (double) (byte) 1);
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4842");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) ' ', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMax();
        double double5 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = univariatePointValuePairConvergenceChecker6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4843");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10.0f, (double) (short) -1, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10L, (double) (byte) 100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4845");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        double double5 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4846");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        int int9 = brentOptimizer3.getMaxEvaluations();
        double double10 = brentOptimizer3.getMin();
        double double11 = brentOptimizer3.getStartValue();
        int int12 = brentOptimizer3.getMaxEvaluations();
        double double13 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType14 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(goalType14);
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) ' ', (double) (byte) 1, univariatePointValuePairConvergenceChecker2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair4 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4848");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        int int5 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer2.getGoalType();
        double double7 = brentOptimizer2.getMax();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4849");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        double double4 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer2.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair7 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4850");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        double double5 = brentOptimizer3.getMin();
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
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4851");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        double double4 = brentOptimizer2.getMin();
        double double5 = brentOptimizer2.getStartValue();
        double double6 = brentOptimizer2.getStartValue();
        int int7 = brentOptimizer2.getMaxEvaluations();
        double double8 = brentOptimizer2.getStartValue();
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4852");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        double double8 = brentOptimizer3.getMax();
        double double9 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair18 = brentOptimizer3.optimize(0, univariateFunction13, goalType14, (double) 10.0f, 0.0d, (double) 10);
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
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4853");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) '4', (double) '#', univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getMaxEvaluations();
        double double5 = brentOptimizer3.getStartValue();
        int int6 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4854");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) -1, 1.0d, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4855");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) -1, (double) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4856");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getMax();
        int int6 = brentOptimizer2.getMaxEvaluations();
        int int7 = brentOptimizer2.getMaxEvaluations();
        double double8 = brentOptimizer2.getMax();
        int int9 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer2.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
    }

    @Test
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4857");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        int int9 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        int int11 = brentOptimizer3.getEvaluations();
        int int12 = brentOptimizer3.getMaxEvaluations();
        int int13 = brentOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass14 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4858");
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
        int int13 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker14 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction16 = null;
        org.apache.commons.math3.optimization.GoalType goalType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair21 = brentOptimizer3.optimize(1, univariateFunction16, goalType17, (double) 1L, (double) 0L, (double) 100L);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker14);
    }

    @Test
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4859");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        int int9 = brentOptimizer3.getMaxEvaluations();
        int int10 = brentOptimizer3.getMaxEvaluations();
        double double11 = brentOptimizer3.getMax();
        double double12 = brentOptimizer3.getMax();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair13 = brentOptimizer3.doOptimize();
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4860");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getEvaluations();
        double double8 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        double double10 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
        int int12 = brentOptimizer3.getMaxEvaluations();
        double double13 = brentOptimizer3.getMax();
        double double14 = brentOptimizer3.getMin();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4861");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getStartValue();
        int int10 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(goalType11);
    }

    @Test
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4862");
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
        int int14 = brentOptimizer3.getEvaluations();
        double double15 = brentOptimizer3.getMin();
        double double16 = brentOptimizer3.getMin();
        int int17 = brentOptimizer3.getMaxEvaluations();
        int int18 = brentOptimizer3.getEvaluations();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4863");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 10.0f);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getMin();
        double double6 = brentOptimizer2.getStartValue();
        int int7 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair13 = brentOptimizer2.optimize((int) (byte) 0, univariateFunction9, goalType10, (double) 'a', (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4864");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        int int9 = brentOptimizer3.getMaxEvaluations();
        int int10 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer3.optimize((-1), univariateFunction13, goalType14, (double) 10.0f, (double) (byte) 10);
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
        org.junit.Assert.assertNull(goalType11);
    }

    @Test
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4865");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 'a', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer3.optimize((int) (short) 0, univariateFunction9, goalType10, (double) 1.0f, 0.0d, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4866");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer3.getConvergenceChecker();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getMax();
        int int10 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4867");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        double double4 = brentOptimizer2.getMax();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer2.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
    }

    @Test
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4868");
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
        double double12 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType13 = brentOptimizer3.getGoalType();
        double double14 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType15 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(goalType13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(goalType15);
    }

    @Test
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4869");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, 1.0d);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        int int4 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        int int6 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math3.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair12 = brentOptimizer2.optimize((-1), univariateFunction8, goalType9, (double) 100L, (double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4870");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        double double5 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer2.getConvergenceChecker();
        int int7 = brentOptimizer2.getEvaluations();
        double double8 = brentOptimizer2.getMin();
        double double9 = brentOptimizer2.getMax();
        int int10 = brentOptimizer2.getMaxEvaluations();
        int int11 = brentOptimizer2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4871");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        double double9 = brentOptimizer3.getMin();
        int int10 = brentOptimizer3.getEvaluations();
        int int11 = brentOptimizer3.getMaxEvaluations();
        double double12 = brentOptimizer3.getMax();
        double double13 = brentOptimizer3.getStartValue();
        double double14 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType15 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(goalType15);
    }

    @Test
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4872");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        int int7 = brentOptimizer3.getMaxEvaluations();
        int int8 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
    }

    @Test
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4873");
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
        double double12 = brentOptimizer3.getMin();
        double double13 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test4874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4874");
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
        double double13 = brentOptimizer3.getStartValue();
        double double14 = brentOptimizer3.getMax();
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4875");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        double double8 = brentOptimizer3.getMax();
        double double9 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        int int11 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4876");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, (double) (byte) 10, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer3.getConvergenceChecker();
        int int6 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4877");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1.0f, (double) (short) 10);
        double double3 = brentOptimizer2.getStartValue();
        double double4 = brentOptimizer2.getMin();
        double double5 = brentOptimizer2.getMin();
        int int6 = brentOptimizer2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4878");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) (byte) 10, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4879");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        int int6 = brentOptimizer3.getEvaluations();
        double double7 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer3.optimize((int) (short) 1, univariateFunction9, goalType10, (double) 'a', (double) 100.0f, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4880");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 100, (double) 0.0f, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4881");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100.0f, (double) (byte) 1);
        double double3 = brentOptimizer2.getStartValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4882");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(1.0d, (double) '4');
        int int3 = brentOptimizer2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4883");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        double double5 = brentOptimizer2.getMin();
        double double6 = brentOptimizer2.getStartValue();
        java.lang.Class<?> wildcardClass7 = brentOptimizer2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4884");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker15 = brentOptimizer3.getConvergenceChecker();
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
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker15);
    }

    @Test
    public void test4885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4885");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMax();
        double double9 = brentOptimizer3.getMax();
        int int10 = brentOptimizer3.getEvaluations();
        int int11 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer3.optimize((int) (short) 0, univariateFunction13, goalType14, (double) 0, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4886");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        int int5 = brentOptimizer3.getEvaluations();
        int int6 = brentOptimizer3.getMaxEvaluations();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getMax();
        int int9 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
    }

    @Test
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4887");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = univariatePointValuePairConvergenceChecker7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
    }

    @Test
    public void test4888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4888");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        double double7 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4889");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (-1), (double) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4890");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        double double8 = brentOptimizer3.getMax();
        double double9 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer3.optimize(0, univariateFunction13, goalType14, (double) ' ', 1.0d);
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
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
    }

    @Test
    public void test4891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4891");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 'a', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        double double9 = brentOptimizer3.getMax();
        double double10 = brentOptimizer3.getMin();
        double double11 = brentOptimizer3.getMax();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test4892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4892");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        int int8 = brentOptimizer3.getEvaluations();
        double double9 = brentOptimizer3.getMin();
        int int10 = brentOptimizer3.getEvaluations();
        double double11 = brentOptimizer3.getMax();
        double double12 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4893");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        int int6 = brentOptimizer2.getMaxEvaluations();
        double double7 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math3.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer2.optimize((-1), univariateFunction10, goalType11, (double) (-1L), (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4894");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10, (double) 10, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMax();
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
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4895");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        double double8 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        double double10 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
        double double12 = brentOptimizer3.getMin();
        double double13 = brentOptimizer3.getMax();
        double double14 = brentOptimizer3.getStartValue();
        int int15 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker16 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker16);
    }

    @Test
    public void test4896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4896");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        double double9 = brentOptimizer3.getStartValue();
        double double10 = brentOptimizer3.getMin();
        double double11 = brentOptimizer3.getMax();
        double double12 = brentOptimizer3.getMax();
        double double13 = brentOptimizer3.getMin();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4897");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        int int5 = brentOptimizer3.getEvaluations();
        int int6 = brentOptimizer3.getMaxEvaluations();
        double double7 = brentOptimizer3.getMin();
        double double8 = brentOptimizer3.getMax();
        double double9 = brentOptimizer3.getMin();
        int int10 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4898");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 1, (double) 1, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer3.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair6 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
    }

    @Test
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4899");
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
        int int14 = brentOptimizer3.getEvaluations();
        double double15 = brentOptimizer3.getMin();
        double double16 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker17 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction19 = null;
        org.apache.commons.math3.optimization.GoalType goalType20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair24 = brentOptimizer3.optimize((int) ' ', univariateFunction19, goalType20, 100.0d, (-1.0d), (double) 0.0f);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker17);
    }

    @Test
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4900");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 0L, (double) '4', univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4901");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10.0f, (double) 10);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        double double4 = brentOptimizer2.getMax();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer2.optimize((int) (byte) 10, univariateFunction7, goalType8, (double) (short) 10, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4902");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getStartValue();
        int int10 = brentOptimizer3.getMaxEvaluations();
        int int11 = brentOptimizer3.getEvaluations();
        double double12 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker13 = brentOptimizer3.getConvergenceChecker();
        int int14 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4903");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMax();
        int int8 = brentOptimizer3.getMaxEvaluations();
        int int9 = brentOptimizer3.getEvaluations();
        double double10 = brentOptimizer3.getStartValue();
        double double11 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair18 = brentOptimizer3.optimize((int) (short) 1, univariateFunction13, goalType14, 0.0d, (double) 1, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test4904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4904");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        int int4 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        int int6 = brentOptimizer2.getEvaluations();
        java.lang.Class<?> wildcardClass7 = brentOptimizer2.getClass();
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4905");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        int int9 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        double double11 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer3.getConvergenceChecker();
        int int13 = brentOptimizer3.getMaxEvaluations();
        double double14 = brentOptimizer3.getMin();
        int int15 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType16 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction18 = null;
        org.apache.commons.math3.optimization.GoalType goalType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair23 = brentOptimizer3.optimize((int) (short) -1, univariateFunction18, goalType19, (double) (short) -1, (double) (short) 0, (double) '4');
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(goalType16);
    }

    @Test
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4906");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        int int5 = brentOptimizer3.getMaxEvaluations();
        int int6 = brentOptimizer3.getMaxEvaluations();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        int int9 = brentOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass10 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4907");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, (double) (byte) 1, univariatePointValuePairConvergenceChecker2);
        java.lang.Class<?> wildcardClass4 = brentOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4908");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1L, (double) 100.0f);
        int int3 = brentOptimizer2.getMaxEvaluations();
        double double4 = brentOptimizer2.getStartValue();
        java.lang.Class<?> wildcardClass5 = brentOptimizer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4909");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 1, (double) '#', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        java.lang.Class<?> wildcardClass5 = brentOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4910");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getStartValue();
        int int10 = brentOptimizer3.getEvaluations();
        int int11 = brentOptimizer3.getEvaluations();
        double double12 = brentOptimizer3.getMax();
        int int13 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker14 = brentOptimizer3.getConvergenceChecker();
        int int15 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4911");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 10.0f);
        double double3 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        double double6 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer2.getGoalType();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4912");
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
        int int13 = brentOptimizer3.getEvaluations();
        double double14 = brentOptimizer3.getMax();
        double double15 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test4913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4913");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        int int9 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        double double11 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer3.getConvergenceChecker();
        double double13 = brentOptimizer3.getMax();
        double double14 = brentOptimizer3.getMin();
        double double15 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test4914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4914");
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
        double double15 = brentOptimizer3.getMin();
        int int16 = brentOptimizer3.getMaxEvaluations();
        double double17 = brentOptimizer3.getMin();
        double double18 = brentOptimizer3.getMin();
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test4915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4915");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMax();
        double double9 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        int int11 = brentOptimizer3.getMaxEvaluations();
        double double12 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4916");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 1L);
        double double3 = brentOptimizer2.getMax();
        int int4 = brentOptimizer2.getEvaluations();
        double double5 = brentOptimizer2.getMin();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test4917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4917");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getMaxEvaluations();
        int int8 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math3.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair15 = brentOptimizer3.optimize((int) (short) 100, univariateFunction10, goalType11, (double) 1L, (double) 100.0f, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4918");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMin();
        double double8 = brentOptimizer3.getMax();
        double double9 = brentOptimizer3.getStartValue();
        double double10 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType12 = brentOptimizer3.getGoalType();
        double double13 = brentOptimizer3.getStartValue();
        int int14 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction16 = null;
        org.apache.commons.math3.optimization.GoalType goalType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair21 = brentOptimizer3.optimize((int) (short) 0, univariateFunction16, goalType17, (double) (byte) 0, 0.0d, 0.0d);
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
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4919");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker13 = brentOptimizer3.getConvergenceChecker();
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4920");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        int int8 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        int int11 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4921");
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
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction16 = null;
        org.apache.commons.math3.optimization.GoalType goalType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair20 = brentOptimizer3.optimize((int) (short) 10, univariateFunction16, goalType17, (double) (byte) 100, (double) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4922");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        int int6 = brentOptimizer3.getEvaluations();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getMax();
        double double9 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        double double11 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
    }

    @Test
    public void test4923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4923");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        double double6 = brentOptimizer3.getMax();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        int int9 = brentOptimizer3.getEvaluations();
        double double10 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer3.optimize((int) 'a', univariateFunction12, goalType13, (double) 'a', (double) 'a', (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4924");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        int int8 = brentOptimizer3.getMaxEvaluations();
        double double9 = brentOptimizer3.getMin();
        double double10 = brentOptimizer3.getMax();
        int int11 = brentOptimizer3.getEvaluations();
        int int12 = brentOptimizer3.getMaxEvaluations();
        double double13 = brentOptimizer3.getStartValue();
        double double14 = brentOptimizer3.getMin();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test4925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4925");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        int int6 = brentOptimizer3.getEvaluations();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4926");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getStartValue();
        double double10 = brentOptimizer3.getStartValue();
        int int11 = brentOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass12 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4927");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) '4', (double) '#', univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass8 = brentOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4928");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) (short) 1);
        double double3 = brentOptimizer2.getMin();
        double double4 = brentOptimizer2.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer2.optimize(1, univariateFunction6, goalType7, (double) 100, 1.0d, (double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test4929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4929");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        int int8 = brentOptimizer3.getMaxEvaluations();
        int int9 = brentOptimizer3.getEvaluations();
        int int10 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4930");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10L, 1.0d, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        java.lang.Class<?> wildcardClass5 = brentOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4931");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 'a', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math3.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair13 = brentOptimizer3.optimize((int) (short) 100, univariateFunction8, goalType9, (double) 'a', (double) (-1.0f), (double) 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test4932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4932");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        int int9 = brentOptimizer3.getEvaluations();
        double double10 = brentOptimizer3.getMin();
        double double11 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType12 = brentOptimizer3.getGoalType();
        double double13 = brentOptimizer3.getMin();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test4933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4933");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        int int5 = brentOptimizer2.getMaxEvaluations();
        int int6 = brentOptimizer2.getMaxEvaluations();
        double double7 = brentOptimizer2.getMin();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4934");
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
        int int12 = brentOptimizer3.getMaxEvaluations();
        double double13 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker14 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker14);
    }

    @Test
    public void test4935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4935");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMin();
        double double10 = brentOptimizer3.getMax();
        double double11 = brentOptimizer3.getStartValue();
        double double12 = brentOptimizer3.getMin();
        int int13 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4936");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) ' ', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMax();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        int int9 = brentOptimizer3.getMaxEvaluations();
        int int10 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize(100, univariateFunction12, goalType13, (double) 0, (double) 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4937");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) ' ', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMax();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair9 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
    }

    @Test
    public void test4938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4938");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1.0f, (double) 100);
        double double3 = brentOptimizer2.getMin();
        int int4 = brentOptimizer2.getMaxEvaluations();
        int int5 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer2.getGoalType();
        double double7 = brentOptimizer2.getMin();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4939");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((-1.0d), (double) 100, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4940");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        int int8 = brentOptimizer3.getEvaluations();
        int int9 = brentOptimizer3.getMaxEvaluations();
        double double10 = brentOptimizer3.getMax();
        double double11 = brentOptimizer3.getMax();
        double double12 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType13 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(goalType13);
    }

    @Test
    public void test4941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4941");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) '4', (double) (short) 1, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        int int5 = brentOptimizer3.getEvaluations();
        int int6 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4942");
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
        double double14 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction16 = null;
        org.apache.commons.math3.optimization.GoalType goalType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair20 = brentOptimizer3.optimize((int) '4', univariateFunction16, goalType17, (-1.0d), (double) (short) -1);
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test4943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4943");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        double double10 = brentOptimizer3.getMin();
        double double11 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test4944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4944");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 100, (double) 1.0f);
    }

    @Test
    public void test4945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4945");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        double double8 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math3.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer3.optimize(10, univariateFunction10, goalType11, (double) 0L, 1.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test4946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4946");
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
        double double12 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.GoalType goalType13 = brentOptimizer2.getGoalType();
        double double14 = brentOptimizer2.getMax();
        org.apache.commons.math3.optimization.GoalType goalType15 = brentOptimizer2.getGoalType();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(goalType13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(goalType15);
    }

    @Test
    public void test4947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4947");
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
        double double12 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker13 = brentOptimizer3.getConvergenceChecker();
        double double14 = brentOptimizer3.getMin();
        double double15 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test4948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4948");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(0.0d, (double) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4949");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 100, (double) 1L);
        double double3 = brentOptimizer2.getStartValue();
        int int4 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer2.getGoalType();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test4950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4950");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) ' ', 1.0d);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer2.getGoalType();
        double double6 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer2.getGoalType();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test4951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4951");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        int int9 = brentOptimizer3.getMaxEvaluations();
        double double10 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer3.optimize((int) (short) -1, univariateFunction12, goalType13, (double) 10, (double) '#', (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4952");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) (short) 1);
        double double3 = brentOptimizer2.getMin();
        double double4 = brentOptimizer2.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair10 = brentOptimizer2.optimize((int) '#', univariateFunction6, goalType7, (double) 0L, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test4953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4953");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) ' ', (double) 100.0f, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getEvaluations();
        int int6 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math3.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair12 = brentOptimizer3.optimize(0, univariateFunction8, goalType9, 0.0d, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4954");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 100, (double) 1L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getEvaluations();
        int int6 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4955");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100.0f, (double) 1);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        int int4 = brentOptimizer2.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4956");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) '4', (double) '#', univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getEvaluations();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getMax();
        int int10 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4957");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 10, (double) (byte) 100);
        double double3 = brentOptimizer2.getStartValue();
        double double4 = brentOptimizer2.getMax();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer2.getGoalType();
        double double6 = brentOptimizer2.getMax();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer2.getGoalType();
        double double8 = brentOptimizer2.getMin();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test4958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4958");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) '#', (double) (byte) 10, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math3.optimization.GoalType goalType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair9 = brentOptimizer3.optimize((int) (byte) 1, univariateFunction5, goalType6, (double) (-1L), (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4959");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10, (double) 10L);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getMax();
        int int6 = brentOptimizer2.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4960");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        int int5 = brentOptimizer3.getEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer3.optimize(10, univariateFunction9, goalType10, (double) 'a', (double) '#', (double) 0L);
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
    public void test4961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4961");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        int int8 = brentOptimizer3.getMaxEvaluations();
        double double9 = brentOptimizer3.getMin();
        double double10 = brentOptimizer3.getMax();
        int int11 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer3.getConvergenceChecker();
        int int13 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction15 = null;
        org.apache.commons.math3.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair20 = brentOptimizer3.optimize((int) 'a', univariateFunction15, goalType16, (double) (byte) 100, (double) (byte) 100, (double) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4962");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        int int5 = brentOptimizer3.getEvaluations();
        int int6 = brentOptimizer3.getMaxEvaluations();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math3.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair15 = brentOptimizer3.optimize((int) 'a', univariateFunction10, goalType11, (double) 100, (double) (byte) 100, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
    }

    @Test
    public void test4963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4963");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 1, (double) 1, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMax();
        java.lang.Class<?> wildcardClass6 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4964");
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
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair12 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
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
    public void test4965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4965");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1L, univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getEvaluations();
        int int5 = brentOptimizer3.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair6 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4966");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        int int9 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        double double11 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair18 = brentOptimizer3.optimize(10, univariateFunction13, goalType14, 0.0d, 100.0d, 100.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test4967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4967");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 10.0f);
        double double3 = brentOptimizer2.getMin();
        double double4 = brentOptimizer2.getMax();
        int int5 = brentOptimizer2.getEvaluations();
        double double6 = brentOptimizer2.getMin();
        double double7 = brentOptimizer2.getMin();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4968");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        int int5 = brentOptimizer3.getEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math3.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer3.optimize((int) 'a', univariateFunction10, goalType11, 0.0d, (double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test4969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4969");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) ' ', (double) 100.0f, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer3.getConvergenceChecker();
        int int6 = brentOptimizer3.getEvaluations();
        double double7 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair13 = brentOptimizer3.optimize((int) (short) -1, univariateFunction9, goalType10, (double) 100L, 10.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4970");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) '#', (double) (short) 100);
        double double3 = brentOptimizer2.getStartValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4971");
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
        double double13 = brentOptimizer3.getMin();
        double double14 = brentOptimizer3.getMax();
        double double15 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test4972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4972");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        int int6 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        int int8 = brentOptimizer3.getMaxEvaluations();
        int int9 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize(10, univariateFunction11, goalType12, (double) (byte) -1, 1.0d, 1.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4973");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        int int8 = brentOptimizer3.getMaxEvaluations();
        double double9 = brentOptimizer3.getMin();
        int int10 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer3.getConvergenceChecker();
        int int13 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4974");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getMax();
        int int6 = brentOptimizer2.getMaxEvaluations();
        int int7 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer2.getGoalType();
        int int10 = brentOptimizer2.getEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4975");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 1L);
        int int3 = brentOptimizer2.getMaxEvaluations();
        double double4 = brentOptimizer2.getMin();
        int int5 = brentOptimizer2.getMaxEvaluations();
        double double6 = brentOptimizer2.getMax();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test4976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4976");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) '#', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getMaxEvaluations();
        int int8 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
    }

    @Test
    public void test4977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4977");
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
        double double13 = brentOptimizer3.getStartValue();
        double double14 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test4978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4978");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) '4');
        double double3 = brentOptimizer2.getMax();
        int int4 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
    }

    @Test
    public void test4979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4979");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        double double8 = brentOptimizer3.getMax();
        int int9 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
        double double12 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4980");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getStartValue();
        double double10 = brentOptimizer3.getStartValue();
        int int11 = brentOptimizer3.getEvaluations();
        double double12 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4981");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) '#', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer3.getConvergenceChecker();
        double double6 = brentOptimizer3.getStartValue();
        double double7 = brentOptimizer3.getStartValue();
        int int8 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4982");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getStartValue();
        int int10 = brentOptimizer3.getMaxEvaluations();
        int int11 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType12 = brentOptimizer3.getGoalType();
        double double13 = brentOptimizer3.getMin();
        double double14 = brentOptimizer3.getMin();
        int int15 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker16 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker16);
    }

    @Test
    public void test4983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4983");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) -1, (double) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4984");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        double double11 = brentOptimizer3.getMin();
        int int12 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4985");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker13 = brentOptimizer3.getConvergenceChecker();
        int int14 = brentOptimizer3.getMaxEvaluations();
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4986");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(1.0d, 10.0d);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        int int4 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer2.getGoalType();
        double double8 = brentOptimizer2.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test4987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4987");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        double double5 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer2.getConvergenceChecker();
        double double8 = brentOptimizer2.getMin();
        double double9 = brentOptimizer2.getMax();
        int int10 = brentOptimizer2.getEvaluations();
        int int11 = brentOptimizer2.getEvaluations();
        double double12 = brentOptimizer2.getMax();
        double double13 = brentOptimizer2.getMin();
        double double14 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.GoalType goalType15 = brentOptimizer2.getGoalType();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(goalType15);
    }

    @Test
    public void test4988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4988");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getMaxEvaluations();
        int int8 = brentOptimizer3.getEvaluations();
        double double9 = brentOptimizer3.getStartValue();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4989");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) '#');
        double double3 = brentOptimizer2.getMax();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4990");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getMin();
        double double10 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize((int) '#', univariateFunction12, goalType13, (double) 0, 100.0d);
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
    }

    @Test
    public void test4991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4991");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        int int8 = brentOptimizer3.getEvaluations();
        double double9 = brentOptimizer3.getMin();
        int int10 = brentOptimizer3.getEvaluations();
        int int11 = brentOptimizer3.getMaxEvaluations();
        int int12 = brentOptimizer3.getEvaluations();
        int int13 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4992");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMax();
        int int8 = brentOptimizer3.getMaxEvaluations();
        int int9 = brentOptimizer3.getEvaluations();
        double double10 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer3.optimize((int) '#', univariateFunction12, goalType13, (double) (byte) -1, (double) 1L, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
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
    public void test4993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4993");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) '4', (double) '#', univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getEvaluations();
        int int5 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
    }

    @Test
    public void test4994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4994");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        int int9 = brentOptimizer3.getEvaluations();
        double double10 = brentOptimizer3.getStartValue();
        double double11 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType12 = brentOptimizer3.getGoalType();
        double double13 = brentOptimizer3.getStartValue();
        int int14 = brentOptimizer3.getEvaluations();
        int int15 = brentOptimizer3.getEvaluations();
        double double16 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction18 = null;
        org.apache.commons.math3.optimization.GoalType goalType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair22 = brentOptimizer3.optimize(1, univariateFunction18, goalType19, (double) '#', (double) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test4995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4995");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) -1, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4996");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(1.0d, 10.0d);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        double double4 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        int int6 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer2.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair8 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test4997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4997");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10L, 1.0d, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMax();
        int int8 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4998");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMin();
        int int8 = brentOptimizer3.getMaxEvaluations();
        double double9 = brentOptimizer3.getMax();
        int int10 = brentOptimizer3.getMaxEvaluations();
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
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
    }

    @Test
    public void test4999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4999");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10, (double) 10L);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        int int5 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer2.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair7 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test5000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test5000");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer3.getConvergenceChecker();
        int int6 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }
}

