package org.apache.commons.math3.optimization.univariate;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

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
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
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
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
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
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) -1, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
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
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
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
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
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
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
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
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer3.getConvergenceChecker();
        int int6 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType13 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
        org.junit.Assert.assertNull(goalType13);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        double double5 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 100, (double) '4', univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 'a', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        double double5 = brentOptimizer3.getMax();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 1, (double) (short) 10, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        double double5 = brentOptimizer3.getMax();
        double double6 = brentOptimizer3.getMin();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) (byte) 100, univariatePointValuePairConvergenceChecker2);
        java.lang.Class<?> wildcardClass4 = brentOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker13 = brentOptimizer3.getConvergenceChecker();
        double double14 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker15 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker15);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 100, (double) '#');
        int int3 = brentOptimizer2.getEvaluations();
        int int4 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer2.optimize((int) ' ', univariateFunction7, goalType8, (double) 10.0f, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(1.0d, (double) 1, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
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
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction14 = null;
        org.apache.commons.math3.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair19 = brentOptimizer3.optimize((int) 'a', univariateFunction14, goalType15, (double) 100, 0.0d, (double) (short) 0);
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10, (double) (short) 10, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        int int5 = brentOptimizer3.getEvaluations();
        int int6 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) ' ', (double) 100.0f, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer3.optimize(0, univariateFunction7, goalType8, (double) 10.0f, (double) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(1.0d, 10.0d);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer2.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getEvaluations();
        double double8 = brentOptimizer3.getStartValue();
        double double9 = brentOptimizer3.getMax();
        int int10 = brentOptimizer3.getEvaluations();
        int int11 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer3.getConvergenceChecker();
        int int13 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(1.0d, 10.0d);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        int int4 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer2.getGoalType();
        double double7 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer2.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        int int8 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        int int10 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer3.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = univariatePointValuePairConvergenceChecker12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10, (double) 1L, univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getMaxEvaluations();
        double double5 = brentOptimizer3.getMax();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
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
        double double15 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction17 = null;
        org.apache.commons.math3.optimization.GoalType goalType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair22 = brentOptimizer3.optimize((int) (short) 1, univariateFunction17, goalType18, (double) 10.0f, (double) '4', (double) 0L);
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
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100.0f, (double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair3 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100.0f, 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair3 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 100, (double) 'a', univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getEvaluations();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair13 = brentOptimizer3.optimize((int) 'a', univariateFunction9, goalType10, (double) 1, 1.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) -1, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) '4', (double) '#', univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getEvaluations();
        double double8 = brentOptimizer3.getStartValue();
        int int9 = brentOptimizer3.getEvaluations();
        double double10 = brentOptimizer3.getMax();
        int int11 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
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
        double double13 = brentOptimizer3.getStartValue();
        double double14 = brentOptimizer3.getMin();
        double double15 = brentOptimizer3.getStartValue();
        double double16 = brentOptimizer3.getMin();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 100, (double) '#');
        int int3 = brentOptimizer2.getEvaluations();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getMin();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
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
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer3.optimize((int) (byte) 10, univariateFunction13, goalType14, (double) (byte) 1, (double) (short) 1);
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
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 100, (double) 1L, univariatePointValuePairConvergenceChecker2);
        java.lang.Class<?> wildcardClass4 = brentOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
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
        org.apache.commons.math3.optimization.GoalType goalType15 = brentOptimizer3.getGoalType();
        double double16 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction18 = null;
        org.apache.commons.math3.optimization.GoalType goalType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair22 = brentOptimizer3.optimize((int) (short) 10, univariateFunction18, goalType19, (double) 100.0f, (double) (short) 0);
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
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker14);
        org.junit.Assert.assertNull(goalType15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        int int11 = brentOptimizer3.getEvaluations();
        int int12 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker13 = brentOptimizer3.getConvergenceChecker();
        double double14 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        int int11 = brentOptimizer3.getMaxEvaluations();
        double double12 = brentOptimizer3.getMax();
        int int13 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        int int9 = brentOptimizer3.getMaxEvaluations();
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
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
        double double14 = brentOptimizer3.getMin();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair15 = brentOptimizer3.doOptimize();
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getStartValue();
        double double9 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
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
        int int14 = brentOptimizer3.getMaxEvaluations();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10L, (double) (short) 10);
        int int3 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        double double5 = brentOptimizer2.getMax();
        int int6 = brentOptimizer2.getMaxEvaluations();
        int int7 = brentOptimizer2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getMin();
        double double4 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer2.optimize((int) (byte) 10, univariateFunction7, goalType8, (double) (byte) 10, (double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getMax();
        double double9 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType12 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertNull(goalType12);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 100, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        int int8 = brentOptimizer3.getEvaluations();
        double double9 = brentOptimizer3.getMax();
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 100);
        double double3 = brentOptimizer2.getMin();
        int int4 = brentOptimizer2.getEvaluations();
        int int5 = brentOptimizer2.getEvaluations();
        double double6 = brentOptimizer2.getStartValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) ' ', (double) (byte) 1, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        double double5 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        double double10 = brentOptimizer3.getMin();
        double double11 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
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
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer3.optimize((int) (byte) 1, univariateFunction13, goalType14, (double) 100, (double) 100);
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
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        int int6 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType12 = brentOptimizer3.getGoalType();
        int int13 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, 1.0d);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        int int4 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        int int6 = brentOptimizer2.getMaxEvaluations();
        int int7 = brentOptimizer2.getMaxEvaluations();
        int int8 = brentOptimizer2.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getMax();
        double double10 = brentOptimizer3.getStartValue();
        int int11 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 10, (double) (byte) 100);
        double double3 = brentOptimizer2.getStartValue();
        double double4 = brentOptimizer2.getMax();
        double double5 = brentOptimizer2.getStartValue();
        int int6 = brentOptimizer2.getMaxEvaluations();
        double double7 = brentOptimizer2.getMax();
        int int8 = brentOptimizer2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) '4');
        double double3 = brentOptimizer2.getMax();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) '4', univariatePointValuePairConvergenceChecker2);
        java.lang.Class<?> wildcardClass4 = brentOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
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
        double double12 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker13 = brentOptimizer3.getConvergenceChecker();
        int int14 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) '#', (double) '4');
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction4 = null;
        org.apache.commons.math3.optimization.GoalType goalType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair9 = brentOptimizer2.optimize((int) '4', univariateFunction4, goalType5, (double) 0L, (double) 0L, (double) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 100, 100.0d, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, 100.0d, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMax();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        int int4 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        double double6 = brentOptimizer2.getMax();
        java.lang.Class<?> wildcardClass7 = brentOptimizer2.getClass();
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 10);
        double double3 = brentOptimizer2.getMin();
        int int4 = brentOptimizer2.getMaxEvaluations();
        int int5 = brentOptimizer2.getMaxEvaluations();
        double double6 = brentOptimizer2.getStartValue();
        int int7 = brentOptimizer2.getEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100, (double) (byte) 0, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMin();
        int int8 = brentOptimizer3.getMaxEvaluations();
        double double9 = brentOptimizer3.getMax();
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
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10L, (double) (short) 10);
        int int3 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        double double5 = brentOptimizer2.getStartValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        double double8 = brentOptimizer3.getMax();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair9 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getMaxEvaluations();
        int int8 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        int int11 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        int int4 = brentOptimizer2.getEvaluations();
        double double5 = brentOptimizer2.getStartValue();
        int int6 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer2.getGoalType();
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMin();
        double double10 = brentOptimizer3.getMin();
        int int11 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer3.getConvergenceChecker();
        int int13 = brentOptimizer3.getMaxEvaluations();
        int int14 = brentOptimizer3.getMaxEvaluations();
        double double15 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 10, (double) 1.0f);
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction4 = null;
        org.apache.commons.math3.optimization.GoalType goalType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair8 = brentOptimizer2.optimize((int) (short) -1, univariateFunction4, goalType5, (double) (byte) 100, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        double double5 = brentOptimizer3.getMin();
        int int6 = brentOptimizer3.getMaxEvaluations();
        double double7 = brentOptimizer3.getStartValue();
        double double8 = brentOptimizer3.getMin();
        java.lang.Class<?> wildcardClass9 = brentOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10.0f, (double) 100.0f, univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        int int8 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        int int11 = brentOptimizer3.getMaxEvaluations();
        double double12 = brentOptimizer3.getStartValue();
        int int13 = brentOptimizer3.getMaxEvaluations();
        int int14 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 'a', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        double double9 = brentOptimizer3.getMax();
        double double10 = brentOptimizer3.getMin();
        int int11 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        int int6 = brentOptimizer2.getEvaluations();
        double double7 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer2.getGoalType();
        int int9 = brentOptimizer2.getMaxEvaluations();
        int int10 = brentOptimizer2.getEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, 1.0d);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        int int4 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        int int6 = brentOptimizer2.getMaxEvaluations();
        int int7 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer2.getGoalType();
        double double9 = brentOptimizer2.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer2.optimize((int) (short) 0, univariateFunction11, goalType12, (double) 100.0f, (double) (byte) 10, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
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
        int int12 = brentOptimizer3.getMaxEvaluations();
        int int13 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) ' ', (double) (byte) 1, univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        double double8 = brentOptimizer3.getMax();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1L, (double) 100L);
        java.lang.Class<?> wildcardClass3 = brentOptimizer2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) 100.0f, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        double double5 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
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
        int int12 = brentOptimizer3.getMaxEvaluations();
        int int13 = brentOptimizer3.getMaxEvaluations();
        double double14 = brentOptimizer3.getStartValue();
        double double15 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        int int8 = brentOptimizer3.getMaxEvaluations();
        double double9 = brentOptimizer3.getMax();
        double double10 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getMax();
        int int6 = brentOptimizer2.getMaxEvaluations();
        int int7 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math3.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer2.optimize((int) '4', univariateFunction10, goalType11, (double) (byte) 100, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
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
        java.lang.Class<?> wildcardClass13 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
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
        double double14 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction16 = null;
        org.apache.commons.math3.optimization.GoalType goalType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair20 = brentOptimizer3.optimize((int) (byte) 1, univariateFunction16, goalType17, (double) (byte) 100, (double) '4');
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        double double8 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        double double11 = brentOptimizer3.getMin();
        double double12 = brentOptimizer3.getMax();
        int int13 = brentOptimizer3.getMaxEvaluations();
        int int14 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (-1), (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100.0f, (double) (byte) 1);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        double double4 = brentOptimizer2.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
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
        org.apache.commons.math3.optimization.GoalType goalType15 = brentOptimizer3.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = goalType15.getClass();
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(goalType15);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getMin();
        double double10 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        double double12 = brentOptimizer3.getMax();
        double double13 = brentOptimizer3.getMax();
        int int14 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
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
        int int17 = brentOptimizer3.getMaxEvaluations();
        double double18 = brentOptimizer3.getMin();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 10);
        double double3 = brentOptimizer2.getMin();
        int int4 = brentOptimizer2.getMaxEvaluations();
        int int5 = brentOptimizer2.getMaxEvaluations();
        int int6 = brentOptimizer2.getEvaluations();
        double double7 = brentOptimizer2.getMin();
        int int8 = brentOptimizer2.getEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        double double8 = brentOptimizer3.getMax();
        double double9 = brentOptimizer3.getMin();
        double double10 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer3.optimize(10, univariateFunction12, goalType13, (double) 10L, 100.0d, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1.0f, (double) 1L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 100, (double) 1L);
        double double3 = brentOptimizer2.getMax();
        double double4 = brentOptimizer2.getStartValue();
        int int5 = brentOptimizer2.getMaxEvaluations();
        int int6 = brentOptimizer2.getEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100.0f, 1.0d);
        int int3 = brentOptimizer2.getEvaluations();
        int int4 = brentOptimizer2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 10, (double) (byte) 100);
        double double3 = brentOptimizer2.getStartValue();
        double double4 = brentOptimizer2.getMax();
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
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 0.0f, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMin();
        int int8 = brentOptimizer3.getMaxEvaluations();
        double double9 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertNull(goalType11);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        int int5 = brentOptimizer3.getEvaluations();
        int int6 = brentOptimizer3.getMaxEvaluations();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass10 = brentOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMax();
        java.lang.Class<?> wildcardClass8 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math3.optimization.GoalType goalType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair9 = brentOptimizer3.optimize((int) (short) 100, univariateFunction5, goalType6, (double) 10, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        int int8 = brentOptimizer3.getEvaluations();
        double double9 = brentOptimizer3.getMax();
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getMax();
        double double9 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        double double11 = brentOptimizer3.getMin();
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
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
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
        double double12 = brentOptimizer3.getMax();
        double double13 = brentOptimizer3.getStartValue();
        double double14 = brentOptimizer3.getMin();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 1, (double) (byte) 10, univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getEvaluations();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getMin();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1.0f, (double) (short) 100);
        double double3 = brentOptimizer2.getStartValue();
        java.lang.Class<?> wildcardClass4 = brentOptimizer2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1L, (double) (short) 100, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getMax();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize(10, univariateFunction12, goalType13, (double) 0, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
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
        double double12 = brentOptimizer3.getStartValue();
        int int13 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair15 = brentOptimizer3.optimize(10, univariateFunction11, goalType12, (double) 100.0f, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getStartValue();
        double double9 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        double double11 = brentOptimizer3.getMin();
        double double12 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction14 = null;
        org.apache.commons.math3.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair18 = brentOptimizer3.optimize(100, univariateFunction14, goalType15, (double) (byte) -1, (double) 100.0f);
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
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 0L, (double) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        double double5 = brentOptimizer3.getMin();
        int int6 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        double double8 = brentOptimizer3.getMax();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        double double5 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer2.getConvergenceChecker();
        double double8 = brentOptimizer2.getMin();
        double double9 = brentOptimizer2.getMax();
        double double10 = brentOptimizer2.getMax();
        int int11 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair18 = brentOptimizer2.optimize((int) (byte) 10, univariateFunction13, goalType14, (double) 10L, 0.0d, 100.0d);
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker13 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction15 = null;
        org.apache.commons.math3.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair20 = brentOptimizer3.optimize(1, univariateFunction15, goalType16, (double) (short) -1, (double) 'a', (double) (short) 0);
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
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker13);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        int int5 = brentOptimizer3.getMaxEvaluations();
        int int6 = brentOptimizer3.getMaxEvaluations();
        double double7 = brentOptimizer3.getStartValue();
        double double8 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        int int10 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMax();
        double double9 = brentOptimizer3.getMax();
        int int10 = brentOptimizer3.getEvaluations();
        double double11 = brentOptimizer3.getMax();
        int int12 = brentOptimizer3.getEvaluations();
        int int13 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 0, (double) (-1.0f), univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(1.0d, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
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
        int int12 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
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
        double double12 = brentOptimizer3.getMax();
        double double13 = brentOptimizer3.getStartValue();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMax();
        int int8 = brentOptimizer3.getMaxEvaluations();
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
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 'a', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        double double5 = brentOptimizer3.getMax();
        int int6 = brentOptimizer3.getEvaluations();
        int int7 = brentOptimizer3.getMaxEvaluations();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        int int8 = brentOptimizer3.getMaxEvaluations();
        double double9 = brentOptimizer3.getMin();
        int int10 = brentOptimizer3.getMaxEvaluations();
        double double11 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        double double9 = brentOptimizer3.getStartValue();
        double double10 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer3.optimize((int) (byte) 0, univariateFunction12, goalType13, (double) 100.0f, (double) (short) 0, (double) 100);
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
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getMaxEvaluations();
        int int8 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType12 = brentOptimizer3.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = goalType12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertNull(goalType12);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) (short) 10, univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer3.optimize((int) (short) 10, univariateFunction6, goalType7, (double) 100.0f, (double) (short) -1, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, (double) 10);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        org.junit.Assert.assertNull(goalType3);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 0, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100.0f, 10.0d, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer3.optimize((int) (short) -1, univariateFunction6, goalType7, (double) '4', (double) 10.0f, (double) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize((int) (short) 100, univariateFunction12, goalType13, (double) 'a', (double) 10L);
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
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        double double6 = brentOptimizer3.getMax();
        double double7 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        int int9 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100, 1.0d);
        int int3 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer2.getGoalType();
        java.lang.Class<?> wildcardClass6 = brentOptimizer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
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
        org.apache.commons.math3.optimization.GoalType goalType14 = brentOptimizer3.getGoalType();
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
        org.junit.Assert.assertNull(goalType14);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 100, (double) 1L);
        double double3 = brentOptimizer2.getMax();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        double double5 = brentOptimizer2.getMax();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10L, (double) (byte) 100);
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
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
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
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1);
        double double3 = brentOptimizer2.getStartValue();
        int int4 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair10 = brentOptimizer2.optimize((int) (byte) 1, univariateFunction6, goalType7, (double) 10.0f, (double) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
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
        int int12 = brentOptimizer3.getEvaluations();
        double double13 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType14 = brentOptimizer3.getGoalType();
        double double15 = brentOptimizer3.getStartValue();
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
        org.junit.Assert.assertNull(goalType14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        double double8 = brentOptimizer3.getMax();
        double double9 = brentOptimizer3.getStartValue();
        int int10 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
        double double12 = brentOptimizer3.getStartValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair13 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        int int6 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        int int8 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker13 = brentOptimizer3.getConvergenceChecker();
        double double14 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 0.0f, (double) (byte) 0, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
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
        int int13 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10, (double) 10.0f, univariatePointValuePairConvergenceChecker2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair4 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) -1, (double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        int int11 = brentOptimizer3.getMaxEvaluations();
        double double12 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMin();
        double double8 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100, (double) 100L);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getEvaluations();
        double double8 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        double double11 = brentOptimizer3.getMin();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 100, (double) 'a', univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getEvaluations();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        double double9 = brentOptimizer3.getMax();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
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
        org.apache.commons.math3.optimization.GoalType goalType14 = brentOptimizer3.getGoalType();
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
        org.junit.Assert.assertNull(goalType14);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
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
        double double15 = brentOptimizer3.getMax();
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 0, (double) (short) 0, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
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
        int int14 = brentOptimizer3.getMaxEvaluations();
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
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair3 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        int int8 = brentOptimizer3.getEvaluations();
        double double9 = brentOptimizer3.getStartValue();
        int int10 = brentOptimizer3.getMaxEvaluations();
        double double11 = brentOptimizer3.getMin();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        int int4 = brentOptimizer2.getEvaluations();
        int int5 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer2.getGoalType();
        double double8 = brentOptimizer2.getStartValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair9 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        double double4 = brentOptimizer2.getStartValue();
        double double5 = brentOptimizer2.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer2.getConvergenceChecker();
        double double7 = brentOptimizer2.getMax();
        double double8 = brentOptimizer2.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer2.getConvergenceChecker();
        int int10 = brentOptimizer2.getEvaluations();
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
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
        double double12 = brentOptimizer3.getMax();
        int int13 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker14 = brentOptimizer3.getConvergenceChecker();
        double double15 = brentOptimizer3.getMin();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMax();
        int int8 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer3.getConvergenceChecker();
        double double6 = brentOptimizer3.getMin();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10L, (double) (byte) 100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        double double4 = brentOptimizer2.getMax();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair5 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
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
        int int13 = brentOptimizer3.getEvaluations();
        int int14 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100, (double) (byte) 1);
        double double3 = brentOptimizer2.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math3.optimization.GoalType goalType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair10 = brentOptimizer2.optimize(10, univariateFunction5, goalType6, 1.0d, (double) 100.0f, (double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
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
        double double15 = brentOptimizer3.getMax();
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, (double) (byte) 10, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        double double5 = brentOptimizer3.getMax();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) (short) 10);
        int int3 = brentOptimizer2.getEvaluations();
        double double4 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair6 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        double double8 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(goalType11);
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
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
        double double12 = brentOptimizer3.getMin();
        double double13 = brentOptimizer3.getMax();
        java.lang.Class<?> wildcardClass14 = brentOptimizer3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        double double4 = brentOptimizer2.getMin();
        double double5 = brentOptimizer2.getStartValue();
        double double6 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math3.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair12 = brentOptimizer2.optimize((int) (short) 1, univariateFunction8, goalType9, (double) 100.0f, 100.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) 1L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair12 = brentOptimizer3.optimize((int) (short) 100, univariateFunction7, goalType8, (double) 10L, (double) 10L, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
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
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker14);
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getMax();
        double double10 = brentOptimizer3.getMax();
        double double11 = brentOptimizer3.getMin();
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
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100, (double) 100);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 1L);
        int int3 = brentOptimizer2.getMaxEvaluations();
        double double4 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer2.getGoalType();
        double double6 = brentOptimizer2.getMin();
        java.lang.Class<?> wildcardClass7 = brentOptimizer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        double double8 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        double double10 = brentOptimizer3.getStartValue();
        java.lang.Class<?> wildcardClass11 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 100, (double) 'a', univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getMaxEvaluations();
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
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        int int3 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        int int5 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer2.getGoalType();
        double double7 = brentOptimizer2.getMax();
        int int8 = brentOptimizer2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
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
        double double13 = brentOptimizer3.getMin();
        int int14 = brentOptimizer3.getMaxEvaluations();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 10, (double) ' ');
        double double3 = brentOptimizer2.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        int int5 = brentOptimizer2.getEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        int int4 = brentOptimizer2.getEvaluations();
        double double5 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer2.getConvergenceChecker();
        double double7 = brentOptimizer2.getStartValue();
        double double8 = brentOptimizer2.getStartValue();
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
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
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer3.optimize((-1), univariateFunction13, goalType14, (double) (-1.0f), (double) 0);
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
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) '4', (double) (byte) 1, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = univariatePointValuePairConvergenceChecker4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
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
        int int13 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType14 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType15 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(goalType14);
        org.junit.Assert.assertNull(goalType15);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
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
        double double14 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType15 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker16 = brentOptimizer3.getConvergenceChecker();
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
        org.junit.Assert.assertNull(goalType15);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker16);
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(1.0d, (double) 1, univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getMaxEvaluations();
        double double5 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker14 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType15 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType16 = brentOptimizer3.getGoalType();
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
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker14);
        org.junit.Assert.assertNull(goalType15);
        org.junit.Assert.assertNull(goalType16);
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getMin();
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        int int5 = brentOptimizer3.getEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        double double7 = brentOptimizer3.getMin();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        double double5 = brentOptimizer3.getMax();
        double double6 = brentOptimizer3.getMin();
        double double7 = brentOptimizer3.getMin();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((-1.0d), 100.0d, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMax();
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
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker15 = brentOptimizer3.getConvergenceChecker();
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
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker15);
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
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
        int int13 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 10, (double) 'a');
        int int3 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        int int5 = brentOptimizer2.getEvaluations();
        int int6 = brentOptimizer2.getMaxEvaluations();
        int int7 = brentOptimizer2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, 100.0d, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMax();
        double double5 = brentOptimizer3.getMin();
        int int6 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(1.0d, 10.0d);
        int int3 = brentOptimizer2.getMaxEvaluations();
        double double4 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer2.getGoalType();
        double double6 = brentOptimizer2.getMin();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair7 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        double double6 = brentOptimizer3.getMax();
        double double7 = brentOptimizer3.getStartValue();
        int int8 = brentOptimizer3.getMaxEvaluations();
        int int9 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        double double8 = brentOptimizer3.getMax();
        double double9 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        double double11 = brentOptimizer3.getMin();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMax();
        int int8 = brentOptimizer3.getEvaluations();
        double double9 = brentOptimizer3.getStartValue();
        double double10 = brentOptimizer3.getMin();
        int int11 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) '#', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer3.optimize((int) (byte) -1, univariateFunction7, goalType8, (double) 100.0f, (double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType5);
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getMax();
        double double9 = brentOptimizer3.getMin();
        int int10 = brentOptimizer3.getMaxEvaluations();
        double double11 = brentOptimizer3.getMin();
        int int12 = brentOptimizer3.getMaxEvaluations();
        int int13 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 10, (double) 'a');
        int int3 = brentOptimizer2.getMaxEvaluations();
        double double4 = brentOptimizer2.getStartValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10, (double) 10.0f, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMax();
        java.lang.Class<?> wildcardClass5 = brentOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        double double8 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        int int6 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        int int8 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        int int10 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        int int11 = brentOptimizer3.getMaxEvaluations();
        double double12 = brentOptimizer3.getMin();
        java.lang.Class<?> wildcardClass13 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 10);
        double double3 = brentOptimizer2.getMin();
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
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10L, (double) (short) 10);
        int int3 = brentOptimizer2.getEvaluations();
        int int4 = brentOptimizer2.getEvaluations();
        int int5 = brentOptimizer2.getMaxEvaluations();
        int int6 = brentOptimizer2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMin();
        double double8 = brentOptimizer3.getStartValue();
        double double9 = brentOptimizer3.getStartValue();
        int int10 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1.0f, (double) 10L);
        double double3 = brentOptimizer2.getMax();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction6 = null;
        org.apache.commons.math3.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer2.optimize((int) ' ', univariateFunction6, goalType7, 1.0d, (double) 10.0f, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1L, (double) 100.0f, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMax();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getStartValue();
        int int10 = brentOptimizer3.getEvaluations();
        double double11 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType12 = brentOptimizer3.getGoalType();
        int int13 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction15 = null;
        org.apache.commons.math3.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair20 = brentOptimizer3.optimize(0, univariateFunction15, goalType16, (double) 100, (double) (short) 100, (double) 1.0f);
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
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
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
        double double15 = brentOptimizer3.getStartValue();
        int int16 = brentOptimizer3.getMaxEvaluations();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100, (double) (short) 1);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        org.junit.Assert.assertNull(goalType3);
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 'a', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMax();
        int int8 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10.0f, (double) (short) 100);
        double double3 = brentOptimizer2.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) ' ', univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
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
        double double15 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker16 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction18 = null;
        org.apache.commons.math3.optimization.GoalType goalType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair22 = brentOptimizer3.optimize((int) (byte) -1, univariateFunction18, goalType19, (double) 'a', (double) 10);
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
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker16);
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
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
        double double16 = brentOptimizer3.getStartValue();
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        int int8 = brentOptimizer3.getMaxEvaluations();
        double double9 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        double double11 = brentOptimizer3.getMin();
        int int12 = brentOptimizer3.getMaxEvaluations();
        int int13 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
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
        int int14 = brentOptimizer3.getEvaluations();
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
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(goalType15);
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) '#', univariatePointValuePairConvergenceChecker2);
        java.lang.Class<?> wildcardClass4 = brentOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1);
        double double3 = brentOptimizer2.getMax();
        int int4 = brentOptimizer2.getEvaluations();
        double double5 = brentOptimizer2.getStartValue();
        double double6 = brentOptimizer2.getMin();
        int int7 = brentOptimizer2.getEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        double double11 = brentOptimizer3.getMin();
        int int12 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        int int9 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        double double11 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction14 = null;
        org.apache.commons.math3.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair18 = brentOptimizer3.optimize((int) ' ', univariateFunction14, goalType15, (double) 0.0f, (double) (short) -1);
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
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer3.getConvergenceChecker();
        double double13 = brentOptimizer3.getMin();
        double double14 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 'a', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertNull(goalType10);
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        int int6 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        double double10 = brentOptimizer3.getStartValue();
        java.lang.Class<?> wildcardClass11 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker13 = brentOptimizer2.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker13);
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
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
        org.apache.commons.math3.optimization.GoalType goalType15 = brentOptimizer3.getGoalType();
        double double16 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction18 = null;
        org.apache.commons.math3.optimization.GoalType goalType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair22 = brentOptimizer3.optimize((int) (byte) 1, univariateFunction18, goalType19, (double) '#', (double) 1);
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
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker14);
        org.junit.Assert.assertNull(goalType15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getEvaluations();
        double double8 = brentOptimizer3.getMin();
        int int9 = brentOptimizer3.getEvaluations();
        double double10 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(goalType11);
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1L, (double) 1.0f);
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 1, (double) 1.0f);
        int int3 = brentOptimizer2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) ' ', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMax();
        double double5 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10, (double) 10L);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        double double4 = brentOptimizer2.getStartValue();
        double double5 = brentOptimizer2.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer2.optimize((int) (short) 100, univariateFunction7, goalType8, (double) 0L, (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
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
        double double12 = brentOptimizer3.getMax();
        double double13 = brentOptimizer3.getMax();
        java.lang.Class<?> wildcardClass14 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
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
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        int int5 = brentOptimizer3.getMaxEvaluations();
        int int6 = brentOptimizer3.getMaxEvaluations();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        int int9 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize(0, univariateFunction11, goalType12, 100.0d, (double) 'a', (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        double double4 = brentOptimizer2.getStartValue();
        double double5 = brentOptimizer2.getMax();
        int int6 = brentOptimizer2.getMaxEvaluations();
        double double7 = brentOptimizer2.getMax();
        double double8 = brentOptimizer2.getMax();
        int int9 = brentOptimizer2.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair10 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getMin();
        double double10 = brentOptimizer3.getMax();
        double double11 = brentOptimizer3.getMax();
        double double12 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType13 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(goalType13);
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) -1, (double) 10, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getMin();
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair12 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        double double5 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        double double6 = brentOptimizer3.getMax();
        double double7 = brentOptimizer3.getMin();
        double double8 = brentOptimizer3.getMin();
        java.lang.Class<?> wildcardClass9 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
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
        int int16 = brentOptimizer3.getMaxEvaluations();
        double double17 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction19 = null;
        org.apache.commons.math3.optimization.GoalType goalType20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair24 = brentOptimizer3.optimize((int) (byte) -1, univariateFunction19, goalType20, 0.0d, (double) 100.0f, (double) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
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
        java.lang.Class<?> wildcardClass12 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
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
        double double16 = brentOptimizer3.getStartValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer3.doOptimize();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1);
        double double3 = brentOptimizer2.getStartValue();
        int int4 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getStartValue();
        int int10 = brentOptimizer3.getMaxEvaluations();
        double double11 = brentOptimizer3.getMin();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
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
        double double15 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType16 = brentOptimizer3.getGoalType();
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
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(goalType16);
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) ' ', (double) (short) 10, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
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
        double double13 = brentOptimizer3.getMax();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer3.doOptimize();
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
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(goalType14);
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
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
        double double15 = brentOptimizer3.getMax();
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
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) '#', (double) (byte) 1);
        int int3 = brentOptimizer2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 1, (double) 1);
        double double3 = brentOptimizer2.getStartValue();
        int int4 = brentOptimizer2.getEvaluations();
        int int5 = brentOptimizer2.getMaxEvaluations();
        double double6 = brentOptimizer2.getStartValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        int int8 = brentOptimizer3.getEvaluations();
        double double9 = brentOptimizer3.getStartValue();
        int int10 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        double double12 = brentOptimizer3.getMax();
        int int13 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        double double8 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        int int10 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer3.optimize((int) ' ', univariateFunction13, goalType14, (double) (byte) 1, (double) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(goalType11);
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 0, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) '#', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass6 = brentOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
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
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction18 = null;
        org.apache.commons.math3.optimization.GoalType goalType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair22 = brentOptimizer3.optimize(10, univariateFunction18, goalType19, 1.0d, 100.0d);
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
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
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
        int int12 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
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
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction14 = null;
        org.apache.commons.math3.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair18 = brentOptimizer3.optimize((int) (byte) 0, univariateFunction14, goalType15, (double) (short) -1, (double) (short) 100);
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
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(goalType10);
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) -1, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
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
        java.lang.Class<?> wildcardClass13 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(1.0d, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        double double8 = brentOptimizer3.getMax();
        double double9 = brentOptimizer3.getStartValue();
        int int10 = brentOptimizer3.getEvaluations();
        double double11 = brentOptimizer3.getMin();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
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
        double double12 = brentOptimizer3.getStartValue();
        double double13 = brentOptimizer3.getMin();
        double double14 = brentOptimizer3.getMin();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 1, (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10, (double) 10L);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        double double4 = brentOptimizer2.getStartValue();
        double double5 = brentOptimizer2.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer2.getConvergenceChecker();
        double double7 = brentOptimizer2.getMax();
        int int8 = brentOptimizer2.getMaxEvaluations();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
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
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100.0f, (double) '4');
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 'a', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        double double5 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMin();
        int int8 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math3.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer3.optimize(100, univariateFunction10, goalType11, (double) 10L, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 1, (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair3 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
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
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair12 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
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
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 10, (double) (byte) 100);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        int int5 = brentOptimizer2.getEvaluations();
        int int6 = brentOptimizer2.getMaxEvaluations();
        double double7 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer2.getGoalType();
        int int9 = brentOptimizer2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getMax();
        int int10 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
        int int12 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker15 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction17 = null;
        org.apache.commons.math3.optimization.GoalType goalType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair22 = brentOptimizer3.optimize((int) ' ', univariateFunction17, goalType18, (double) 0L, (double) 100, 100.0d);
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
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker15);
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        double double10 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        int int5 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer2.getGoalType();
        double double7 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer2.getGoalType();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertNull(goalType9);
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 100, (double) 1L);
        double double3 = brentOptimizer2.getMax();
        double double4 = brentOptimizer2.getMin();
        double double5 = brentOptimizer2.getMax();
        double double6 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math3.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair13 = brentOptimizer2.optimize(0, univariateFunction8, goalType9, (double) '#', (double) 10L, 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100, (double) (short) -1, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) '4', (double) '#', univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getEvaluations();
        int int5 = brentOptimizer3.getEvaluations();
        double double6 = brentOptimizer3.getMax();
        double double7 = brentOptimizer3.getMax();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(1.0d, 10.0d);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        int int4 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer2.getGoalType();
        double double7 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer2.getGoalType();
        double double9 = brentOptimizer2.getStartValue();
        double double10 = brentOptimizer2.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 10, (double) 10.0f);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        int int4 = brentOptimizer2.getMaxEvaluations();
        int int5 = brentOptimizer2.getMaxEvaluations();
        int int6 = brentOptimizer2.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair7 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        int int6 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer2.getConvergenceChecker();
        double double9 = brentOptimizer2.getStartValue();
        int int10 = brentOptimizer2.getMaxEvaluations();
        int int11 = brentOptimizer2.getMaxEvaluations();
        double double12 = brentOptimizer2.getStartValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair13 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
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
        double double14 = brentOptimizer2.getMax();
        double double15 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction17 = null;
        org.apache.commons.math3.optimization.GoalType goalType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair22 = brentOptimizer2.optimize(0, univariateFunction17, goalType18, (double) (byte) 10, (double) (short) -1, 1.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        int int8 = brentOptimizer3.getEvaluations();
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
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
        double double12 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker13 = brentOptimizer3.getConvergenceChecker();
        double double14 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 'a', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getStartValue();
        int int8 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        double double11 = brentOptimizer3.getMax();
        java.lang.Class<?> wildcardClass12 = brentOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        double double5 = brentOptimizer3.getMin();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 0L, (double) (-1), univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) (byte) 1);
        int int3 = brentOptimizer2.getMaxEvaluations();
        double double4 = brentOptimizer2.getMin();
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
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        int int8 = brentOptimizer3.getMaxEvaluations();
        double double9 = brentOptimizer3.getMin();
        double double10 = brentOptimizer3.getMax();
        double double11 = brentOptimizer3.getMax();
        java.lang.Class<?> wildcardClass12 = brentOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        int int8 = brentOptimizer3.getEvaluations();
        double double9 = brentOptimizer3.getMax();
        double double10 = brentOptimizer3.getMax();
        double double11 = brentOptimizer3.getMax();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        double double5 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer2.getConvergenceChecker();
        double double8 = brentOptimizer2.getMin();
        double double9 = brentOptimizer2.getMax();
        double double10 = brentOptimizer2.getMax();
        int int11 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType13 = brentOptimizer2.getGoalType();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
        org.junit.Assert.assertNull(goalType13);
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
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
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction14 = null;
        org.apache.commons.math3.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair18 = brentOptimizer3.optimize((int) (short) -1, univariateFunction14, goalType15, (double) '4', (double) 1.0f);
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
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        int int9 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair15 = brentOptimizer3.optimize((int) 'a', univariateFunction11, goalType12, (double) (byte) -1, (double) 100L);
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
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMin();
        int int8 = brentOptimizer3.getEvaluations();
        double double9 = brentOptimizer3.getMin();
        double double10 = brentOptimizer3.getMin();
        java.lang.Class<?> wildcardClass11 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        double double10 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMin();
        int int8 = brentOptimizer3.getEvaluations();
        double double9 = brentOptimizer3.getStartValue();
        double double10 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer3.optimize((int) '#', univariateFunction13, goalType14, 100.0d, (double) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 10, (double) (short) 10);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = goalType4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math3.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair12 = brentOptimizer2.optimize(10, univariateFunction8, goalType9, (double) 0L, 1.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) (byte) 100, univariatePointValuePairConvergenceChecker2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair4 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
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
        double double12 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker13 = brentOptimizer3.getConvergenceChecker();
        int int14 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getEvaluations();
        double double8 = brentOptimizer3.getMin();
        int int9 = brentOptimizer3.getEvaluations();
        double double10 = brentOptimizer3.getMin();
        int int11 = brentOptimizer3.getEvaluations();
        int int12 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
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
        org.apache.commons.math3.optimization.GoalType goalType14 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType15 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType16 = brentOptimizer3.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = goalType16.getClass();
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(goalType14);
        org.junit.Assert.assertNull(goalType15);
        org.junit.Assert.assertNull(goalType16);
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 0, (double) 0L, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertNull(goalType11);
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100.0f, (double) 1, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        double double5 = brentOptimizer3.getMin();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10, (double) 10.0f, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMax();
        double double5 = brentOptimizer3.getMin();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
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
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction14 = null;
        org.apache.commons.math3.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair18 = brentOptimizer2.optimize((int) (byte) 10, univariateFunction14, goalType15, (double) (byte) 10, 0.0d);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        double double6 = brentOptimizer3.getMin();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        int int9 = brentOptimizer3.getMaxEvaluations();
        int int10 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, (double) (short) 10);
        double double3 = brentOptimizer2.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math3.optimization.GoalType goalType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair9 = brentOptimizer2.optimize(100, univariateFunction5, goalType6, (double) (-1.0f), (double) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) ' ', 1.0d);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        double double5 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer2.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
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
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        double double6 = brentOptimizer3.getStartValue();
        double double7 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        int int9 = brentOptimizer3.getMaxEvaluations();
        int int10 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) ' ', 1.0d);
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction4 = null;
        org.apache.commons.math3.optimization.GoalType goalType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair9 = brentOptimizer2.optimize(100, univariateFunction4, goalType5, (double) 0.0f, (double) (-1.0f), (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getMaxEvaluations();
        int int8 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(goalType14);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = goalType13.getClass();
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
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(goalType13);
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 1, (double) 100L);
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction4 = null;
        org.apache.commons.math3.optimization.GoalType goalType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair8 = brentOptimizer2.optimize((int) '#', univariateFunction4, goalType5, (-1.0d), 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
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
        double double14 = brentOptimizer3.getStartValue();
        int int15 = brentOptimizer3.getEvaluations();
        int int16 = brentOptimizer3.getMaxEvaluations();
        int int17 = brentOptimizer3.getEvaluations();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMin();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 100, (double) 10.0f, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
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
        int int12 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker13 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker13);
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) (byte) 100);
        double double3 = brentOptimizer2.getMin();
        double double4 = brentOptimizer2.getMin();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
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
        int int12 = brentOptimizer3.getEvaluations();
        int int13 = brentOptimizer3.getMaxEvaluations();
        double double14 = brentOptimizer3.getMin();
        double double15 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker16 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker16);
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        int int4 = brentOptimizer2.getEvaluations();
        int int5 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer2.getGoalType();
        double double8 = brentOptimizer2.getStartValue();
        double double9 = brentOptimizer2.getMin();
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        int int6 = brentOptimizer3.getEvaluations();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        double double10 = brentOptimizer3.getMin();
        double double11 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
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
        double double12 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker13 = brentOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass14 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, (double) (byte) 10);
        int int3 = brentOptimizer2.getMaxEvaluations();
        double double4 = brentOptimizer2.getMin();
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
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 1, (double) (short) 1);
        double double3 = brentOptimizer2.getMin();
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
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        double double5 = brentOptimizer2.getMin();
        int int6 = brentOptimizer2.getMaxEvaluations();
        int int7 = brentOptimizer2.getMaxEvaluations();
        int int8 = brentOptimizer2.getMaxEvaluations();
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
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
        double double16 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType17 = brentOptimizer3.getGoalType();
        int int18 = brentOptimizer3.getMaxEvaluations();
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(goalType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        double double8 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
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
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1.0f, (double) (short) 10);
        int int3 = brentOptimizer2.getMaxEvaluations();
        int int4 = brentOptimizer2.getEvaluations();
        double double5 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer2.getConvergenceChecker();
        double double7 = brentOptimizer2.getMin();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100.0f, (double) 10L);
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction4 = null;
        org.apache.commons.math3.optimization.GoalType goalType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair9 = brentOptimizer2.optimize((int) (short) 100, univariateFunction4, goalType5, (double) (byte) -1, (double) 10, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMin();
        int int8 = brentOptimizer3.getEvaluations();
        double double9 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        double double11 = brentOptimizer3.getMax();
        int int12 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5361");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1.0f, (double) (short) 1);
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
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
        int int12 = brentOptimizer3.getEvaluations();
        int int13 = brentOptimizer3.getMaxEvaluations();
        double double14 = brentOptimizer3.getMin();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair15 = brentOptimizer3.doOptimize();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5363");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        double double6 = brentOptimizer3.getMax();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getStartValue();
        int int9 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair15 = brentOptimizer3.optimize((int) (byte) 1, univariateFunction11, goalType12, (double) 0.0f, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5364");
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
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair24 = brentOptimizer3.optimize((int) (short) 10, univariateFunction19, goalType20, (double) (byte) 1, (double) (byte) -1, (double) (short) 1);
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
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5365");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMin();
        int int10 = brentOptimizer3.getEvaluations();
        double double11 = brentOptimizer3.getMin();
        double double12 = brentOptimizer3.getMin();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
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
        double double20 = brentOptimizer3.getMax();
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
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5367");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10.0f, (double) 10);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        double double5 = brentOptimizer2.getMin();
        int int6 = brentOptimizer2.getMaxEvaluations();
        int int7 = brentOptimizer2.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair8 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5368");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        int int9 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        double double11 = brentOptimizer3.getMax();
        int int12 = brentOptimizer3.getMaxEvaluations();
        double double13 = brentOptimizer3.getMax();
        int int14 = brentOptimizer3.getMaxEvaluations();
        double double15 = brentOptimizer3.getMin();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5369");
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
        double double12 = brentOptimizer3.getMin();
        int int13 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5370");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) -1, (double) 0.0f, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, (double) (byte) 1);
        int int3 = brentOptimizer2.getEvaluations();
        double double4 = brentOptimizer2.getMax();
        int int5 = brentOptimizer2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5372");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (-1.0f), (double) '4', univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5373");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMax();
        double double10 = brentOptimizer3.getStartValue();
        double double11 = brentOptimizer3.getMax();
        double double12 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        double double5 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer2.getConvergenceChecker();
        double double9 = brentOptimizer2.getMin();
        int int10 = brentOptimizer2.getEvaluations();
        java.lang.Class<?> wildcardClass11 = brentOptimizer2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5375");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        int int5 = brentOptimizer3.getEvaluations();
        int int6 = brentOptimizer3.getMaxEvaluations();
        double double7 = brentOptimizer3.getMin();
        double double8 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        int int11 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5376");
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
        org.apache.commons.math3.optimization.GoalType goalType12 = brentOptimizer3.getGoalType();
        double double13 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) ' ', (double) (short) 10, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMax();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5378");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) '#', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        int int6 = brentOptimizer3.getEvaluations();
        int int7 = brentOptimizer3.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair8 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5379");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) '4', (double) 10, univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getMaxEvaluations();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMax();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) ' ', (double) 100.0f, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMax();
        int int5 = brentOptimizer3.getMaxEvaluations();
        int int6 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5381");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        int int6 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer2.getConvergenceChecker();
        double double9 = brentOptimizer2.getStartValue();
        int int10 = brentOptimizer2.getMaxEvaluations();
        int int11 = brentOptimizer2.getMaxEvaluations();
        double double12 = brentOptimizer2.getStartValue();
        java.lang.Class<?> wildcardClass13 = brentOptimizer2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5382");
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
        double double16 = brentOptimizer3.getMin();
        int int17 = brentOptimizer3.getEvaluations();
        java.lang.Class<?> wildcardClass18 = brentOptimizer3.getClass();
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5383");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, (double) 100);
        int int3 = brentOptimizer2.getMaxEvaluations();
        int int4 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5384");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getMin();
        int int6 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer2.getGoalType();
        int int8 = brentOptimizer2.getMaxEvaluations();
        int int9 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer2.getConvergenceChecker();
        double double11 = brentOptimizer2.getMax();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        int int9 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        double double11 = brentOptimizer3.getMax();
        int int12 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker13 = brentOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass14 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5386");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1L, (double) (short) -1, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5387");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 10.0f);
        double double3 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        double double6 = brentOptimizer2.getStartValue();
        double double7 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer2.getGoalType();
        double double9 = brentOptimizer2.getStartValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5388");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        double double5 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 0.0f, (double) (-1L), univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5390");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) '#', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getEvaluations();
        double double8 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        double double10 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize((int) (byte) 0, univariateFunction12, goalType13, (double) ' ', (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
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
        double double15 = brentOptimizer3.getStartValue();
        int int16 = brentOptimizer3.getMaxEvaluations();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5392");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMin();
        double double6 = brentOptimizer3.getMin();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        int int9 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize((int) (short) 10, univariateFunction11, goalType12, (double) 1, (double) (short) 100, (double) (-1));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5393");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 10.0f);
        double double3 = brentOptimizer2.getStartValue();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getStartValue();
        double double6 = brentOptimizer2.getMax();
        java.lang.Class<?> wildcardClass7 = brentOptimizer2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5394");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        double double8 = brentOptimizer3.getMax();
        int int9 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5395");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getEvaluations();
        int int8 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        double double10 = brentOptimizer3.getStartValue();
        double double11 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5396");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 1, (double) 1, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMax();
        int int6 = brentOptimizer3.getEvaluations();
        double double7 = brentOptimizer3.getStartValue();
        double double8 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        double double10 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker11 = brentOptimizer3.getConvergenceChecker();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
    }

    @Test
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5398");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10L, (double) (short) 10);
        int int3 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5399");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 0, (double) '4', univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        int int6 = brentOptimizer3.getEvaluations();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMin();
        double double10 = brentOptimizer3.getMin();
        double double11 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5401");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1.0f, (double) 100);
        double double3 = brentOptimizer2.getMin();
        int int4 = brentOptimizer2.getMaxEvaluations();
        int int5 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction8 = null;
        org.apache.commons.math3.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair12 = brentOptimizer2.optimize((int) (byte) 10, univariateFunction8, goalType9, (double) 10, (double) 1L);
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
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 'a', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getStartValue();
        int int8 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction10 = null;
        org.apache.commons.math3.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair14 = brentOptimizer3.optimize((int) (byte) 0, univariateFunction10, goalType11, (double) 1L, (double) 1L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5403");
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5404");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        int int8 = brentOptimizer3.getEvaluations();
        double double9 = brentOptimizer3.getStartValue();
        int int10 = brentOptimizer3.getMaxEvaluations();
        double double11 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5405");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 'a', univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getEvaluations();
        double double5 = brentOptimizer3.getMax();
        double double6 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5406");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        int int6 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        double double11 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5407");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 10, (double) 'a', univariatePointValuePairConvergenceChecker2);
        java.lang.Class<?> wildcardClass4 = brentOptimizer3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 10, (double) 'a');
        int int3 = brentOptimizer2.getMaxEvaluations();
        double double4 = brentOptimizer2.getMin();
        int int5 = brentOptimizer2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5409");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        int int9 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        double double11 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer3.getConvergenceChecker();
        int int13 = brentOptimizer3.getEvaluations();
        double double14 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
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
        double double13 = brentOptimizer3.getStartValue();
        double double14 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5411");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) '4', (double) 10, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMax();
        double double5 = brentOptimizer3.getStartValue();
        int int6 = brentOptimizer3.getMaxEvaluations();
        int int7 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5412");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        double double7 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        double double9 = brentOptimizer3.getStartValue();
        double double10 = brentOptimizer3.getMax();
        double double11 = brentOptimizer3.getStartValue();
        double double12 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction14 = null;
        org.apache.commons.math3.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair18 = brentOptimizer3.optimize((int) (short) 0, univariateFunction14, goalType15, (double) (short) -1, (double) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5413");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, 1.0d);
        int int3 = brentOptimizer2.getMaxEvaluations();
        double double4 = brentOptimizer2.getMin();
        double double5 = brentOptimizer2.getStartValue();
        int int6 = brentOptimizer2.getEvaluations();
        double double7 = brentOptimizer2.getMax();
        java.lang.Class<?> wildcardClass8 = brentOptimizer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5414");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        int int6 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType11 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction14 = null;
        org.apache.commons.math3.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair19 = brentOptimizer3.optimize((int) (short) 100, univariateFunction14, goalType15, (double) 1L, (double) (short) 0, (double) (short) 100);
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
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5415");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        int int9 = brentOptimizer3.getMaxEvaluations();
        double double10 = brentOptimizer3.getMax();
        double double11 = brentOptimizer3.getMax();
        double double12 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5416");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getMin();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer2.getGoalType();
        double double7 = brentOptimizer2.getMax();
        double double8 = brentOptimizer2.getStartValue();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
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
        double double14 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType15 = brentOptimizer3.getGoalType();
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
        org.junit.Assert.assertNull(goalType15);
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5418");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 100, (double) (byte) 1, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMax();
        double double5 = brentOptimizer3.getMin();
        double double6 = brentOptimizer3.getMax();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5419");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer2.getGoalType();
        int int6 = brentOptimizer2.getEvaluations();
        double double7 = brentOptimizer2.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction9 = null;
        org.apache.commons.math3.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair13 = brentOptimizer2.optimize((int) (short) 100, univariateFunction9, goalType10, 0.0d, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5420");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair15 = brentOptimizer3.optimize((int) ' ', univariateFunction11, goalType12, 0.0d, (double) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
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
        int int12 = brentOptimizer3.getMaxEvaluations();
        double double13 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5422");
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
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.optimize(1, univariateFunction12, goalType13, (double) (-1.0f), (double) 1);
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
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5423");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        double double8 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        double double10 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5424");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1.0f, (double) 'a');
        int int3 = brentOptimizer2.getEvaluations();
        double double4 = brentOptimizer2.getMax();
        java.lang.Class<?> wildcardClass5 = brentOptimizer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5425");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1L, (double) 100.0f);
        double double3 = brentOptimizer2.getStartValue();
        double double4 = brentOptimizer2.getMin();
        int int5 = brentOptimizer2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5426");
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
        int int12 = brentOptimizer3.getMaxEvaluations();
        double double13 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5427");
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
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction19 = null;
        org.apache.commons.math3.optimization.GoalType goalType20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair24 = brentOptimizer3.optimize(0, univariateFunction19, goalType20, (double) 1L, (double) (byte) 0, (double) 0.0f);
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
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5428");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        int int6 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer2.getConvergenceChecker();
        double double8 = brentOptimizer2.getMax();
        int int9 = brentOptimizer2.getMaxEvaluations();
        int int10 = brentOptimizer2.getEvaluations();
        java.lang.Class<?> wildcardClass11 = brentOptimizer2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5429");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, 1.0d);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer2.getGoalType();
        double double5 = brentOptimizer2.getMin();
        int int6 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction12 = null;
        org.apache.commons.math3.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer2.optimize((int) (byte) 10, univariateFunction12, goalType13, (double) 100, (double) 'a', (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5430");
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
        int int12 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5431");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        double double7 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        double double9 = brentOptimizer3.getMin();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction11 = null;
        org.apache.commons.math3.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair15 = brentOptimizer3.optimize((int) (short) 0, univariateFunction11, goalType12, (double) '4', 0.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5432");
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
        int int12 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5433");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, 1.0d);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        int int4 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        double double6 = brentOptimizer2.getStartValue();
        double double7 = brentOptimizer2.getMin();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5434");
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
        int int14 = brentOptimizer3.getEvaluations();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5435");
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
        java.lang.Class<?> wildcardClass13 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5436");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, 1.0d);
        int int3 = brentOptimizer2.getMaxEvaluations();
        double double4 = brentOptimizer2.getStartValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5437");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 100, 10.0d);
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5438");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100.0f, (double) 1, univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
    }

    @Test
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5439");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 10, (double) (byte) 100);
        double double3 = brentOptimizer2.getStartValue();
        double double4 = brentOptimizer2.getMax();
        int int5 = brentOptimizer2.getMaxEvaluations();
        double double6 = brentOptimizer2.getStartValue();
        double double7 = brentOptimizer2.getMax();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5440");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10.0f, (double) '#');
        double double3 = brentOptimizer2.getMin();
        int int4 = brentOptimizer2.getEvaluations();
        double double5 = brentOptimizer2.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction7 = null;
        org.apache.commons.math3.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair11 = brentOptimizer2.optimize(0, univariateFunction7, goalType8, (double) (byte) 1, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5441");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) 0, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5442");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 0, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: 0 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5443");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) ' ', (double) (byte) 10);
        int int3 = brentOptimizer2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5444");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 100, (double) (byte) 100);
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction4 = null;
        org.apache.commons.math3.optimization.GoalType goalType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair9 = brentOptimizer2.optimize(0, univariateFunction4, goalType5, (double) 10.0f, 0.0d, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5445");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) '#', (double) '#');
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction4 = null;
        org.apache.commons.math3.optimization.GoalType goalType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair9 = brentOptimizer2.optimize((int) 'a', univariateFunction4, goalType5, (double) 1L, (double) 10L, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5446");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getEvaluations();
        double double8 = brentOptimizer3.getMax();
        int int9 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5447");
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
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction20 = null;
        org.apache.commons.math3.optimization.GoalType goalType21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair24 = brentOptimizer3.optimize((int) (byte) 1, univariateFunction20, goalType21, (double) 10L, (-1.0d));
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
        org.junit.Assert.assertNull(goalType15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(goalType17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5448");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) '#', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getEvaluations();
        double double8 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        java.lang.Class<?> wildcardClass11 = brentOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5449");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 10.0f);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        int int4 = brentOptimizer2.getMaxEvaluations();
        double double5 = brentOptimizer2.getMin();
        double double6 = brentOptimizer2.getStartValue();
        int int7 = brentOptimizer2.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair8 = brentOptimizer2.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5450");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (short) 10, (double) 1.0f, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        int int5 = brentOptimizer3.getEvaluations();
        int int6 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5451");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        int int8 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        double double10 = brentOptimizer3.getMin();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5452");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) ' ', (double) (byte) 1, univariatePointValuePairConvergenceChecker2);
        int int4 = brentOptimizer3.getMaxEvaluations();
        int int5 = brentOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5453");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((-1.0d), (double) (-1L), univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5454");
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
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5455");
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
        double double16 = brentOptimizer3.getMax();
        int int17 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction19 = null;
        org.apache.commons.math3.optimization.GoalType goalType20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair23 = brentOptimizer3.optimize((int) (short) 100, univariateFunction19, goalType20, 100.0d, (double) 10.0f);
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5456");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair13 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5457");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 10, (double) (byte) 100);
        double double3 = brentOptimizer2.getStartValue();
        double double4 = brentOptimizer2.getMax();
        int int5 = brentOptimizer2.getMaxEvaluations();
        double double6 = brentOptimizer2.getStartValue();
        double double7 = brentOptimizer2.getMin();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5458");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker12 = brentOptimizer3.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker12);
    }

    @Test
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5459");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        double double5 = brentOptimizer3.getMin();
        int int6 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        int int8 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType9 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
    }

    @Test
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5460");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        int int6 = brentOptimizer3.getEvaluations();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        double double11 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5461");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getEvaluations();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMin();
        double double10 = brentOptimizer3.getStartValue();
        double double11 = brentOptimizer3.getMax();
        int int12 = brentOptimizer3.getEvaluations();
        double double13 = brentOptimizer3.getMax();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5462");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getMax();
        int int8 = brentOptimizer3.getEvaluations();
        double double9 = brentOptimizer3.getMax();
        double double10 = brentOptimizer3.getMin();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5463");
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
        double double12 = brentOptimizer3.getStartValue();
        double double13 = brentOptimizer3.getMin();
        java.lang.Class<?> wildcardClass14 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5464");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(10.0d, 1.0d);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        int int4 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker5 = brentOptimizer2.getConvergenceChecker();
        int int6 = brentOptimizer2.getMaxEvaluations();
        int int7 = brentOptimizer2.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer2.getConvergenceChecker();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5465");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10, (double) 10L);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        java.lang.Class<?> wildcardClass5 = brentOptimizer2.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5466");
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
        int int13 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType14 = brentOptimizer3.getGoalType();
        double double15 = brentOptimizer3.getMax();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair16 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
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
        org.junit.Assert.assertNull(goalType14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5467");
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
        int int13 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker14 = brentOptimizer3.getConvergenceChecker();
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
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5468");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100, (double) 'a', univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.GoalType goalType4 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5469");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(100.0d, (double) ' ', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMax();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType7 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker8 = brentOptimizer3.getConvergenceChecker();
        int int9 = brentOptimizer3.getMaxEvaluations();
        double double10 = brentOptimizer3.getMin();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5470");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 1);
        double double3 = brentOptimizer2.getMin();
        int int4 = brentOptimizer2.getEvaluations();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5471");
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
        double double15 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType16 = brentOptimizer3.getGoalType();
        double double17 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.GoalType goalType18 = brentOptimizer3.getGoalType();
        double double19 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType20 = brentOptimizer3.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = goalType20.getClass();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNull(goalType16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNull(goalType18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNull(goalType20);
    }

    @Test
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5472");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        int int9 = brentOptimizer3.getEvaluations();
        double double10 = brentOptimizer3.getMax();
        double double11 = brentOptimizer3.getStartValue();
        int int12 = brentOptimizer3.getEvaluations();
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
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5473");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((-1.0d), (double) (short) 0, univariatePointValuePairConvergenceChecker2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NumberIsTooSmallException; message: -1 is smaller than the minimum (0)");
        } catch (org.apache.commons.math3.exception.NumberIsTooSmallException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5474");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        double double5 = brentOptimizer3.getMin();
        int int6 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker7 = brentOptimizer3.getConvergenceChecker();
        double double8 = brentOptimizer3.getMax();
        java.lang.Class<?> wildcardClass9 = brentOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5475");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 1, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math3.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5476");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) (byte) 1, (double) 1, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getMax();
        int int6 = brentOptimizer3.getEvaluations();
        double double7 = brentOptimizer3.getStartValue();
        double double8 = brentOptimizer3.getStartValue();
        int int9 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
    }

    @Test
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5477");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 'a', (double) 100L);
        double double3 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer2.getConvergenceChecker();
        int int5 = brentOptimizer2.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer2.getGoalType();
        int int7 = brentOptimizer2.getEvaluations();
        int int8 = brentOptimizer2.getMaxEvaluations();
        java.lang.Class<?> wildcardClass9 = brentOptimizer2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5478");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        double double6 = brentOptimizer3.getMin();
        double double7 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType8 = brentOptimizer3.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        double double10 = brentOptimizer3.getMax();
        java.lang.Class<?> wildcardClass11 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5479");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker15 = brentOptimizer3.getConvergenceChecker();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test5480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5480");
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
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction14 = null;
        org.apache.commons.math3.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair19 = brentOptimizer3.optimize((int) (byte) 100, univariateFunction14, goalType15, (double) '#', (double) '#', (double) 100);
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
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertNull(goalType12);
    }

    @Test
    public void test5481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5481");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        double double7 = brentOptimizer3.getStartValue();
        double double8 = brentOptimizer3.getMax();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        double double10 = brentOptimizer3.getStartValue();
        int int11 = brentOptimizer3.getMaxEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer3.optimize((int) (byte) 0, univariateFunction13, goalType14, (double) (-1.0f), (-1.0d));
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5482");
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
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair17 = brentOptimizer3.optimize((int) (byte) 1, univariateFunction13, goalType14, (double) (byte) 10, (double) (short) 10);
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5483");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker6 = brentOptimizer3.getConvergenceChecker();
        int int7 = brentOptimizer3.getEvaluations();
        double double8 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker9 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType10 = brentOptimizer3.getGoalType();
        int int11 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction13 = null;
        org.apache.commons.math3.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair18 = brentOptimizer3.optimize((int) (short) 0, univariateFunction13, goalType14, (double) 10, (double) 0.0f, (double) '4');
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5484");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10L, 1.0d, univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMin();
        org.apache.commons.math3.optimization.GoalType goalType5 = brentOptimizer3.getGoalType();
        double double6 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5485");
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
        double double12 = brentOptimizer3.getMax();
        double double13 = brentOptimizer3.getMax();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction15 = null;
        org.apache.commons.math3.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair20 = brentOptimizer3.optimize((int) '4', univariateFunction15, goalType16, (double) (-1.0f), (double) 'a', (double) ' ');
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5486");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 10L, (double) '4', univariatePointValuePairConvergenceChecker2);
        double double4 = brentOptimizer3.getMax();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5487");
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
        java.lang.Class<?> wildcardClass13 = brentOptimizer3.getClass();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker9);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5488");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair13 = brentOptimizer3.doOptimize();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.TooManyEvaluationsException; message: illegal state: maximal count (0) exceeded: evaluations");
        } catch (org.apache.commons.math3.exception.TooManyEvaluationsException e) {
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
    public void test5489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5489");
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
        double double13 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5490");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        double double7 = brentOptimizer3.getMax();
        double double8 = brentOptimizer3.getMin();
        double double9 = brentOptimizer3.getMin();
        int int10 = brentOptimizer3.getEvaluations();
        double double11 = brentOptimizer3.getStartValue();
        double double12 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction14 = null;
        org.apache.commons.math3.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair18 = brentOptimizer3.optimize((int) '#', univariateFunction14, goalType15, (double) 100L, (double) (short) 100);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5491");
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
        org.apache.commons.math3.optimization.GoalType goalType13 = brentOptimizer3.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(goalType13);
    }

    @Test
    public void test5492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5492");
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
        int int15 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction17 = null;
        org.apache.commons.math3.optimization.GoalType goalType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair21 = brentOptimizer3.optimize((int) '4', univariateFunction17, goalType18, (double) 'a', (double) (-1.0f));
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5493");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        int int5 = brentOptimizer3.getMaxEvaluations();
        double double6 = brentOptimizer3.getStartValue();
        int int7 = brentOptimizer3.getMaxEvaluations();
        double double8 = brentOptimizer3.getMin();
        int int9 = brentOptimizer3.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker10 = brentOptimizer3.getConvergenceChecker();
        double double11 = brentOptimizer3.getMax();
        double double12 = brentOptimizer3.getMin();
        int int13 = brentOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5494");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100.0f, (double) 1L);
    }

    @Test
    public void test5495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5495");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker15 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker16 = brentOptimizer3.getConvergenceChecker();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction18 = null;
        org.apache.commons.math3.optimization.GoalType goalType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair22 = brentOptimizer3.optimize((int) '4', univariateFunction18, goalType19, (double) 100.0f, 0.0d);
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker15);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker16);
    }

    @Test
    public void test5496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5496");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer(1.0d, 10.0d);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker3 = brentOptimizer2.getConvergenceChecker();
        int int4 = brentOptimizer2.getEvaluations();
        double double5 = brentOptimizer2.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer2.getGoalType();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test5497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5497");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        int int6 = brentOptimizer3.getEvaluations();
        double double7 = brentOptimizer3.getMax();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5498");
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker2 = null;
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer3 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) 100L, (double) 100L, univariatePointValuePairConvergenceChecker2);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair> univariatePointValuePairConvergenceChecker4 = brentOptimizer3.getConvergenceChecker();
        double double5 = brentOptimizer3.getStartValue();
        org.apache.commons.math3.optimization.GoalType goalType6 = brentOptimizer3.getGoalType();
        int int7 = brentOptimizer3.getEvaluations();
        double double8 = brentOptimizer3.getStartValue();
        double double9 = brentOptimizer3.getStartValue();
        double double10 = brentOptimizer3.getStartValue();
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5499");
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker10);
        org.junit.Assert.assertNull(univariatePointValuePairConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5500");
        org.apache.commons.math3.optimization.univariate.BrentOptimizer brentOptimizer2 = new org.apache.commons.math3.optimization.univariate.BrentOptimizer((double) ' ', 1.0d);
        org.apache.commons.math3.optimization.GoalType goalType3 = brentOptimizer2.getGoalType();
        org.apache.commons.math3.analysis.UnivariateFunction univariateFunction5 = null;
        org.apache.commons.math3.optimization.GoalType goalType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair univariatePointValuePair9 = brentOptimizer2.optimize((int) '4', univariateFunction5, goalType6, 10.0d, 100.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.NullArgumentException; message: null is not allowed");
        } catch (org.apache.commons.math3.exception.NullArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(goalType3);
    }
}

