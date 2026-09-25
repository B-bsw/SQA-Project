package org.apache.commons.math3.optimization.univariate;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

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
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5501");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair3 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
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
        double double12 = brentOptimizer3.getStartValue();
        int int13 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker14 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker14);
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
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
        int int13 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker14 = brentOptimizer3.getConvergenceChecker();
        double double15 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 0, (double) 10L, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        double double5 = brentOptimizer2.getMax();
        double double6 = brentOptimizer2.getMin();
        double double7 = brentOptimizer2.getMax();
        double double8 = brentOptimizer2.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math3.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair15 = brentOptimizer2.optimize((int) (byte) 100, univariateFunction10, goalType11, (-1.0d), (-1.0d), (double) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        int int9 = brentOptimizer3.getMaxEvaluations();
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        int int8 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer3.optimize((int) (byte) 10, univariateFunction12, goalType13, (double) (short) 100, (double) 'a', (double) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertNull(goalType10);
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        int int5 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMin();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
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
        int int15 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker16 = brentOptimizer3.getConvergenceChecker();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker16);
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
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
        org.apache.commons.math3.optimization.GoalType goalType12 = brentOptimizer3.getGoalType();
        int int13 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType14 = brentOptimizer3.getGoalType();
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
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(goalType14);
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        double double6 = brentOptimizer3.getMin();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(1.0d, 10.0d);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        int int4 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer2.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = univariatePointValuePairConvergenceChecker7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
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
        int int12 = brentOptimizer3.getMaxEvaluations();
        double double13 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getMax();
        int int9 = brentOptimizer3.getEvaluations();
        int int10 = brentOptimizer3.getMaxEvaluations();
        double double11 = brentOptimizer3.getMin();
        double double12 = brentOptimizer3.getMax();
        int int13 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
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
        int int12 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction14 = null;
        org.apache.commons.math3.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair19 = brentOptimizer3.optimize((int) '#', univariateFunction14, goalType15, (double) 0L, 100.0d, (double) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(1.0d, (double) ' ');
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) '#', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getMaxEvaluations();
        int int8 = brentOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass9 = brentOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
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
        double double12 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getMax();
        int int6 = brentOptimizer2.getMaxEvaluations();
        int int7 = brentOptimizer2.getEvaluations();
        double double8 = brentOptimizer2.getMax();
        int int9 = brentOptimizer2.getEvaluations();
        int int10 = brentOptimizer2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(1.0d, (double) 100L, univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getEvaluations();
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
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        int int8 = brentOptimizer3.getMaxEvaluations();
        double double9 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize((-1), univariateFunction11, goalType12, (double) 100.0f, (double) (short) 1, (double) 1.0f);
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
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 1, (double) 10, univariatePointValuePairConvergenceChecker2);
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize(0, univariateFunction12, goalType13, (double) 'a', 0.0d);
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
        org.junit.Assert.assertNull(goalType10);
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        double double6 = brentOptimizer3.getMin();
        int int7 = brentOptimizer3.getEvaluations();
        double double8 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMin();
        double double10 = brentOptimizer3.getStartValue();
        double double11 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer3.optimize((int) '4', univariateFunction13, goalType14, (double) 1.0f, (double) (byte) -1);
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
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) '4', (double) 0.0f, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        int int4 = brentOptimizer2.getEvaluations();
        double double5 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer2.getConvergenceChecker();
        double double7 = brentOptimizer2.getStartValue();
        java.lang.Class<?> wildcardClass8 = brentOptimizer2.getClass();
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) (short) 100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        int int4 = brentOptimizer2.getMaxEvaluations();
        int int5 = brentOptimizer2.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
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
        org.apache.commons.math3.optimization.GoalType goalType13 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction15 = null;
        org.apache.commons.math3.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair20 = brentOptimizer3.optimize((int) (short) 10, univariateFunction15, goalType16, (-1.0d), (double) 100.0f, (double) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(goalType13);
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) ' ', (double) 100.0f, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer3.getConvergenceChecker();
        double double6 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math3.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair12 = brentOptimizer3.optimize((int) '#', univariateFunction8, goalType9, (double) (-1L), (double) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 10, (double) ' ');
        double double3 = brentOptimizer2.getMax();
        int int4 = brentOptimizer2.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair5 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        double double8 = brentOptimizer3.getMax();
        int int9 = brentOptimizer3.getEvaluations();
        double double10 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
        int int12 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
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
        double double13 = brentOptimizer3.getMax();
        int int14 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (-1), 100.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        int int5 = brentOptimizer3.getEvaluations();
        int int6 = brentOptimizer3.getMaxEvaluations();
        double double7 = brentOptimizer3.getMin();
        double double8 = brentOptimizer3.getStartValue();
        double double9 = brentOptimizer3.getMin();
        double double10 = brentOptimizer3.getMax();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10, (double) 1L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        double double5 = brentOptimizer3.getMax();
        int int6 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math3.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair12 = brentOptimizer3.optimize(1, univariateFunction8, goalType9, (double) (-1), (double) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 100L, univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getEvaluations();
        double double5 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair13 = brentOptimizer3.optimize(0, univariateFunction9, goalType10, (double) (-1.0f), (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
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
        double double13 = brentOptimizer3.getMin();
        double double14 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
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
        int int12 = brentOptimizer3.getEvaluations();
        double double13 = brentOptimizer3.getMin();
        int int14 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction16 = null;
        org.apache.commons.math3.optimization.GoalType goalType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair20 = brentOptimizer3.optimize((int) (byte) 1, univariateFunction16, goalType17, 0.0d, (double) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100, (double) (short) 1);
        double double3 = brentOptimizer2.getMin();
        int int4 = brentOptimizer2.getEvaluations();
        int int5 = brentOptimizer2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) '4', (double) '#', univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        double double6 = brentOptimizer3.getMax();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
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
        int int12 = brentOptimizer3.getMaxEvaluations();
        int int13 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType14 = brentOptimizer3.getGoalType();
        double double15 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType16 = brentOptimizer3.getGoalType();
        java.lang.Class<?> wildcardClass17 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(goalType14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(goalType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker15 = brentOptimizer3.getConvergenceChecker();
        double double16 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction18 = null;
        org.apache.commons.math3.optimization.GoalType goalType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair22 = brentOptimizer3.optimize((int) (short) 10, univariateFunction18, goalType19, (double) (short) 100, (double) (byte) 0);
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
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker14);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10.0f, (double) (short) 1);
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction4 = null;
        org.apache.commons.math3.optimization.GoalType goalType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair8 = brentOptimizer2.optimize((int) (short) 10, univariateFunction4, goalType5, 0.0d, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) ' ', (double) 100.0f, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getStartValue();
        double double8 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) '4', (double) 10.0f);
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        int int8 = brentOptimizer3.getEvaluations();
        int int9 = brentOptimizer3.getMaxEvaluations();
        double double10 = brentOptimizer3.getMin();
        double double11 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, (double) 100);
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
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) (byte) 10);
        int int3 = brentOptimizer2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 0, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
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
        double double14 = brentOptimizer3.getStartValue();
        double double15 = brentOptimizer3.getMax();
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) ' ', (double) (byte) 10);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        int int5 = brentOptimizer2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMin();
        double double8 = brentOptimizer3.getMax();
        double double9 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize((int) (short) 10, univariateFunction11, goalType12, 10.0d, (double) (short) -1, (double) (short) 1);
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
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair13 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        int int9 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        double double11 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
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
            java.lang.Class<?> wildcardClass12 = univariatePointValuePairConvergenceChecker11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
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
        double double12 = brentOptimizer2.getStartValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair13 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer3.optimize(0, univariateFunction7, goalType8, (double) 100L, (double) 1L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        double double6 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        int int5 = brentOptimizer3.getEvaluations();
        int int6 = brentOptimizer3.getMaxEvaluations();
        double double7 = brentOptimizer3.getStartValue();
        int int8 = brentOptimizer3.getMaxEvaluations();
        double double9 = brentOptimizer3.getStartValue();
        double double10 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        int int6 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        double double11 = brentOptimizer3.getMin();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        int int5 = brentOptimizer3.getEvaluations();
        int int6 = brentOptimizer3.getMaxEvaluations();
        double double7 = brentOptimizer3.getMin();
        double double8 = brentOptimizer3.getStartValue();
        int int9 = brentOptimizer3.getMaxEvaluations();
        double double10 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer3.optimize((int) (byte) 100, univariateFunction12, goalType13, (double) (-1L), (double) (byte) 0, (double) 1L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        int int5 = brentOptimizer3.getEvaluations();
        int int6 = brentOptimizer3.getMaxEvaluations();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        int int10 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize((int) '#', univariateFunction12, goalType13, (double) 1L, 10.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        int int6 = brentOptimizer3.getEvaluations();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        int int10 = brentOptimizer3.getEvaluations();
        double double11 = brentOptimizer3.getStartValue();
        double double12 = brentOptimizer3.getStartValue();
        java.lang.Class<?> wildcardClass13 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) ' ', (double) '#', univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) ' ', (double) 100.0f, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math3.optimization.GoalType goalType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair10 = brentOptimizer3.optimize((int) (byte) 0, univariateFunction5, goalType6, (double) (-1.0f), (double) (byte) 1, (double) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
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
        double double13 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType14 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(goalType14);
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) '4', 100.0d);
        double double3 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        int int5 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer2.optimize(100, univariateFunction7, goalType8, (double) (-1.0f), (double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getMaxEvaluations();
        int int8 = brentOptimizer3.getMaxEvaluations();
        double double9 = brentOptimizer3.getStartValue();
        double double10 = brentOptimizer3.getMax();
        double double11 = brentOptimizer3.getMax();
        double double12 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        double double5 = brentOptimizer2.getMin();
        double double6 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer2.getGoalType();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        int int5 = brentOptimizer3.getEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
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
        double double13 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType14 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction16 = null;
        org.apache.commons.math3.optimization.GoalType goalType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair21 = brentOptimizer3.optimize((int) (byte) 1, univariateFunction16, goalType17, (double) 100, 0.0d, (double) 1L);
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
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        int int8 = brentOptimizer3.getMaxEvaluations();
        int int9 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize(100, univariateFunction11, goalType12, (double) '4', 0.0d, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
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
        org.apache.commons.math3.optimization.GoalType goalType13 = brentOptimizer3.getGoalType();
        double double14 = brentOptimizer3.getMin();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(goalType13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10, (double) 10L);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        double double4 = brentOptimizer2.getStartValue();
        double double5 = brentOptimizer2.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer2.getConvergenceChecker();
        double double7 = brentOptimizer2.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer2.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair9 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) 1L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        double double5 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer3.optimize((int) (byte) 100, univariateFunction7, goalType8, (double) 1L, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, (double) ' ', univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer3.optimize(10, univariateFunction7, goalType8, (double) (byte) -1, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        double double5 = brentOptimizer3.getMin();
        double double6 = brentOptimizer3.getStartValue();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getMin();
        int int9 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize((int) (byte) -1, univariateFunction11, goalType12, (-1.0d), (double) 100, (double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10.0f, (double) (short) 100);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair5 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
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
        double double16 = brentOptimizer3.getMax();
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        double double5 = brentOptimizer3.getMax();
        double double6 = brentOptimizer3.getMin();
        double double7 = brentOptimizer3.getMax();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getMax();
        int int6 = brentOptimizer2.getMaxEvaluations();
        int int7 = brentOptimizer2.getMaxEvaluations();
        double double8 = brentOptimizer2.getMax();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer2.optimize((int) (short) 1, univariateFunction11, goalType12, (double) (short) 100, (double) 100.0f, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
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
        double double16 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType17 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType18 = brentOptimizer3.getGoalType();
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(goalType17);
        org.junit.Assert.assertNull(goalType18);
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
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
        org.apache.commons.math3.optimization.GoalType goalType15 = brentOptimizer3.getGoalType();
        double double16 = brentOptimizer3.getMin();
        int int17 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction19 = null;
        org.apache.commons.math3.optimization.GoalType goalType20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair24 = brentOptimizer3.optimize((int) '4', univariateFunction19, goalType20, (double) (short) 100, (double) 10, (double) (byte) 10);
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
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(goalType15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) (byte) 10, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math3.optimization.GoalType goalType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair9 = brentOptimizer3.optimize((int) (short) -1, univariateFunction5, goalType6, 100.0d, (double) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
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
        double double13 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType14 = brentOptimizer3.getGoalType();
        double double15 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(goalType14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10, (double) 100.0f);
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction4 = null;
        org.apache.commons.math3.optimization.GoalType goalType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair9 = brentOptimizer2.optimize(0, univariateFunction4, goalType5, (double) (-1), (double) 'a', (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 100.0f);
        java.lang.Class<?> wildcardClass3 = brentOptimizer2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, (double) (byte) 10, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        int int5 = brentOptimizer3.getEvaluations();
        double double6 = brentOptimizer3.getMax();
        int int7 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
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
        double double15 = brentOptimizer3.getMin();
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) ' ', (double) '4', univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) '4', (double) 100.0f);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        java.lang.Class<?> wildcardClass4 = brentOptimizer2.getClass();
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        double double5 = brentOptimizer3.getMin();
        int int6 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        int int8 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 1, (double) 'a');
        int int3 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math3.optimization.GoalType goalType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair10 = brentOptimizer2.optimize((-1), univariateFunction5, goalType6, (double) (-1L), (double) 1.0f, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
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
        java.lang.Class<?> wildcardClass15 = brentOptimizer3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
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
        int int12 = brentOptimizer3.getMaxEvaluations();
        int int13 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType14 = brentOptimizer3.getGoalType();
        double double15 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction17 = null;
        org.apache.commons.math3.optimization.GoalType goalType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair22 = brentOptimizer3.optimize((int) '#', univariateFunction17, goalType18, (double) (-1.0f), (double) (-1), (double) 1L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(goalType14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 10, (double) (short) 100, univariatePointValuePairConvergenceChecker2);
        java.lang.Class<?> wildcardClass4 = brentOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        int int6 = brentOptimizer3.getEvaluations();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair9 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) '#', (double) 10.0f, univariatePointValuePairConvergenceChecker2);
        java.lang.Class<?> wildcardClass4 = brentOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 1, (double) 1, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMax();
        int int6 = brentOptimizer3.getEvaluations();
        double double7 = brentOptimizer3.getStartValue();
        int int8 = brentOptimizer3.getEvaluations();
        int int9 = brentOptimizer3.getEvaluations();
        double double10 = brentOptimizer3.getMin();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
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
        double double13 = brentOptimizer3.getMin();
        double double14 = brentOptimizer3.getMin();
        int int15 = brentOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass16 = brentOptimizer3.getClass();
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 0L, 10.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 100L, univariatePointValuePairConvergenceChecker2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair4 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 100, (double) 100.0f);
        double double3 = brentOptimizer2.getMin();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10, (double) 1L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        double double5 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair12 = brentOptimizer3.optimize((int) (byte) 1, univariateFunction7, goalType8, (double) 10.0f, (double) (short) -1, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        int int6 = brentOptimizer3.getEvaluations();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getMin();
        int int10 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
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
        double double12 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction14 = null;
        org.apache.commons.math3.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair18 = brentOptimizer3.optimize((int) 'a', univariateFunction14, goalType15, (double) 1, 0.0d);
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
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
        double double14 = brentOptimizer3.getStartValue();
        double double15 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker16 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction18 = null;
        org.apache.commons.math3.optimization.GoalType goalType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair23 = brentOptimizer3.optimize((int) 'a', univariateFunction18, goalType19, (double) '#', (double) 0.0f, 100.0d);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker16);
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        int int8 = brentOptimizer3.getEvaluations();
        int int9 = brentOptimizer3.getEvaluations();
        int int10 = brentOptimizer3.getEvaluations();
        int int11 = brentOptimizer3.getMaxEvaluations();
        double double12 = brentOptimizer3.getMin();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        double double4 = brentOptimizer2.getStartValue();
        double double5 = brentOptimizer2.getMax();
        int int6 = brentOptimizer2.getMaxEvaluations();
        double double7 = brentOptimizer2.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math3.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair15 = brentOptimizer2.optimize(0, univariateFunction10, goalType11, (double) '#', (double) 0L, (double) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker13 = brentOptimizer3.getConvergenceChecker();
        int int14 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
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
        double double14 = brentOptimizer3.getMax();
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
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        double double5 = brentOptimizer3.getMin();
        int int6 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertNull(goalType8);
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10.0f, (double) 100.0f);
        double double3 = brentOptimizer2.getStartValue();
        java.lang.Class<?> wildcardClass4 = brentOptimizer2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1.0f, (double) 10L);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        double double5 = brentOptimizer2.getStartValue();
        double double6 = brentOptimizer2.getMin();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        double double5 = brentOptimizer3.getMin();
        int int6 = brentOptimizer3.getMaxEvaluations();
        double double7 = brentOptimizer3.getStartValue();
        double double8 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        int int9 = brentOptimizer3.getEvaluations();
        int int10 = brentOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass11 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        int int4 = brentOptimizer2.getEvaluations();
        int int5 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer2.getGoalType();
        int int7 = brentOptimizer2.getMaxEvaluations();
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 1);
        int int3 = brentOptimizer2.getMaxEvaluations();
        int int4 = brentOptimizer2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
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
        int int12 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction14 = null;
        org.apache.commons.math3.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair18 = brentOptimizer3.optimize((int) '4', univariateFunction14, goalType15, 1.0d, (double) 100.0f);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker13 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker13);
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
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
        int int12 = brentOptimizer3.getEvaluations();
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
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker15 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction17 = null;
        org.apache.commons.math3.optimization.GoalType goalType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair21 = brentOptimizer3.optimize(10, univariateFunction17, goalType18, 100.0d, (double) (-1));
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker15);
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        double double5 = brentOptimizer3.getMin();
        int int6 = brentOptimizer3.getMaxEvaluations();
        double double7 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer3.optimize((-1), univariateFunction9, goalType10, (double) (short) -1, (double) (-1L), (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        int int11 = brentOptimizer3.getEvaluations();
        double double12 = brentOptimizer3.getMax();
        double double13 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker14 = brentOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass15 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) ' ', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMax();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = goalType9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(goalType9);
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        double double6 = brentOptimizer3.getMax();
        double double7 = brentOptimizer3.getMin();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize((int) (short) 100, univariateFunction11, goalType12, (double) 0.0f, (double) 'a', 100.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        int int5 = brentOptimizer3.getEvaluations();
        int int6 = brentOptimizer3.getMaxEvaluations();
        int int7 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
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
        double double13 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 10);
        double double3 = brentOptimizer2.getMin();
        int int4 = brentOptimizer2.getMaxEvaluations();
        int int5 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math3.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair13 = brentOptimizer2.optimize(0, univariateFunction8, goalType9, (double) 0L, (double) (-1.0f), (double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100, (double) 100);
        int int3 = brentOptimizer2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (-1), (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
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
        org.apache.commons.math3.optimization.GoalType goalType14 = brentOptimizer3.getGoalType();
        double double15 = brentOptimizer3.getMax();
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
        org.junit.Assert.assertNull(goalType14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getMax();
        int int9 = brentOptimizer3.getEvaluations();
        int int10 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer3.getConvergenceChecker();
        int int13 = brentOptimizer3.getEvaluations();
        double double14 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction16 = null;
        org.apache.commons.math3.optimization.GoalType goalType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair20 = brentOptimizer3.optimize(0, univariateFunction16, goalType17, (double) (-1.0f), (double) ' ');
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
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        double double10 = brentOptimizer3.getStartValue();
        int int11 = brentOptimizer3.getMaxEvaluations();
        double double12 = brentOptimizer3.getMin();
        java.lang.Class<?> wildcardClass13 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, (double) (short) 10);
        int int3 = brentOptimizer2.getEvaluations();
        double double4 = brentOptimizer2.getMax();
        java.lang.Class<?> wildcardClass5 = brentOptimizer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 1L, univariatePointValuePairConvergenceChecker2);
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        int int8 = brentOptimizer3.getEvaluations();
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) ' ', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMax();
        double double5 = brentOptimizer3.getMax();
        double double6 = brentOptimizer3.getMin();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        int int6 = brentOptimizer3.getEvaluations();
        double double7 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        int int9 = brentOptimizer3.getMaxEvaluations();
        int int10 = brentOptimizer3.getEvaluations();
        int int11 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker13 = brentOptimizer3.getConvergenceChecker();
        double double14 = brentOptimizer3.getMin();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair15 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        int int5 = brentOptimizer3.getEvaluations();
        int int6 = brentOptimizer3.getMaxEvaluations();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getMax();
        double double9 = brentOptimizer3.getStartValue();
        int int10 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(goalType11);
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1.0f, (double) 100L);
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math3.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer3.optimize((int) ' ', univariateFunction10, goalType11, (double) (byte) 10, 10.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10.0f, (double) (short) 10, univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) ' ', (double) (byte) 100, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        java.lang.Class<?> wildcardClass6 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getMax();
        int int6 = brentOptimizer2.getMaxEvaluations();
        int int7 = brentOptimizer2.getMaxEvaluations();
        double double8 = brentOptimizer2.getMax();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer2.getGoalType();
        int int10 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer2.optimize((int) '#', univariateFunction12, goalType13, (double) 1L, (double) 1.0f, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100.0f, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100.0f, (double) (short) 1);
        double double3 = brentOptimizer2.getMax();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        int int6 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        int int10 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction14 = null;
        org.apache.commons.math3.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair18 = brentOptimizer3.optimize((int) (byte) 0, univariateFunction14, goalType15, (-1.0d), (double) 10);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
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
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction14 = null;
        org.apache.commons.math3.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair19 = brentOptimizer3.optimize((int) 'a', univariateFunction14, goalType15, (double) 1, (double) (byte) -1, 0.0d);
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
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10, (double) 10);
        java.lang.Class<?> wildcardClass3 = brentOptimizer2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1.0f, (double) (short) 10);
        int int3 = brentOptimizer2.getMaxEvaluations();
        int int4 = brentOptimizer2.getEvaluations();
        double double5 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer2.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
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
        org.apache.commons.math3.optimization.GoalType goalType15 = brentOptimizer3.getGoalType();
        int int16 = brentOptimizer3.getEvaluations();
        double double17 = brentOptimizer3.getMin();
        double double18 = brentOptimizer3.getMax();
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
        org.junit.Assert.assertNull(goalType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
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
        int int13 = brentOptimizer3.getMaxEvaluations();
        double double14 = brentOptimizer3.getStartValue();
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        int int11 = brentOptimizer3.getEvaluations();
        double double12 = brentOptimizer3.getMax();
        double double13 = brentOptimizer3.getMax();
        double double14 = brentOptimizer3.getMax();
        double double15 = brentOptimizer3.getMin();
        java.lang.Class<?> wildcardClass16 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getStartValue();
        int int10 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer3.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = univariatePointValuePairConvergenceChecker12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker16 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType17 = brentOptimizer3.getGoalType();
        double double18 = brentOptimizer3.getMin();
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
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker16);
        org.junit.Assert.assertNull(goalType17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getMaxEvaluations();
        int int8 = brentOptimizer3.getMaxEvaluations();
        double double9 = brentOptimizer3.getMin();
        double double10 = brentOptimizer3.getMin();
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
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 100);
        double double3 = brentOptimizer2.getStartValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = univariatePointValuePairConvergenceChecker15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100, (double) (short) 100);
        double double3 = brentOptimizer2.getStartValue();
        double double4 = brentOptimizer2.getMin();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, (double) 100);
        int int3 = brentOptimizer2.getMaxEvaluations();
        int int4 = brentOptimizer2.getEvaluations();
        double double5 = brentOptimizer2.getStartValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        int int9 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass11 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker13 = brentOptimizer3.getConvergenceChecker();
        double double14 = brentOptimizer3.getMax();
        double double15 = brentOptimizer3.getMin();
        int int16 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction18 = null;
        org.apache.commons.math3.optimization.GoalType goalType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair23 = brentOptimizer3.optimize((int) (byte) 100, univariateFunction18, goalType19, (double) 100, 100.0d, (double) (short) -1);
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
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        int int8 = brentOptimizer3.getMaxEvaluations();
        double double9 = brentOptimizer3.getStartValue();
        double double10 = brentOptimizer3.getStartValue();
        double double11 = brentOptimizer3.getMin();
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
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
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
        double double12 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker13 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker13);
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
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
        int int13 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) '#', (double) (byte) 0, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10.0f, (double) 10, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair10 = brentOptimizer3.optimize(0, univariateFunction6, goalType7, (double) (-1), (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        int int8 = brentOptimizer3.getMaxEvaluations();
        double double9 = brentOptimizer3.getStartValue();
        double double10 = brentOptimizer3.getMin();
        double double11 = brentOptimizer3.getStartValue();
        int int12 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMax();
        double double9 = brentOptimizer3.getMin();
        double double10 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, 100.0d);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
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
        double double12 = brentOptimizer3.getMax();
        double double13 = brentOptimizer3.getMin();
        int int14 = brentOptimizer3.getEvaluations();
        int int15 = brentOptimizer3.getEvaluations();
        double double16 = brentOptimizer3.getMin();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer3.doOptimize();
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10L, (double) ' ', univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        double double9 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        int int11 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(1.0d, 10.0d);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        int int4 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer2.getGoalType();
        double double7 = brentOptimizer2.getMin();
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
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 1, (double) '#');
        double double3 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        double double6 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer2.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        int int10 = brentOptimizer3.getEvaluations();
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
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 100, (double) '#');
        int int3 = brentOptimizer2.getEvaluations();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getStartValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 100, (double) 'a', univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        int int6 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        int int8 = brentOptimizer3.getMaxEvaluations();
        int int9 = brentOptimizer3.getEvaluations();
        double double10 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize((int) 'a', univariateFunction12, goalType13, (double) (-1L), (double) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
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
        java.lang.Class<?> wildcardClass12 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getMin();
        double double10 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize((int) (byte) 0, univariateFunction12, goalType13, (double) (byte) 1, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math3.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer3.optimize(10, univariateFunction10, goalType11, 10.0d, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(1.0d, 10.0d);
        int int3 = brentOptimizer2.getMaxEvaluations();
        double double4 = brentOptimizer2.getStartValue();
        double double5 = brentOptimizer2.getMin();
        double double6 = brentOptimizer2.getMax();
        double double7 = brentOptimizer2.getStartValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        int int8 = brentOptimizer3.getMaxEvaluations();
        double double9 = brentOptimizer3.getStartValue();
        double double10 = brentOptimizer3.getMin();
        double double11 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType12 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(goalType12);
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getEvaluations();
        double double8 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math3.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair15 = brentOptimizer3.optimize(1, univariateFunction10, goalType11, (double) 100, (double) 1, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 10.0f);
        double double3 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        int int6 = brentOptimizer2.getEvaluations();
        int int7 = brentOptimizer2.getEvaluations();
        double double8 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer2.getGoalType();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getMax();
        int int9 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        double double11 = brentOptimizer3.getMin();
        double double12 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType13 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(goalType13);
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        double double8 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        double double10 = brentOptimizer3.getStartValue();
        double double11 = brentOptimizer3.getMax();
        int int12 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType13 = brentOptimizer3.getGoalType();
        double double14 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction16 = null;
        org.apache.commons.math3.optimization.GoalType goalType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair20 = brentOptimizer3.optimize((int) (short) 10, univariateFunction16, goalType17, (double) '4', (double) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(goalType13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, 100.0d, univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 100, (double) '#');
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        int int5 = brentOptimizer2.getEvaluations();
        double double6 = brentOptimizer2.getMin();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker13 = brentOptimizer3.getConvergenceChecker();
        double double14 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        double double7 = brentOptimizer3.getMin();
        double double8 = brentOptimizer3.getMin();
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getStartValue();
        double double9 = brentOptimizer3.getStartValue();
        int int10 = brentOptimizer3.getEvaluations();
        double double11 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType12 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker13 = brentOptimizer3.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker13);
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, 1.0d);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        int int4 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        int int6 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math3.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair13 = brentOptimizer2.optimize(1, univariateFunction8, goalType9, (double) (byte) 0, (double) (byte) 1, (double) (short) 100);
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
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 100, (double) 10);
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 0.0f, (double) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
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
        double double14 = brentOptimizer3.getStartValue();
        int int15 = brentOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass16 = brentOptimizer3.getClass();
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(1.0d, (double) (short) 100, univariatePointValuePairConvergenceChecker2);
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMin();
        double double10 = brentOptimizer3.getMin();
        double double11 = brentOptimizer3.getMin();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        double double8 = brentOptimizer3.getMin();
        int int9 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        double double10 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
        int int12 = brentOptimizer3.getMaxEvaluations();
        int int13 = brentOptimizer3.getMaxEvaluations();
        int int14 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
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
        org.apache.commons.math3.optimization.GoalType goalType12 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(goalType12);
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        double double8 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        double double10 = brentOptimizer3.getStartValue();
        int int11 = brentOptimizer3.getEvaluations();
        double double12 = brentOptimizer3.getMin();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
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
        double double15 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction17 = null;
        org.apache.commons.math3.optimization.GoalType goalType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair21 = brentOptimizer3.optimize(100, univariateFunction17, goalType18, (double) 10L, (double) 0.0f);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
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
        int int14 = brentOptimizer3.getEvaluations();
        double double15 = brentOptimizer3.getMax();
        double double16 = brentOptimizer3.getStartValue();
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getEvaluations();
        double double5 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMax();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5713");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker14 = brentOptimizer3.getConvergenceChecker();
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
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker14);
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5715");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (-1L), (double) 0L, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5716");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 10.0f);
        double double3 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        double double6 = brentOptimizer2.getStartValue();
        double double7 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math3.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer2.optimize((int) (short) -1, univariateFunction10, goalType11, (double) (-1), (double) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        double double7 = brentOptimizer3.getMin();
        int int8 = brentOptimizer3.getEvaluations();
        double double9 = brentOptimizer3.getMin();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5718");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        double double8 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        double double10 = brentOptimizer3.getStartValue();
        double double11 = brentOptimizer3.getMax();
        double double12 = brentOptimizer3.getMin();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5719");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        double double5 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMin();
        int int8 = brentOptimizer3.getMaxEvaluations();
        int int9 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5720");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        int int8 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        double double10 = brentOptimizer3.getStartValue();
        int int11 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType13 = brentOptimizer3.getGoalType();
        double double14 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
        org.junit.Assert.assertNull(goalType13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5721");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, (double) (byte) 1);
        int int3 = brentOptimizer2.getEvaluations();
        double double4 = brentOptimizer2.getMax();
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
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5722");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) ' ', univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5723");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 10, (double) 'a');
        int int3 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        double double5 = brentOptimizer2.getStartValue();
        double double6 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math3.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair13 = brentOptimizer2.optimize((int) (short) 100, univariateFunction8, goalType9, (double) (short) -1, 0.0d, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5724");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10L, (double) 1.0f);
        double double3 = brentOptimizer2.getMin();
        java.lang.Class<?> wildcardClass4 = brentOptimizer2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5725");
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
        org.apache.commons.math3.optimization.GoalType goalType15 = brentOptimizer3.getGoalType();
        int int16 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker17 = brentOptimizer3.getConvergenceChecker();
        int int18 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker19 = brentOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass20 = brentOptimizer3.getClass();
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
        org.junit.Assert.assertNull(goalType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5726");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 100, (double) 'a', univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getEvaluations();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        int int8 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5727");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        double double10 = brentOptimizer3.getStartValue();
        double double11 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5728");
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
        double double12 = brentOptimizer3.getMax();
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
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5729");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getMax();
        int int6 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer2.getGoalType();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertNull(goalType9);
    }

    @Test
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5730");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10, (double) (short) 1, univariatePointValuePairConvergenceChecker2);
        java.lang.Class<?> wildcardClass4 = brentOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5731");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer3.getConvergenceChecker();
        double double13 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType14 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(goalType14);
    }

    @Test
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5732");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 10, (double) 1L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5733");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker16 = brentOptimizer3.getConvergenceChecker();
        double double17 = brentOptimizer3.getMin();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair18 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
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
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5734");
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
        org.apache.commons.math3.optimization.GoalType goalType12 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(goalType12);
    }

    @Test
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5735");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        double double6 = brentOptimizer3.getMax();
        int int7 = brentOptimizer3.getMaxEvaluations();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5736");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getEvaluations();
        int int8 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        double double11 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair18 = brentOptimizer3.optimize(10, univariateFunction13, goalType14, (double) (-1.0f), (-1.0d), (double) 10.0f);
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
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5737");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, (double) (byte) 1);
        java.lang.Class<?> wildcardClass3 = brentOptimizer2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5738");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100.0f, (double) 10.0f, univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5739");
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
        double double14 = brentOptimizer3.getStartValue();
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
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5740");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        int int5 = brentOptimizer3.getEvaluations();
        int int6 = brentOptimizer3.getMaxEvaluations();
        double double7 = brentOptimizer3.getMin();
        double double8 = brentOptimizer3.getStartValue();
        int int9 = brentOptimizer3.getMaxEvaluations();
        int int10 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5741");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        int int8 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        int int10 = brentOptimizer3.getMaxEvaluations();
        int int11 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer3.getConvergenceChecker();
        double double13 = brentOptimizer3.getMin();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5742");
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
        org.apache.commons.math3.optimization.GoalType goalType15 = brentOptimizer3.getGoalType();
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
        org.junit.Assert.assertNull(goalType15);
    }

    @Test
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5743");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMax();
        int int8 = brentOptimizer3.getMaxEvaluations();
        double double9 = brentOptimizer3.getMin();
        double double10 = brentOptimizer3.getMin();
        double double11 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5744");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 100, (double) 1, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5745");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
    }

    @Test
    public void test5746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5746");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getStartValue();
        int int10 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        double double12 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker13 = brentOptimizer3.getConvergenceChecker();
        double double14 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5747");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        int int9 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        double double11 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer3.getConvergenceChecker();
        double double13 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction15 = null;
        org.apache.commons.math3.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair19 = brentOptimizer3.optimize(0, univariateFunction15, goalType16, (double) 100, (double) (-1));
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5748");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) '#', univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getEvaluations();
        int int5 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5749");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        int int3 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair10 = brentOptimizer2.optimize(100, univariateFunction6, goalType7, (double) (short) -1, (double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5750");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100.0f, (double) 1);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        double double4 = brentOptimizer2.getMin();
        double double5 = brentOptimizer2.getStartValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair6 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5751");
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
        double double12 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType13 = brentOptimizer3.getGoalType();
        double double14 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(goalType13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5752");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        double double8 = brentOptimizer3.getMax();
        int int9 = brentOptimizer3.getMaxEvaluations();
        int int10 = brentOptimizer3.getEvaluations();
        double double11 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType12 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(goalType12);
    }

    @Test
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5753");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMin();
        int int10 = brentOptimizer3.getMaxEvaluations();
        int int11 = brentOptimizer3.getEvaluations();
        double double12 = brentOptimizer3.getMin();
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5754");
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
        org.apache.commons.math3.optimization.GoalType goalType14 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType15 = brentOptimizer3.getGoalType();
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
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(goalType14);
        org.junit.Assert.assertNull(goalType15);
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5755");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, 100.0d, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math3.optimization.GoalType goalType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair9 = brentOptimizer3.optimize((int) (short) 100, univariateFunction5, goalType6, (double) 100.0f, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5756");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, (double) 1.0f);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5757");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) ' ', (double) (byte) 100, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        double double6 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5758");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 10, (double) 10.0f);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        int int4 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
    }

    @Test
    public void test5759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5759");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        double double5 = brentOptimizer3.getMax();
        double double6 = brentOptimizer3.getMax();
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
    public void test5760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5760");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100, (double) 100);
        double double3 = brentOptimizer2.getStartValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5761");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1.0f, (double) 10L);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        double double4 = brentOptimizer2.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5762");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 1, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math3.optimization.GoalType goalType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair9 = brentOptimizer3.optimize(0, univariateFunction5, goalType6, (double) '#', (double) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5763");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getStartValue();
        double double10 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5764");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 0, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5765");
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
        int int12 = brentOptimizer3.getEvaluations();
        int int13 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5766");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 1, (double) 1, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        int int5 = brentOptimizer3.getEvaluations();
        int int6 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5767");
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
        double double12 = brentOptimizer3.getMax();
        double double13 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction15 = null;
        org.apache.commons.math3.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair19 = brentOptimizer3.optimize((int) '4', univariateFunction15, goalType16, (double) (byte) 100, (double) (byte) 0);
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
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5768");
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
        int int12 = brentOptimizer3.getMaxEvaluations();
        double double13 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5769");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
    }

    @Test
    public void test5770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5770");
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
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair19 = brentOptimizer3.optimize((int) (byte) 10, univariateFunction15, goalType16, (double) (byte) 10, 100.0d);
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
    public void test5771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5771");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1);
        double double3 = brentOptimizer2.getStartValue();
        double double4 = brentOptimizer2.getStartValue();
        double double5 = brentOptimizer2.getMax();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5772");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair13 = brentOptimizer3.optimize(0, univariateFunction9, goalType10, (double) (byte) 10, (double) 100.0f);
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
    public void test5773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5773");
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
        double double12 = brentOptimizer3.getMin();
        double double13 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5774");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        int int9 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        int int11 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5775");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getStartValue();
        int int10 = brentOptimizer3.getEvaluations();
        double double11 = brentOptimizer3.getMax();
        double double12 = brentOptimizer3.getMin();
        int int13 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5776");
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
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair18 = brentOptimizer3.optimize(0, univariateFunction13, goalType14, (double) ' ', (double) 1L, (double) (-1L));
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
    public void test5777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5777");
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
        double double15 = brentOptimizer3.getMax();
        double double16 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType17 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction19 = null;
        org.apache.commons.math3.optimization.GoalType goalType20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair23 = brentOptimizer3.optimize((int) (byte) 0, univariateFunction19, goalType20, (double) 0.0f, (double) ' ');
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(goalType17);
    }

    @Test
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5778");
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
        org.apache.commons.math3.optimization.GoalType goalType12 = brentOptimizer3.getGoalType();
        int int13 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5779");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        double double5 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer2.getConvergenceChecker();
        double double8 = brentOptimizer2.getMin();
        int int9 = brentOptimizer2.getEvaluations();
        double double10 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer2.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
    }

    @Test
    public void test5780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5780");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        double double5 = brentOptimizer2.getMin();
        int int6 = brentOptimizer2.getMaxEvaluations();
        int int7 = brentOptimizer2.getMaxEvaluations();
        int int8 = brentOptimizer2.getEvaluations();
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5781");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 10.0f);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getMin();
        int int6 = brentOptimizer2.getEvaluations();
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5782");
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
        double double12 = brentOptimizer3.getStartValue();
        double double13 = brentOptimizer3.getStartValue();
        double double14 = brentOptimizer3.getMax();
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
    }

    @Test
    public void test5783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5783");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 100, (double) 'a', univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getEvaluations();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair8 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5784");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) '#', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        double double6 = brentOptimizer3.getMin();
        int int7 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5785");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer3.getConvergenceChecker();
        int int13 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker14 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker15 = brentOptimizer3.getConvergenceChecker();
        double double16 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker14);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test5786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5786");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10, (double) 10.0f);
    }

    @Test
    public void test5787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5787");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, (double) (byte) 1, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
    }

    @Test
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5788");
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
        double double14 = brentOptimizer3.getMin();
        double double15 = brentOptimizer3.getMin();
        java.lang.Class<?> wildcardClass16 = brentOptimizer3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5789");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        int int6 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer2.getConvergenceChecker();
        double double8 = brentOptimizer2.getMax();
        int int9 = brentOptimizer2.getMaxEvaluations();
        int int10 = brentOptimizer2.getEvaluations();
        double double11 = brentOptimizer2.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer2.getConvergenceChecker();
        double double13 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker14 = brentOptimizer2.getConvergenceChecker();
        int int15 = brentOptimizer2.getEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5790");
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
        double double13 = brentOptimizer3.getStartValue();
        double double14 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5791");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, (double) (byte) 1, univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5792");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 1.0f);
    }

    @Test
    public void test5793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5793");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMax();
        double double10 = brentOptimizer3.getMin();
        double double11 = brentOptimizer3.getStartValue();
        double double12 = brentOptimizer3.getMin();
        double double13 = brentOptimizer3.getStartValue();
        double double14 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5794");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) '#');
        double double3 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        double double5 = brentOptimizer2.getMin();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5795");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker15 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker16 = brentOptimizer3.getConvergenceChecker();
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
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker15);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker16);
    }

    @Test
    public void test5796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5796");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        int int4 = brentOptimizer2.getEvaluations();
        int int5 = brentOptimizer2.getEvaluations();
        java.lang.Class<?> wildcardClass6 = brentOptimizer2.getClass();
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5797");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 100, (double) 100.0f);
        double double3 = brentOptimizer2.getMin();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test5798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5798");
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
        double double12 = brentOptimizer3.getMax();
        double double13 = brentOptimizer3.getMin();
        int int14 = brentOptimizer3.getEvaluations();
        int int15 = brentOptimizer3.getEvaluations();
        double double16 = brentOptimizer3.getMin();
        int int17 = brentOptimizer3.getMaxEvaluations();
        int int18 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test5799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5799");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math3.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair15 = brentOptimizer3.optimize((int) '4', univariateFunction10, goalType11, (double) 100.0f, (double) 1.0f, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
    }

    @Test
    public void test5800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5800");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) 100.0f, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        double double5 = brentOptimizer3.getStartValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair6 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5801");
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
        double double12 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker13 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker13);
    }

    @Test
    public void test5802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5802");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        double double4 = brentOptimizer2.getMax();
        int int5 = brentOptimizer2.getMaxEvaluations();
        double double6 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer2.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
    }

    @Test
    public void test5803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5803");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        int int8 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math3.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair15 = brentOptimizer3.optimize((int) '#', univariateFunction10, goalType11, 0.0d, (double) (short) 0, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5804");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        int int9 = brentOptimizer3.getMaxEvaluations();
        double double10 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType12 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertNull(goalType12);
    }

    @Test
    public void test5805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5805");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) (byte) 100);
        double double3 = brentOptimizer2.getMin();
        double double4 = brentOptimizer2.getStartValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5806");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) '4', (double) 10);
    }

    @Test
    public void test5807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5807");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test5808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5808");
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
        double double13 = brentOptimizer3.getMin();
        java.lang.Class<?> wildcardClass14 = brentOptimizer3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5809");
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
        double double15 = brentOptimizer3.getMax();
        int int16 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker17 = brentOptimizer3.getConvergenceChecker();
        int int18 = brentOptimizer3.getMaxEvaluations();
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test5810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5810");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMin();
        int int8 = brentOptimizer3.getEvaluations();
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5811");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        int int8 = brentOptimizer3.getEvaluations();
        int int9 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        double double11 = brentOptimizer3.getMin();
        double double12 = brentOptimizer3.getMax();
        int int13 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5812");
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
        double double13 = brentOptimizer3.getMin();
        int int14 = brentOptimizer3.getMaxEvaluations();
        double double15 = brentOptimizer3.getStartValue();
        double double16 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test5813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5813");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        int int8 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        int int10 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5814");
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
        org.junit.Assert.assertNull(goalType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test5815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5815");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        int int8 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertNull(goalType10);
    }

    @Test
    public void test5816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5816");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        double double6 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math3.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair12 = brentOptimizer3.optimize((int) (byte) 1, univariateFunction8, goalType9, (double) 1L, (double) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5817");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) 100.0f, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        double double5 = brentOptimizer3.getStartValue();
        int int6 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math3.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair13 = brentOptimizer3.optimize(0, univariateFunction8, goalType9, (double) ' ', 0.0d, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5818");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10L, (double) (byte) 100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math3.optimization.GoalType goalType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair9 = brentOptimizer2.optimize((int) 'a', univariateFunction5, goalType6, 1.0d, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
    }

    @Test
    public void test5819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5819");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getMaxEvaluations();
        int int8 = brentOptimizer3.getMaxEvaluations();
        double double9 = brentOptimizer3.getMin();
        int int10 = brentOptimizer3.getMaxEvaluations();
        double double11 = brentOptimizer3.getMin();
        int int12 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5820");
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
        org.apache.commons.math3.optimization.GoalType goalType14 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker15 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker16 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction18 = null;
        org.apache.commons.math3.optimization.GoalType goalType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair22 = brentOptimizer3.optimize((int) (short) 100, univariateFunction18, goalType19, (double) 10, (double) 10);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(goalType14);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker15);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker16);
    }

    @Test
    public void test5821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5821");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getMax();
        double double9 = brentOptimizer3.getStartValue();
        double double10 = brentOptimizer3.getMin();
        double double11 = brentOptimizer3.getMax();
        int int12 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5822");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getMaxEvaluations();
        int int8 = brentOptimizer3.getMaxEvaluations();
        double double9 = brentOptimizer3.getMax();
        double double10 = brentOptimizer3.getStartValue();
        double double11 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5823");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) (byte) 100, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair10 = brentOptimizer3.optimize((int) (byte) 1, univariateFunction6, goalType7, 10.0d, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5824");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        double double10 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
        double double12 = brentOptimizer3.getMin();
        double double13 = brentOptimizer3.getMin();
        java.lang.Class<?> wildcardClass14 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5825");
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
        int int13 = brentOptimizer3.getEvaluations();
        double double14 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType15 = brentOptimizer3.getGoalType();
        double double16 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType17 = brentOptimizer3.getGoalType();
        double double18 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker19 = brentOptimizer3.getConvergenceChecker();
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
        org.junit.Assert.assertNull(goalType15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(goalType17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker19);
    }

    @Test
    public void test5826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5826");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
    }

    @Test
    public void test5827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5827");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType12 = brentOptimizer3.getGoalType();
        double double13 = brentOptimizer3.getMin();
        double double14 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5828");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer2.getGoalType();
        double double7 = brentOptimizer2.getMax();
        double double8 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer2.getConvergenceChecker();
        int int10 = brentOptimizer2.getMaxEvaluations();
        double double11 = brentOptimizer2.getMin();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5829");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        int int6 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        double double9 = brentOptimizer3.getStartValue();
        double double10 = brentOptimizer3.getMax();
        double double11 = brentOptimizer3.getMax();
        double double12 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker13 = brentOptimizer3.getConvergenceChecker();
        int int14 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5830");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 10, (double) '4');
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction4 = null;
        org.apache.commons.math3.optimization.GoalType goalType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair8 = brentOptimizer2.optimize(100, univariateFunction4, goalType5, (double) 1L, (double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5831");
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
        org.apache.commons.math3.optimization.GoalType goalType13 = brentOptimizer3.getGoalType();
        double double14 = brentOptimizer3.getMax();
        int int15 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction17 = null;
        org.apache.commons.math3.optimization.GoalType goalType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair22 = brentOptimizer3.optimize(100, univariateFunction17, goalType18, (double) 10, (double) (short) 100, (double) 10.0f);
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
        org.junit.Assert.assertNull(goalType13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5832");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getMax();
        int int6 = brentOptimizer2.getMaxEvaluations();
        int int7 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer2.optimize((int) (byte) 100, univariateFunction9, goalType10, (double) ' ', (double) 10.0f, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5833");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, (double) (byte) 1);
        int int3 = brentOptimizer2.getEvaluations();
        int int4 = brentOptimizer2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5834");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) '#', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        int int6 = brentOptimizer3.getEvaluations();
        int int7 = brentOptimizer3.getEvaluations();
        int int8 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair10 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
    }

    @Test
    public void test5835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5835");
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
        double double12 = brentOptimizer3.getMin();
        double double13 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5836");
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
        double double13 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType14 = brentOptimizer3.getGoalType();
        double double15 = brentOptimizer3.getStartValue();
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
        org.junit.Assert.assertNull(goalType14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5837");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker13 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType14 = brentOptimizer3.getGoalType();
        double double15 = brentOptimizer3.getMin();
        int int16 = brentOptimizer3.getMaxEvaluations();
        double double17 = brentOptimizer3.getMin();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker13);
        org.junit.Assert.assertNull(goalType14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test5838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5838");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        double double4 = brentOptimizer2.getStartValue();
        double double5 = brentOptimizer2.getMax();
        int int6 = brentOptimizer2.getMaxEvaluations();
        double double7 = brentOptimizer2.getMax();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer2.getGoalType();
        double double9 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair18 = brentOptimizer2.optimize((int) (short) 10, univariateFunction13, goalType14, (double) (byte) 100, (double) (short) 10, (double) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
    }

    @Test
    public void test5839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5839");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getStartValue();
        int int10 = brentOptimizer3.getMaxEvaluations();
        double double11 = brentOptimizer3.getMin();
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
    public void test5840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5840");
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
        int int12 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5841");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 100, (double) '4');
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math3.optimization.GoalType goalType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair10 = brentOptimizer2.optimize((int) (byte) 0, univariateFunction5, goalType6, (double) (byte) 0, (double) (short) 10, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test5842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5842");
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
        double double14 = brentOptimizer3.getMax();
        int int15 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker16 = brentOptimizer3.getConvergenceChecker();
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker16);
    }

    @Test
    public void test5843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5843");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10.0f, (double) '#');
        double double3 = brentOptimizer2.getMin();
        int int4 = brentOptimizer2.getEvaluations();
        double double5 = brentOptimizer2.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer2.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
    }

    @Test
    public void test5844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5844");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10.0f, (double) 10);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        int int5 = brentOptimizer2.getEvaluations();
        int int6 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math3.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair12 = brentOptimizer2.optimize((int) (short) 0, univariateFunction8, goalType9, (double) (-1), (double) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5845");
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
        int int15 = brentOptimizer3.getEvaluations();
        int int16 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction18 = null;
        org.apache.commons.math3.optimization.GoalType goalType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair22 = brentOptimizer3.optimize((int) (byte) 1, univariateFunction18, goalType19, 0.0d, (double) (short) 100);
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5846");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 10, (double) 10.0f);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getStartValue();
        int int6 = brentOptimizer2.getEvaluations();
        double double7 = brentOptimizer2.getMin();
        double double8 = brentOptimizer2.getStartValue();
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5847");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        double double5 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        int int8 = brentOptimizer3.getEvaluations();
        double double9 = brentOptimizer3.getMax();
        double double10 = brentOptimizer3.getMax();
        double double11 = brentOptimizer3.getMax();
        java.lang.Class<?> wildcardClass12 = brentOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5848");
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
        int int13 = brentOptimizer3.getMaxEvaluations();
        double double14 = brentOptimizer3.getMax();
        int int15 = brentOptimizer3.getMaxEvaluations();
        double double16 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test5849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5849");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        int int9 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
        double double12 = brentOptimizer3.getMin();
        int int13 = brentOptimizer3.getMaxEvaluations();
        int int14 = brentOptimizer3.getEvaluations();
        double double15 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5850");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100.0f, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5851");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getMax();
        int int9 = brentOptimizer3.getEvaluations();
        int int10 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
        int int12 = brentOptimizer3.getMaxEvaluations();
        int int13 = brentOptimizer3.getEvaluations();
        double double14 = brentOptimizer3.getStartValue();
        double double15 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType16 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(goalType16);
    }

    @Test
    public void test5852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5852");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker14 = brentOptimizer3.getConvergenceChecker();
        int int15 = brentOptimizer3.getEvaluations();
        double double16 = brentOptimizer3.getStartValue();
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
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test5853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5853");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        int int6 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        int int9 = brentOptimizer3.getMaxEvaluations();
        double double10 = brentOptimizer3.getMax();
        double double11 = brentOptimizer3.getMin();
        double double12 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5854");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getEvaluations();
        double double8 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math3.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer3.optimize((int) (byte) -1, univariateFunction10, goalType11, (double) (byte) 1, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5855");
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
        int int17 = brentOptimizer3.getMaxEvaluations();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5856");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) ' ', (double) (byte) 1, univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getMaxEvaluations();
        double double5 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5857");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer2.getGoalType();
        int int6 = brentOptimizer2.getEvaluations();
        double double7 = brentOptimizer2.getMin();
        double double8 = brentOptimizer2.getStartValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5858");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100, 1.0d);
        int int3 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        int int5 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer2.optimize(100, univariateFunction7, goalType8, 0.0d, (double) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5859");
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
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair19 = brentOptimizer3.optimize((int) (short) 1, univariateFunction15, goalType16, (double) (short) 100, (double) (-1L));
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
    public void test5860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5860");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) -1, (double) (short) -1, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5861");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5862");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getStartValue();
        int int10 = brentOptimizer3.getEvaluations();
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5863");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker17 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker18 = brentOptimizer3.getConvergenceChecker();
        double double19 = brentOptimizer3.getStartValue();
        double double20 = brentOptimizer3.getStartValue();
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
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test5864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5864");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        int int8 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        double double11 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer3.getConvergenceChecker();
        int int13 = brentOptimizer3.getEvaluations();
        double double14 = brentOptimizer3.getStartValue();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker15);
    }

    @Test
    public void test5865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5865");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10L, 1.0d, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        java.lang.Class<?> wildcardClass5 = brentOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5866");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 10, (double) (short) 10);
        double double3 = brentOptimizer2.getMin();
        double double4 = brentOptimizer2.getMin();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5867");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMax();
        double double10 = brentOptimizer3.getMax();
        int int11 = brentOptimizer3.getEvaluations();
        int int12 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5868");
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
        int int15 = brentOptimizer3.getEvaluations();
        int int16 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType17 = brentOptimizer3.getGoalType();
        int int18 = brentOptimizer3.getMaxEvaluations();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(goalType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test5869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5869");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getMax();
        int int6 = brentOptimizer2.getMaxEvaluations();
        double double7 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer2.getGoalType();
        int int9 = brentOptimizer2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5870");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100, (double) 1, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
    }

    @Test
    public void test5871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5871");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1);
        double double3 = brentOptimizer2.getMax();
        int int4 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer2.getGoalType();
        double double6 = brentOptimizer2.getStartValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5872");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMin();
        double double8 = brentOptimizer3.getMax();
        double double9 = brentOptimizer3.getStartValue();
        double double10 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize(1, univariateFunction12, goalType13, (double) (-1), (double) (byte) 1);
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
    public void test5873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5873");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        int int5 = brentOptimizer3.getEvaluations();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test5874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5874");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        double double5 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test5875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5875");
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
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction14 = null;
        org.apache.commons.math3.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair18 = brentOptimizer3.optimize((int) (short) 1, univariateFunction14, goalType15, (double) 10L, (double) (short) 1);
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(goalType12);
    }

    @Test
    public void test5876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5876");
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
        double double12 = brentOptimizer3.getMin();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5877");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        int int8 = brentOptimizer3.getEvaluations();
        int int9 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        double double11 = brentOptimizer3.getMin();
        double double12 = brentOptimizer3.getMin();
        int int13 = brentOptimizer3.getMaxEvaluations();
        double double14 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker15 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker15);
    }

    @Test
    public void test5878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5878");
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
        org.apache.commons.math3.optimization.GoalType goalType15 = brentOptimizer3.getGoalType();
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
        org.junit.Assert.assertNull(goalType15);
    }

    @Test
    public void test5879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5879");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getMaxEvaluations();
        int int8 = brentOptimizer3.getMaxEvaluations();
        double double9 = brentOptimizer3.getMin();
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
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
    }

    @Test
    public void test5880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5880");
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
        double double14 = brentOptimizer3.getMin();
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
    public void test5881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5881");
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
        double double12 = brentOptimizer3.getStartValue();
        int int13 = brentOptimizer3.getEvaluations();
        double double14 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker15 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction17 = null;
        org.apache.commons.math3.optimization.GoalType goalType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair22 = brentOptimizer3.optimize((int) (byte) 10, univariateFunction17, goalType18, (double) (short) 0, (double) (-1L), (double) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker15);
    }

    @Test
    public void test5882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5882");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) '#', (double) (byte) 1);
        double double3 = brentOptimizer2.getMin();
        int int4 = brentOptimizer2.getEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5883");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math3.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair15 = brentOptimizer3.optimize((int) (byte) 10, univariateFunction10, goalType11, (double) ' ', (double) 100L, (double) 1L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
    }

    @Test
    public void test5884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5884");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getStartValue();
        double double10 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize((int) (short) 100, univariateFunction12, goalType13, (double) 1, (double) 'a');
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5885");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        int int6 = brentOptimizer3.getEvaluations();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getMax();
        int int9 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        int int12 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction14 = null;
        org.apache.commons.math3.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair19 = brentOptimizer3.optimize((int) 'a', univariateFunction14, goalType15, (double) (byte) 0, (double) (-1L), (double) 1L);
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
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5886");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1);
        double double3 = brentOptimizer2.getStartValue();
        double double4 = brentOptimizer2.getMax();
        int int5 = brentOptimizer2.getEvaluations();
        int int6 = brentOptimizer2.getMaxEvaluations();
        double double7 = brentOptimizer2.getMin();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5887");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 'a', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        double double5 = brentOptimizer3.getMax();
        int int6 = brentOptimizer3.getEvaluations();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer3.optimize((-1), univariateFunction9, goalType10, (double) (short) -1, (double) (-1L), (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5888");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 1, (double) 1, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getEvaluations();
        double double8 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5889");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        int int5 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer2.getGoalType();
        double double7 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer2.getConvergenceChecker();
        int int9 = brentOptimizer2.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair10 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5890");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) '#', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        double double6 = brentOptimizer3.getMin();
        int int7 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5891");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) (short) 10, univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getMaxEvaluations();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair12 = brentOptimizer3.optimize((int) (byte) 0, univariateFunction7, goalType8, (double) 100.0f, (double) (-1.0f), (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5892");
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
        double double12 = brentOptimizer3.getStartValue();
        double double13 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5893");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMin();
        double double8 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math3.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair15 = brentOptimizer3.optimize(0, univariateFunction10, goalType11, (double) (short) 0, (double) (-1.0f), (double) 10.0f);
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
    public void test5894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5894");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, (double) (byte) 10, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMax();
        double double5 = brentOptimizer3.getMin();
        double double6 = brentOptimizer3.getMax();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5895");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        double double5 = brentOptimizer2.getMin();
        double double6 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer2.getGoalType();
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test5896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5896");
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
        double double12 = brentOptimizer3.getStartValue();
        int int13 = brentOptimizer3.getEvaluations();
        double double14 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction16 = null;
        org.apache.commons.math3.optimization.GoalType goalType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair21 = brentOptimizer3.optimize((int) (byte) 100, univariateFunction16, goalType17, (double) ' ', (double) 'a', (double) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5897");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (-1L), (double) 0.0f, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5898");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10.0f, (double) (byte) 1, univariatePointValuePairConvergenceChecker2);
    }

    @Test
    public void test5899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5899");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(1.0d, (double) 'a', univariatePointValuePairConvergenceChecker2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair4 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5900");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        double double9 = brentOptimizer3.getMin();
        java.lang.Class<?> wildcardClass10 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5901");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer3.getConvergenceChecker();
        int int6 = brentOptimizer3.getEvaluations();
        double double7 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5902");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, (double) (short) 100);
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction4 = null;
        org.apache.commons.math3.optimization.GoalType goalType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair8 = brentOptimizer2.optimize((int) (short) -1, univariateFunction4, goalType5, (double) 'a', (double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5903");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        int int6 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer2.getConvergenceChecker();
        double double8 = brentOptimizer2.getMax();
        int int9 = brentOptimizer2.getMaxEvaluations();
        int int10 = brentOptimizer2.getEvaluations();
        double double11 = brentOptimizer2.getMax();
        double double12 = brentOptimizer2.getStartValue();
        double double13 = brentOptimizer2.getStartValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5904");
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
        org.apache.commons.math3.optimization.GoalType goalType13 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType14 = brentOptimizer3.getGoalType();
        double double15 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(goalType13);
        org.junit.Assert.assertNull(goalType14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5905");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        int int5 = brentOptimizer3.getEvaluations();
        int int6 = brentOptimizer3.getMaxEvaluations();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
    }

    @Test
    public void test5906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5906");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        double double7 = brentOptimizer3.getMax();
        int int8 = brentOptimizer3.getMaxEvaluations();
        int int9 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        int int11 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5907");
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
        double double12 = brentOptimizer3.getMin();
        double double13 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType14 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(goalType14);
    }

    @Test
    public void test5908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5908");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getStartValue();
        double double10 = brentOptimizer3.getMin();
        double double11 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType12 = brentOptimizer3.getGoalType();
        int int13 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType14 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(goalType14);
    }

    @Test
    public void test5909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5909");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        int int8 = brentOptimizer3.getEvaluations();
        int int9 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        double double11 = brentOptimizer3.getMin();
        double double12 = brentOptimizer3.getMin();
        int int13 = brentOptimizer3.getMaxEvaluations();
        double double14 = brentOptimizer3.getMin();
        double double15 = brentOptimizer3.getMin();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5910");
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
        int int12 = brentOptimizer3.getMaxEvaluations();
        int int13 = brentOptimizer3.getEvaluations();
        int int14 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker15 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker15);
    }

    @Test
    public void test5911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5911");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getEvaluations();
        double double5 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5912");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, 1.0d);
        int int3 = brentOptimizer2.getEvaluations();
        double double4 = brentOptimizer2.getMin();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5913");
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
        double double14 = brentOptimizer3.getStartValue();
        int int15 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction17 = null;
        org.apache.commons.math3.optimization.GoalType goalType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair22 = brentOptimizer3.optimize((int) 'a', univariateFunction17, goalType18, 1.0d, (double) 'a', (double) (-1L));
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(goalType13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5914");
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
        double double13 = brentOptimizer3.getStartValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer3.doOptimize();
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5915");
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
        double double14 = brentOptimizer3.getStartValue();
        int int15 = brentOptimizer3.getMaxEvaluations();
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5916");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) '4', (double) '#', univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getEvaluations();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        int int7 = brentOptimizer3.getEvaluations();
        int int8 = brentOptimizer3.getMaxEvaluations();
        double double9 = brentOptimizer3.getStartValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair10 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5917");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) ' ', (double) (short) 1, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair10 = brentOptimizer3.optimize(100, univariateFunction6, goalType7, (double) 0.0f, (double) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5918");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1.0f, (double) (short) 10);
        int int3 = brentOptimizer2.getMaxEvaluations();
        int int4 = brentOptimizer2.getEvaluations();
        double double5 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer2.getConvergenceChecker();
        int int7 = brentOptimizer2.getMaxEvaluations();
        double double8 = brentOptimizer2.getStartValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5919");
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
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair20 = brentOptimizer3.optimize(0, univariateFunction15, goalType16, (double) 1, (double) 10, (double) (-1L));
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
    public void test5920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5920");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        int int9 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType12 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType13 = brentOptimizer3.getGoalType();
        int int14 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertNull(goalType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5921");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMax();
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
    public void test5922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5922");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker13 = brentOptimizer3.getConvergenceChecker();
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
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5923");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        int int6 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer2.getConvergenceChecker();
        double double8 = brentOptimizer2.getMax();
        int int9 = brentOptimizer2.getMaxEvaluations();
        int int10 = brentOptimizer2.getEvaluations();
        int int11 = brentOptimizer2.getEvaluations();
        double double12 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.GoalType goalType13 = brentOptimizer2.getGoalType();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(goalType13);
    }

    @Test
    public void test5924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5924");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getEvaluations();
        double double8 = brentOptimizer3.getMax();
        double double9 = brentOptimizer3.getMax();
        int int10 = brentOptimizer3.getEvaluations();
        double double11 = brentOptimizer3.getMin();
        double double12 = brentOptimizer3.getMax();
        double double13 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5925");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 10);
        double double3 = brentOptimizer2.getMin();
        int int4 = brentOptimizer2.getMaxEvaluations();
        java.lang.Class<?> wildcardClass5 = brentOptimizer2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5926");
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
        int int13 = brentOptimizer3.getMaxEvaluations();
        int int14 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5927");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer3.getConvergenceChecker();
        double double13 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType14 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(goalType14);
    }

    @Test
    public void test5928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5928");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMin();
        int int8 = brentOptimizer3.getMaxEvaluations();
        double double9 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize((int) (short) -1, univariateFunction11, goalType12, (double) '4', (double) (byte) -1, (double) (-1.0f));
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
    public void test5929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5929");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker16 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType17 = brentOptimizer3.getGoalType();
        int int18 = brentOptimizer3.getEvaluations();
        double double19 = brentOptimizer3.getStartValue();
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
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker16);
        org.junit.Assert.assertNull(goalType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test5930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5930");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, (double) ' ', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        double double5 = brentOptimizer3.getMin();
        int int6 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair8 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test5931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5931");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, (double) (byte) 10, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass5 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5932");
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
        double double14 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker15 = brentOptimizer3.getConvergenceChecker();
        int int16 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction18 = null;
        org.apache.commons.math3.optimization.GoalType goalType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair23 = brentOptimizer3.optimize((int) (byte) 10, univariateFunction18, goalType19, (double) (short) 100, 10.0d, (double) 1L);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5933");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        int int4 = brentOptimizer2.getEvaluations();
        int int5 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer2.getGoalType();
        double double8 = brentOptimizer2.getMin();
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5934");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, (double) 10.0f);
        double double3 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
    }

    @Test
    public void test5935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5935");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getMin();
        double double4 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer2.getGoalType();
        double double6 = brentOptimizer2.getMax();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5936");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, 1.0d);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        int int4 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer2.optimize((int) (byte) 0, univariateFunction6, goalType7, (double) (byte) 100, (double) (byte) 100, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5937");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 10, (double) 1L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        double double5 = brentOptimizer3.getStartValue();
        java.lang.Class<?> wildcardClass6 = brentOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5938");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 1L);
        int int3 = brentOptimizer2.getMaxEvaluations();
        double double4 = brentOptimizer2.getMax();
        double double5 = brentOptimizer2.getMin();
        double double6 = brentOptimizer2.getMin();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5939");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        int int3 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        double double5 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer2.getConvergenceChecker();
        int int7 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer2.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
    }

    @Test
    public void test5940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5940");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 100, (double) 'a', univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getEvaluations();
        double double5 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test5941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5941");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType12 = brentOptimizer3.getGoalType();
        double double13 = brentOptimizer3.getMin();
        int int14 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5942");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10L, (double) (byte) 100);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
    }

    @Test
    public void test5943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5943");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 10);
        double double3 = brentOptimizer2.getMin();
        int int4 = brentOptimizer2.getMaxEvaluations();
        int int5 = brentOptimizer2.getMaxEvaluations();
        double double6 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer2.getConvergenceChecker();
        int int8 = brentOptimizer2.getEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5944");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        int int9 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
        double double12 = brentOptimizer3.getMin();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5945");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10.0f, (double) '#');
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math3.optimization.GoalType goalType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair10 = brentOptimizer2.optimize((int) (short) -1, univariateFunction5, goalType6, (double) 100.0f, (double) (byte) 0, (double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test5946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5946");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        double double9 = brentOptimizer3.getMin();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5947");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker16 = brentOptimizer3.getConvergenceChecker();
        double double17 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType18 = brentOptimizer3.getGoalType();
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
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNull(goalType18);
    }

    @Test
    public void test5948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5948");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        double double8 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        double double10 = brentOptimizer3.getStartValue();
        double double11 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker13 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction15 = null;
        org.apache.commons.math3.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair20 = brentOptimizer3.optimize(0, univariateFunction15, goalType16, (double) (-1), (double) 1, 0.0d);
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker13);
    }

    @Test
    public void test5949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5949");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(1.0d, 10.0d);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        int int4 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer2.getGoalType();
        int int7 = brentOptimizer2.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5950");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getMax();
        int int9 = brentOptimizer3.getEvaluations();
        int int10 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
        int int12 = brentOptimizer3.getMaxEvaluations();
        int int13 = brentOptimizer3.getEvaluations();
        double double14 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5951");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker13 = brentOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass14 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5952");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        int int4 = brentOptimizer2.getEvaluations();
        int int5 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair12 = brentOptimizer2.optimize((int) (short) 100, univariateFunction7, goalType8, 10.0d, (double) 'a', (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5953");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1L, (double) 1L, univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getMaxEvaluations();
        double double5 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5954");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 1L);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        int int5 = brentOptimizer2.getEvaluations();
        double double6 = brentOptimizer2.getMin();
        double double7 = brentOptimizer2.getStartValue();
        double double8 = brentOptimizer2.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5955");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        int int6 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        double double9 = brentOptimizer3.getStartValue();
        int int10 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5956");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        double double5 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer2.getConvergenceChecker();
        double double8 = brentOptimizer2.getMin();
        double double9 = brentOptimizer2.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer2.optimize((int) (short) 100, univariateFunction11, goalType12, (double) (byte) 100, (double) (short) -1, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5957");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getStartValue();
        int int6 = brentOptimizer2.getMaxEvaluations();
        double double7 = brentOptimizer2.getMin();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5958");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        double double5 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer3.optimize((int) (byte) 0, univariateFunction9, goalType10, 1.0d, 0.0d, (double) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5959");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        int int8 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        double double11 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType12 = brentOptimizer3.getGoalType();
        int int13 = brentOptimizer3.getMaxEvaluations();
        java.lang.Class<?> wildcardClass14 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5960");
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
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction14 = null;
        org.apache.commons.math3.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair18 = brentOptimizer3.optimize((int) (byte) 1, univariateFunction14, goalType15, (double) (-1.0f), (double) (short) 100);
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
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5961");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) ' ', (double) (byte) 1, univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5962");
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
        double double12 = brentOptimizer3.getStartValue();
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
    public void test5963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5963");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, (double) 100.0f, univariatePointValuePairConvergenceChecker2);
    }

    @Test
    public void test5964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5964");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 10.0f);
        double double3 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer2.getGoalType();
        int int7 = brentOptimizer2.getEvaluations();
        java.lang.Class<?> wildcardClass8 = brentOptimizer2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5965");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        int int6 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        double double10 = brentOptimizer3.getStartValue();
        double double11 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5966");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) '#', (double) 0L, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5967");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1);
        double double3 = brentOptimizer2.getStartValue();
        double double4 = brentOptimizer2.getMax();
        double double5 = brentOptimizer2.getStartValue();
        double double6 = brentOptimizer2.getMin();
        int int7 = brentOptimizer2.getMaxEvaluations();
        int int8 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math3.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer2.optimize((int) (short) 100, univariateFunction10, goalType11, (double) 0, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5968");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 100L, univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getEvaluations();
        double double5 = brentOptimizer3.getMin();
        double double6 = brentOptimizer3.getMax();
        double double7 = brentOptimizer3.getStartValue();
        double double8 = brentOptimizer3.getMin();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5969");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        int int9 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        int int11 = brentOptimizer3.getEvaluations();
        int int12 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5970");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10.0f, 100.0d);
        int int3 = brentOptimizer2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5971");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        int int4 = brentOptimizer2.getEvaluations();
        double double5 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer2.getGoalType();
        int int7 = brentOptimizer2.getMaxEvaluations();
        double double8 = brentOptimizer2.getMax();
        double double9 = brentOptimizer2.getMax();
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5972");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 'a', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        double double9 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        double double12 = brentOptimizer3.getMax();
        int int13 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5973");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        int int6 = brentOptimizer3.getEvaluations();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getMax();
        double double9 = brentOptimizer3.getMin();
        double double10 = brentOptimizer3.getStartValue();
        double double11 = brentOptimizer3.getStartValue();
        double double12 = brentOptimizer3.getMin();
        double double13 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5974");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 100, (double) (short) -1, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5975");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getMax();
        int int6 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer2.getGoalType();
        double double8 = brentOptimizer2.getStartValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5976");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        int int6 = brentOptimizer3.getEvaluations();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        double double10 = brentOptimizer3.getMin();
        int int11 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5977");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 1, (double) 1);
        double double3 = brentOptimizer2.getStartValue();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getMax();
        int int6 = brentOptimizer2.getEvaluations();
        double double7 = brentOptimizer2.getMin();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5978");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        int int4 = brentOptimizer2.getEvaluations();
        double double5 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer2.getConvergenceChecker();
        int int7 = brentOptimizer2.getMaxEvaluations();
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5979");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getMax();
        int int6 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer2.getGoalType();
        double double8 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer2.getGoalType();
        int int10 = brentOptimizer2.getMaxEvaluations();
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
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5980");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        double double8 = brentOptimizer3.getMax();
        int int9 = brentOptimizer3.getEvaluations();
        double double10 = brentOptimizer3.getStartValue();
        double double11 = brentOptimizer3.getStartValue();
        double double12 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType13 = brentOptimizer3.getGoalType();
        double double14 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(goalType13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5981");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 1, (double) '#', univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair12 = brentOptimizer3.optimize((int) (byte) 100, univariateFunction7, goalType8, (double) (-1L), (double) (byte) 10, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test5982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5982");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker15 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType16 = brentOptimizer3.getGoalType();
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
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker15);
        org.junit.Assert.assertNull(goalType16);
    }

    @Test
    public void test5983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5983");
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
        double double12 = brentOptimizer3.getStartValue();
        int int13 = brentOptimizer3.getEvaluations();
        double double14 = brentOptimizer3.getMax();
        double double15 = brentOptimizer3.getMin();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5984");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10L, 1.0d, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = goalType6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test5985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5985");
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
        double double14 = brentOptimizer3.getStartValue();
        int int15 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker16 = brentOptimizer3.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer3.doOptimize();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker16);
    }

    @Test
    public void test5986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5986");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getMaxEvaluations();
        double double5 = brentOptimizer3.getStartValue();
        int int6 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5987");
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
        double double14 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType15 = brentOptimizer3.getGoalType();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(goalType15);
    }

    @Test
    public void test5988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5988");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMin();
        double double10 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5989");
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
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5990");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        double double8 = brentOptimizer3.getMax();
        double double9 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        int int11 = brentOptimizer3.getEvaluations();
        double double12 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5991");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        int int11 = brentOptimizer3.getEvaluations();
        double double12 = brentOptimizer3.getMax();
        double double13 = brentOptimizer3.getMax();
        double double14 = brentOptimizer3.getMax();
        double double15 = brentOptimizer3.getMin();
        double double16 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test5992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5992");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getMax();
        int int10 = brentOptimizer3.getMaxEvaluations();
        int int11 = brentOptimizer3.getMaxEvaluations();
        double double12 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5993");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        int int5 = brentOptimizer3.getEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5994");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        double double5 = brentOptimizer2.getMax();
        double double6 = brentOptimizer2.getMin();
        double double7 = brentOptimizer2.getMax();
        double double8 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer2.getGoalType();
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertNull(goalType10);
    }

    @Test
    public void test5995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5995");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        double double5 = brentOptimizer2.getMin();
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5996");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) -1, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5997");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        int int6 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        double double9 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
    }

    @Test
    public void test5998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5998");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5999");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) (short) 1);
    }

    @Test
    public void test6000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test6000");
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
        int int12 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }
}

