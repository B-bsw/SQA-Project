package org.apache.commons.math.optimization.univariate;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((-1));
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double9 = brentOptimizer0.getAbsoluteAccuracy();
        double double10 = brentOptimizer0.getFunctionValue();
        int int11 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        int int6 = brentOptimizer0.getMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = brentOptimizer0.optimize(univariateRealFunction8, goalType9, 97.0d, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) (-1.0f));
        brentOptimizer0.setRelativeAccuracy((double) 10.0f);
        int int12 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        double double6 = brentOptimizer0.getAbsoluteAccuracy();
        int int7 = brentOptimizer0.getMaxEvaluations();
        int int8 = brentOptimizer0.getMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = brentOptimizer0.optimize(univariateRealFunction9, goalType10, 10.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-10d + "'", double6 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setAbsoluteAccuracy((double) 0.0f);
        double double8 = brentOptimizer0.getMax();
        brentOptimizer0.setMaximalIterationCount(100);
        brentOptimizer0.resetAbsoluteAccuracy();
        double double12 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations(0);
        brentOptimizer0.setMaxEvaluations(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        int int7 = brentOptimizer0.getMaxEvaluations();
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount(10);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = brentOptimizer0.getResult();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math.exception.NoDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int7 = brentOptimizer0.getIterationCount();
        int int8 = brentOptimizer0.getIterationCount();
        int int9 = brentOptimizer0.getMaxEvaluations();
        double double10 = brentOptimizer0.getStartValue();
        double double11 = brentOptimizer0.getFunctionValue();
        double double12 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        int int6 = brentOptimizer0.getEvaluations();
        double double7 = brentOptimizer0.getMin();
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (short) 0);
        brentOptimizer0.resetMaximalIterationCount();
        double double12 = brentOptimizer0.getFunctionValue();
        int int13 = brentOptimizer0.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        int int6 = brentOptimizer0.getMaximalIterationCount();
        double double7 = brentOptimizer0.getMin();
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetMaximalIterationCount();
        double double11 = brentOptimizer0.getStartValue();
        double double12 = brentOptimizer0.getRelativeAccuracy();
        int int13 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double15 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setRelativeAccuracy((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getFunctionValue();
        double double6 = brentOptimizer0.getMin();
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        int int8 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy(2.147483647E9d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = brentOptimizer0.getResult();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math.exception.NoDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount(2147483647);
        brentOptimizer0.setAbsoluteAccuracy(1.0d);
        brentOptimizer0.resetAbsoluteAccuracy();
        org.apache.commons.math.optimization.GoalType goalType8 = brentOptimizer0.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        brentOptimizer0.setRelativeAccuracy((double) 10);
        brentOptimizer0.setRelativeAccuracy((double) 10L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(goalType9);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getMaxEvaluations();
        double double7 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setMaximalIterationCount((int) (short) 0);
        double double10 = brentOptimizer0.getMax();
        int int11 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (short) 0);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) '4');
        double double14 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(10);
        int int6 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setAbsoluteAccuracy((double) (byte) -1);
        double double9 = brentOptimizer0.getFunctionValue();
        double double10 = brentOptimizer0.getStartValue();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction11 = null;
        org.apache.commons.math.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentOptimizer0.optimize(univariateRealFunction11, goalType12, 32.0d, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getMaxEvaluations();
        double double7 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setMaximalIterationCount((int) (short) 0);
        double double10 = brentOptimizer0.getStartValue();
        double double11 = brentOptimizer0.getAbsoluteAccuracy();
        double double12 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-10d + "'", double11 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) ' ');
        int int10 = brentOptimizer0.getIterationCount();
        org.apache.commons.math.optimization.GoalType goalType11 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaxEvaluations(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(goalType11);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setAbsoluteAccuracy((double) 0.0f);
        brentOptimizer0.resetRelativeAccuracy();
        double double9 = brentOptimizer0.getMax();
        double double10 = brentOptimizer0.getMin();
        double double11 = brentOptimizer0.getMin();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int13 = brentOptimizer0.getIterationCount();
        org.apache.commons.math.optimization.GoalType goalType14 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(goalType14);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        double double2 = brentOptimizer0.getStartValue();
        org.apache.commons.math.optimization.GoalType goalType3 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(goalType3);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        double double6 = brentOptimizer0.getMax();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        brentOptimizer0.resetAbsoluteAccuracy();
        double double11 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((int) 'a');
        double double8 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = brentOptimizer0.getGoalType();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        double double6 = brentOptimizer0.getStartValue();
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((-1));
        double double7 = brentOptimizer0.getMin();
        double double8 = brentOptimizer0.getStartValue();
        int int9 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetRelativeAccuracy();
        double double7 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy(52.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) (short) 100);
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        double double11 = brentOptimizer0.getMax();
        double double12 = brentOptimizer0.getStartValue();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double15 = brentOptimizer0.getMax();
        double double16 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        double double4 = brentOptimizer0.getStartValue();
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType6 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        int int8 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(10);
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 100);
        brentOptimizer0.setMaximalIterationCount((int) (byte) -1);
        int int12 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (short) 1);
        double double15 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        double double6 = brentOptimizer0.getMax();
        brentOptimizer0.setMaxEvaluations((int) '4');
        int int9 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        int int7 = brentOptimizer0.getEvaluations();
        int int8 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setRelativeAccuracy(0.0d);
        org.apache.commons.math.optimization.GoalType goalType11 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetMaximalIterationCount();
        double double13 = brentOptimizer0.getRelativeAccuracy();
        int int14 = brentOptimizer0.getMaximalIterationCount();
        double double15 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction16 = null;
        org.apache.commons.math.optimization.GoalType goalType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double21 = brentOptimizer0.optimize(univariateRealFunction16, goalType17, (double) ' ', 10.0d, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double10 = brentOptimizer0.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getMaxEvaluations();
        double double7 = brentOptimizer0.getMin();
        double double8 = brentOptimizer0.getMax();
        double double9 = brentOptimizer0.getStartValue();
        brentOptimizer0.setMaximalIterationCount((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = brentOptimizer0.getGoalType();
        int int5 = brentOptimizer0.getEvaluations();
        double double6 = brentOptimizer0.getMax();
        double double7 = brentOptimizer0.getMin();
        double double8 = brentOptimizer0.getMin();
        double double9 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 10.0f);
        double double12 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-10d + "'", double9 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        int int7 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType8 = brentOptimizer0.getGoalType();
        int int9 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) 1);
        double double12 = brentOptimizer0.getMax();
        double double13 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        int int7 = brentOptimizer0.getEvaluations();
        int int8 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setRelativeAccuracy(0.0d);
        org.apache.commons.math.optimization.GoalType goalType11 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType11);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setAbsoluteAccuracy(1.0E-14d);
        double double10 = brentOptimizer0.getRelativeAccuracy();
        int int11 = brentOptimizer0.getIterationCount();
        double double12 = brentOptimizer0.getAbsoluteAccuracy();
        double double13 = brentOptimizer0.getStartValue();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 1);
        brentOptimizer0.setAbsoluteAccuracy((double) '#');
        double double11 = brentOptimizer0.getMax();
        brentOptimizer0.setRelativeAccuracy((double) 0);
        brentOptimizer0.setAbsoluteAccuracy((double) (-1.0f));
        double double16 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '#');
        brentOptimizer0.setMaximalIterationCount(1);
        brentOptimizer0.setRelativeAccuracy((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaxEvaluations(0);
        double double9 = brentOptimizer0.getStartValue();
        int int10 = brentOptimizer0.getEvaluations();
        double double11 = brentOptimizer0.getMin();
        java.lang.Class<?> wildcardClass12 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        int int6 = brentOptimizer0.getMaximalIterationCount();
        double double7 = brentOptimizer0.getMin();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) (-1.0f));
        brentOptimizer0.setMaxEvaluations((int) 'a');
        brentOptimizer0.setMaxEvaluations(52);
        double double15 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int7 = brentOptimizer0.getIterationCount();
        int int8 = brentOptimizer0.getMaxEvaluations();
        int int9 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setAbsoluteAccuracy(0.0d);
        int int12 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations(0);
        brentOptimizer0.resetRelativeAccuracy();
        double double16 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (short) 0);
        double double11 = brentOptimizer0.getMax();
        int int12 = brentOptimizer0.getEvaluations();
        int int13 = brentOptimizer0.getEvaluations();
        double double14 = brentOptimizer0.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentOptimizer0.getResult();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math.exception.NoDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-10d + "'", double14 == 1.0E-10d);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((int) 'a');
        double double8 = brentOptimizer0.getFunctionValue();
        double double9 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType11 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType11);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        double double10 = brentOptimizer0.getStartValue();
        brentOptimizer0.setMaximalIterationCount((int) (short) 10);
        int int13 = brentOptimizer0.getIterationCount();
        double double14 = brentOptimizer0.getStartValue();
        double double15 = brentOptimizer0.getMax();
        double double16 = brentOptimizer0.getMin();
        brentOptimizer0.setRelativeAccuracy(1.0d);
        double double19 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = brentOptimizer0.getResult();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math.exception.NoDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy((double) (-1L));
        double double9 = brentOptimizer0.getRelativeAccuracy();
        double double10 = brentOptimizer0.getStartValue();
        int int11 = brentOptimizer0.getIterationCount();
        int int12 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        double double17 = brentOptimizer0.getMin();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setAbsoluteAccuracy((double) 0.0f);
        double double8 = brentOptimizer0.getMax();
        brentOptimizer0.setMaximalIterationCount(100);
        brentOptimizer0.setRelativeAccuracy((-1.0d));
        double double13 = brentOptimizer0.getAbsoluteAccuracy();
        int int14 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction15 = null;
        org.apache.commons.math.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = brentOptimizer0.optimize(univariateRealFunction15, goalType16, (double) 35, (double) 1L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) (byte) -1);
        brentOptimizer0.setAbsoluteAccuracy((double) 100L);
        org.apache.commons.math.optimization.GoalType goalType11 = brentOptimizer0.getGoalType();
        double double12 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 97);
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int7 = brentOptimizer0.getIterationCount();
        int int8 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double10 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setRelativeAccuracy((double) (byte) 100);
        org.apache.commons.math.optimization.GoalType goalType10 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType10);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        int int7 = brentOptimizer0.getEvaluations();
        double double8 = brentOptimizer0.getMin();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((-1));
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double9 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType11 = brentOptimizer0.getGoalType();
        double double12 = brentOptimizer0.getMax();
        int int13 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (short) 0);
        double double11 = brentOptimizer0.getMax();
        int int12 = brentOptimizer0.getEvaluations();
        double double13 = brentOptimizer0.getFunctionValue();
        double double14 = brentOptimizer0.getStartValue();
        int int15 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction16 = null;
        org.apache.commons.math.optimization.GoalType goalType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double21 = brentOptimizer0.optimize(univariateRealFunction16, goalType17, (double) 100, (double) (short) 10, (double) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        double double2 = brentOptimizer0.getRelativeAccuracy();
        double double3 = brentOptimizer0.getStartValue();
        brentOptimizer0.resetRelativeAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setRelativeAccuracy((double) 10.0f);
        double double9 = brentOptimizer0.getFunctionValue();
        int int10 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetRelativeAccuracy();
        int int12 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-14d + "'", double2 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getEvaluations();
        double double5 = brentOptimizer0.getMax();
        double double6 = brentOptimizer0.getAbsoluteAccuracy();
        double double7 = brentOptimizer0.getRelativeAccuracy();
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-10d + "'", double6 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        int int4 = brentOptimizer0.getIterationCount();
        int int5 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.setAbsoluteAccuracy((double) (byte) -1);
        double double10 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        int int6 = brentOptimizer0.getMaximalIterationCount();
        double double7 = brentOptimizer0.getMin();
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetMaximalIterationCount();
        double double11 = brentOptimizer0.getStartValue();
        double double12 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double14 = brentOptimizer0.getAbsoluteAccuracy();
        double double15 = brentOptimizer0.getFunctionValue();
        double double16 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        int int6 = brentOptimizer0.getMaximalIterationCount();
        double double7 = brentOptimizer0.getMin();
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetMaximalIterationCount();
        int int11 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(2147483647);
        double double14 = brentOptimizer0.getAbsoluteAccuracy();
        int int15 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-10d + "'", double14 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '#');
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        int int4 = brentOptimizer0.getMaximalIterationCount();
        int int5 = brentOptimizer0.getIterationCount();
        double double6 = brentOptimizer0.getMax();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.setAbsoluteAccuracy((double) (-1L));
        int int10 = brentOptimizer0.getEvaluations();
        int int11 = brentOptimizer0.getMaxEvaluations();
        int int12 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((-1));
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaxEvaluations((int) (short) 10);
        double double10 = brentOptimizer0.getFunctionValue();
        int int11 = brentOptimizer0.getMaximalIterationCount();
        int int12 = brentOptimizer0.getIterationCount();
        org.apache.commons.math.optimization.GoalType goalType13 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(goalType13);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(10);
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        int int9 = brentOptimizer0.getMaximalIterationCount();
        double double10 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-10d + "'", double10 == 1.0E-10d);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        int int7 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType8 = brentOptimizer0.getGoalType();
        int int9 = brentOptimizer0.getMaxEvaluations();
        double double10 = brentOptimizer0.getRelativeAccuracy();
        int int11 = brentOptimizer0.getEvaluations();
        int int12 = brentOptimizer0.getIterationCount();
        int int13 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        int int5 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) (byte) 1);
        double double8 = brentOptimizer0.getMax();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        int int11 = brentOptimizer0.getMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(10);
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 100);
        brentOptimizer0.setMaximalIterationCount((int) (byte) -1);
        int int12 = brentOptimizer0.getEvaluations();
        int int13 = brentOptimizer0.getEvaluations();
        double double14 = brentOptimizer0.getMax();
        int int15 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaxEvaluations(0);
        brentOptimizer0.setMaximalIterationCount((int) (short) 0);
        double double11 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy((double) (-1L));
        double double9 = brentOptimizer0.getRelativeAccuracy();
        double double10 = brentOptimizer0.getStartValue();
        int int11 = brentOptimizer0.getIterationCount();
        int int12 = brentOptimizer0.getMaxEvaluations();
        double double13 = brentOptimizer0.getRelativeAccuracy();
        int int14 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setAbsoluteAccuracy(10.0d);
        double double17 = brentOptimizer0.getMin();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int7 = brentOptimizer0.getMaxEvaluations();
        int int8 = brentOptimizer0.getIterationCount();
        double double9 = brentOptimizer0.getAbsoluteAccuracy();
        double double10 = brentOptimizer0.getMax();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = brentOptimizer0.getResult();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math.exception.NoDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(10);
        int int6 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (short) 100);
        int int9 = brentOptimizer0.getEvaluations();
        java.lang.Class<?> wildcardClass10 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetRelativeAccuracy();
        double double7 = brentOptimizer0.getRelativeAccuracy();
        int int8 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        brentOptimizer0.setRelativeAccuracy((double) 10.0f);
        double double7 = brentOptimizer0.getMin();
        int int8 = brentOptimizer0.getMaximalIterationCount();
        int int9 = brentOptimizer0.getEvaluations();
        double double10 = brentOptimizer0.getMax();
        double double11 = brentOptimizer0.getMin();
        double double12 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations((int) (byte) 100);
        brentOptimizer0.resetMaximalIterationCount();
        double double9 = brentOptimizer0.getStartValue();
        double double10 = brentOptimizer0.getMin();
        double double11 = brentOptimizer0.getStartValue();
        int int12 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 1);
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 1);
        double double12 = brentOptimizer0.getAbsoluteAccuracy();
        org.apache.commons.math.optimization.GoalType goalType13 = brentOptimizer0.getGoalType();
        double double14 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNull(goalType13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-14d + "'", double14 == 1.0E-14d);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getRelativeAccuracy();
        double double6 = brentOptimizer0.getAbsoluteAccuracy();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        double double8 = brentOptimizer0.getStartValue();
        double double9 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-10d + "'", double6 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-10d + "'", double9 == 1.0E-10d);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getIterationCount();
        int int7 = brentOptimizer0.getIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = brentOptimizer0.getResult();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math.exception.NoDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        double double3 = brentOptimizer0.getMax();
        int int4 = brentOptimizer0.getIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction5 = null;
        org.apache.commons.math.optimization.GoalType goalType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = brentOptimizer0.optimize(univariateRealFunction5, goalType6, (double) 1.0f, 97.0d, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int11 = brentOptimizer0.getMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        int int4 = brentOptimizer0.getIterationCount();
        int int5 = brentOptimizer0.getMaxEvaluations();
        double double6 = brentOptimizer0.getMax();
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        double double8 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 100.0f);
        double double8 = brentOptimizer0.getStartValue();
        int int9 = brentOptimizer0.getMaximalIterationCount();
        double double10 = brentOptimizer0.getAbsoluteAccuracy();
        org.apache.commons.math.optimization.GoalType goalType11 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) (short) 0);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction14 = null;
        org.apache.commons.math.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = brentOptimizer0.optimize(univariateRealFunction14, goalType15, (double) 100, 0.0d, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-10d + "'", double10 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType11);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        int int6 = brentOptimizer0.getMaximalIterationCount();
        double double7 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((int) (byte) 1);
        brentOptimizer0.setMaximalIterationCount((int) (byte) 0);
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        double double14 = brentOptimizer0.getAbsoluteAccuracy();
        double double15 = brentOptimizer0.getRelativeAccuracy();
        int int16 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy(0.0d);
        org.apache.commons.math.optimization.GoalType goalType10 = brentOptimizer0.getGoalType();
        int int11 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) (short) 1);
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((int) 'a');
        double double8 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((-1));
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int9 = brentOptimizer0.getMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType10 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNull(goalType10);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount(2147483647);
        brentOptimizer0.setMaximalIterationCount(0);
        double double7 = brentOptimizer0.getMax();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = brentOptimizer0.optimize(univariateRealFunction8, goalType9, (double) (byte) 100, (double) (byte) -1, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getEvaluations();
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        double double9 = brentOptimizer0.getFunctionValue();
        double double10 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        double double12 = brentOptimizer0.getMin();
        int int13 = brentOptimizer0.getMaxEvaluations();
        double double14 = brentOptimizer0.getMax();
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-10d + "'", double10 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        int int4 = brentOptimizer0.getIterationCount();
        int int5 = brentOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = brentOptimizer0.getGoalType();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = brentOptimizer0.optimize(univariateRealFunction7, goalType8, (double) (short) -1, 100.0d, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNull(goalType6);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        int int6 = brentOptimizer0.getMaximalIterationCount();
        double double7 = brentOptimizer0.getMin();
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetMaximalIterationCount();
        double double11 = brentOptimizer0.getStartValue();
        double double12 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double14 = brentOptimizer0.getAbsoluteAccuracy();
        double double15 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setMaximalIterationCount((int) (short) 1);
        double double18 = brentOptimizer0.getMax();
        brentOptimizer0.setAbsoluteAccuracy((double) (-1L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        int int6 = brentOptimizer0.getMaximalIterationCount();
        double double7 = brentOptimizer0.getMin();
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetMaximalIterationCount();
        double double11 = brentOptimizer0.getStartValue();
        double double12 = brentOptimizer0.getRelativeAccuracy();
        int int13 = brentOptimizer0.getMaximalIterationCount();
        int int14 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((-1.0d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        double double6 = brentOptimizer0.getMax();
        brentOptimizer0.resetMaximalIterationCount();
        int int8 = brentOptimizer0.getEvaluations();
        int int9 = brentOptimizer0.getMaxEvaluations();
        double double10 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaxEvaluations(100);
        int int13 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-10d + "'", double10 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        double double10 = brentOptimizer0.getRelativeAccuracy();
        int int11 = brentOptimizer0.getMaxEvaluations();
        int int12 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations(97);
        brentOptimizer0.setRelativeAccuracy((double) 97);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = brentOptimizer0.getResult();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math.exception.NoDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        double double2 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 100.0f);
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-10d + "'", double2 == 1.0E-10d);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((int) 'a');
        double double8 = brentOptimizer0.getFunctionValue();
        double double9 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int11 = brentOptimizer0.getMaxEvaluations();
        double double12 = brentOptimizer0.getMax();
        double double13 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-14d + "'", double13 == 1.0E-14d);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) (byte) -1);
        brentOptimizer0.setMaxEvaluations((int) (short) 0);
        double double11 = brentOptimizer0.getAbsoluteAccuracy();
        org.apache.commons.math.optimization.GoalType goalType12 = brentOptimizer0.getGoalType();
        java.lang.Class<?> wildcardClass13 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(10);
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        double double9 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.resetRelativeAccuracy();
        int int11 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((-1.0d));
        double double14 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getRelativeAccuracy();
        double double6 = brentOptimizer0.getAbsoluteAccuracy();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        double double8 = brentOptimizer0.getStartValue();
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        java.lang.Class<?> wildcardClass10 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-10d + "'", double6 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetRelativeAccuracy();
        double double7 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaxEvaluations((int) '#');
        brentOptimizer0.resetRelativeAccuracy();
        double double11 = brentOptimizer0.getRelativeAccuracy();
        int int12 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int14 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = brentOptimizer0.optimize(univariateRealFunction8, goalType9, 100.0d, (double) 1.0f, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) (-1.0f));
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        int int6 = brentOptimizer0.getEvaluations();
        double double7 = brentOptimizer0.getMin();
        int int8 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setRelativeAccuracy(52.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType10 = brentOptimizer0.getGoalType();
        double double11 = brentOptimizer0.getFunctionValue();
        double double12 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setMaxEvaluations((int) (byte) 1);
        double double15 = brentOptimizer0.getAbsoluteAccuracy();
        double double16 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((-1));
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        int int8 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setMaxEvaluations(2147483647);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setRelativeAccuracy(0.0d);
        int int7 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = brentOptimizer0.optimize(univariateRealFunction8, goalType9, 0.0d, (double) 52, (double) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getFunctionValue();
        int int6 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType8 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType8);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double3 = brentOptimizer0.getMax();
        org.apache.commons.math.optimization.GoalType goalType4 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(goalType4);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((-1));
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setAbsoluteAccuracy(1.0E-14d);
        double double10 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        brentOptimizer0.setRelativeAccuracy(10.0d);
        brentOptimizer0.resetRelativeAccuracy();
        int int13 = brentOptimizer0.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        int int6 = brentOptimizer0.getMaximalIterationCount();
        double double7 = brentOptimizer0.getMin();
        brentOptimizer0.resetMaximalIterationCount();
        double double9 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.GoalType goalType12 = brentOptimizer0.getGoalType();
        int int13 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setMaxEvaluations(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setRelativeAccuracy((double) (byte) 100);
        double double10 = brentOptimizer0.getMin();
        double double11 = brentOptimizer0.getMax();
        int int12 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getMaxEvaluations();
        double double7 = brentOptimizer0.getStartValue();
        brentOptimizer0.setAbsoluteAccuracy((double) 0L);
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaxEvaluations((int) (short) 10);
        int int13 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int7 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        int int7 = brentOptimizer0.getEvaluations();
        int int8 = brentOptimizer0.getEvaluations();
        int int9 = brentOptimizer0.getIterationCount();
        org.apache.commons.math.optimization.GoalType goalType10 = brentOptimizer0.getGoalType();
        int int11 = brentOptimizer0.getEvaluations();
        double double12 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy((double) 0.0f);
        brentOptimizer0.setMaxEvaluations((int) '#');
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction13 = null;
        org.apache.commons.math.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = brentOptimizer0.optimize(univariateRealFunction13, goalType14, (double) 0L, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getEvaluations();
        double double5 = brentOptimizer0.getMax();
        double double6 = brentOptimizer0.getMax();
        double double7 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int9 = brentOptimizer0.getIterationCount();
        org.apache.commons.math.optimization.GoalType goalType10 = brentOptimizer0.getGoalType();
        double double11 = brentOptimizer0.getMin();
        int int12 = brentOptimizer0.getMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction13 = null;
        org.apache.commons.math.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = brentOptimizer0.optimize(univariateRealFunction13, goalType14, 52.0d, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setRelativeAccuracy(100.0d);
        brentOptimizer0.setMaxEvaluations((int) (byte) -1);
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        int int7 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType8 = brentOptimizer0.getGoalType();
        int int9 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        int int11 = brentOptimizer0.getMaximalIterationCount();
        int int12 = brentOptimizer0.getMaxEvaluations();
        double double13 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        int int4 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetRelativeAccuracy();
        double double6 = brentOptimizer0.getMax();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        int int8 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int7 = brentOptimizer0.getIterationCount();
        org.apache.commons.math.optimization.GoalType goalType8 = brentOptimizer0.getGoalType();
        int int9 = brentOptimizer0.getMaxEvaluations();
        double double10 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaxEvaluations(2147483647);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount(2147483647);
        brentOptimizer0.setMaximalIterationCount(0);
        double double7 = brentOptimizer0.getMax();
        brentOptimizer0.setRelativeAccuracy((double) (byte) 1);
        int int10 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetMaximalIterationCount();
        double double12 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        int int4 = brentOptimizer0.getIterationCount();
        double double5 = brentOptimizer0.getStartValue();
        org.apache.commons.math.optimization.GoalType goalType6 = brentOptimizer0.getGoalType();
        double double7 = brentOptimizer0.getMax();
        brentOptimizer0.setAbsoluteAccuracy((double) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        double double2 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy(32.0d);
        brentOptimizer0.setMaximalIterationCount((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-10d + "'", double2 == 1.0E-10d);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy(0.0d);
        org.apache.commons.math.optimization.GoalType goalType10 = brentOptimizer0.getGoalType();
        brentOptimizer0.setRelativeAccuracy((double) 10.0f);
        double double13 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setAbsoluteAccuracy((double) 0.0f);
        double double8 = brentOptimizer0.getMax();
        brentOptimizer0.setMaximalIterationCount(100);
        int int11 = brentOptimizer0.getIterationCount();
        int int12 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount(0);
        brentOptimizer0.setAbsoluteAccuracy((double) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        double double8 = brentOptimizer0.getRelativeAccuracy();
        double double9 = brentOptimizer0.getMin();
        int int10 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction11 = null;
        org.apache.commons.math.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentOptimizer0.optimize(univariateRealFunction11, goalType12, (double) (short) 1, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setAbsoluteAccuracy((double) 0.0f);
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setMaxEvaluations(100);
        brentOptimizer0.setRelativeAccuracy((double) 'a');
        brentOptimizer0.setMaximalIterationCount((int) (short) 1);
        int int15 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double18 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getEvaluations();
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double11 = brentOptimizer0.getAbsoluteAccuracy();
        int int12 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType13 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(goalType13);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        org.apache.commons.math.optimization.GoalType goalType6 = brentOptimizer0.getGoalType();
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        int int8 = brentOptimizer0.getEvaluations();
        int int9 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setRelativeAccuracy((double) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 100.0f);
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        double double9 = brentOptimizer0.getRelativeAccuracy();
        double double10 = brentOptimizer0.getMin();
        double double11 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        int int7 = brentOptimizer0.getEvaluations();
        int int8 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        int int10 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double12 = brentOptimizer0.getStartValue();
        brentOptimizer0.setMaxEvaluations((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        brentOptimizer0.setRelativeAccuracy((double) 0.0f);
        brentOptimizer0.resetRelativeAccuracy();
        double double13 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy(2.147483647E9d);
        int int17 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-10d + "'", double13 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getStartValue();
        int int7 = brentOptimizer0.getIterationCount();
        double double8 = brentOptimizer0.getMin();
        double double9 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-10d + "'", double9 == 1.0E-10d);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        int int6 = brentOptimizer0.getMaximalIterationCount();
        double double7 = brentOptimizer0.getMin();
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType11 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(goalType11);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        int int6 = brentOptimizer0.getMaximalIterationCount();
        double double7 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((int) (byte) 1);
        brentOptimizer0.setMaximalIterationCount((int) (byte) 0);
        brentOptimizer0.setRelativeAccuracy((double) 100L);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        double double6 = brentOptimizer0.getAbsoluteAccuracy();
        double double7 = brentOptimizer0.getRelativeAccuracy();
        int int8 = brentOptimizer0.getEvaluations();
        int int9 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-10d + "'", double6 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        int int5 = brentOptimizer0.getIterationCount();
        double double6 = brentOptimizer0.getMax();
        int int7 = brentOptimizer0.getMaximalIterationCount();
        int int8 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double10 = brentOptimizer0.getFunctionValue();
        int int11 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        brentOptimizer0.setRelativeAccuracy((double) 10.0f);
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType8 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 100);
        org.apache.commons.math.optimization.GoalType goalType11 = brentOptimizer0.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = brentOptimizer0.getResult();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math.exception.NoDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertNull(goalType11);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 0);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction10 = null;
        org.apache.commons.math.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentOptimizer0.optimize(univariateRealFunction10, goalType11, 2.147483647E9d, (double) ' ', (double) 32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((-1));
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double9 = brentOptimizer0.getAbsoluteAccuracy();
        double double10 = brentOptimizer0.getAbsoluteAccuracy();
        double double11 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setAbsoluteAccuracy((double) (-1.0f));
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction14 = null;
        org.apache.commons.math.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = brentOptimizer0.optimize(univariateRealFunction14, goalType15, (double) 2147483647, (double) 1L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setAbsoluteAccuracy((double) '4');
        brentOptimizer0.setMaxEvaluations(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setMaxEvaluations(100);
        double double10 = brentOptimizer0.getMin();
        brentOptimizer0.resetMaximalIterationCount();
        double double12 = brentOptimizer0.getMin();
        java.lang.Class<?> wildcardClass13 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy((double) (-1L));
        double double9 = brentOptimizer0.getRelativeAccuracy();
        double double10 = brentOptimizer0.getStartValue();
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(10);
        int int6 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) (short) 100);
        double double9 = brentOptimizer0.getAbsoluteAccuracy();
        double double10 = brentOptimizer0.getFunctionValue();
        double double11 = brentOptimizer0.getRelativeAccuracy();
        int int12 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-10d + "'", double9 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) ' ');
        double double10 = brentOptimizer0.getStartValue();
        org.apache.commons.math.optimization.GoalType goalType11 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(goalType11);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setMaxEvaluations(97);
        brentOptimizer0.setMaxEvaluations((int) (short) -1);
        java.lang.Class<?> wildcardClass13 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getEvaluations();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (short) 1);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = brentOptimizer0.optimize(univariateRealFunction9, goalType10, (double) (short) -1, 1.0E-14d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetRelativeAccuracy();
        double double7 = brentOptimizer0.getRelativeAccuracy();
        int int8 = brentOptimizer0.getIterationCount();
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType12 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertNull(goalType12);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount(2147483647);
        int int5 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        int int6 = brentOptimizer0.getMaximalIterationCount();
        double double7 = brentOptimizer0.getMin();
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetMaximalIterationCount();
        double double11 = brentOptimizer0.getStartValue();
        double double12 = brentOptimizer0.getRelativeAccuracy();
        int int13 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetMaximalIterationCount();
        double double15 = brentOptimizer0.getStartValue();
        double double16 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-14d + "'", double16 == 1.0E-14d);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        int int7 = brentOptimizer0.getEvaluations();
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        double double9 = brentOptimizer0.getMin();
        brentOptimizer0.setAbsoluteAccuracy(100.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((-1));
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double9 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations((int) (byte) -1);
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        double double6 = brentOptimizer0.getMax();
        brentOptimizer0.setRelativeAccuracy((double) 'a');
        double double9 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        double double10 = brentOptimizer0.getRelativeAccuracy();
        int int11 = brentOptimizer0.getMaxEvaluations();
        int int12 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations(97);
        brentOptimizer0.setRelativeAccuracy((double) 97);
        double double17 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        brentOptimizer0.setRelativeAccuracy((double) 10.0f);
        double double7 = brentOptimizer0.getMin();
        int int8 = brentOptimizer0.getMaximalIterationCount();
        int int9 = brentOptimizer0.getEvaluations();
        double double10 = brentOptimizer0.getMax();
        double double11 = brentOptimizer0.getMin();
        java.lang.Class<?> wildcardClass12 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setAbsoluteAccuracy((double) 0.0f);
        brentOptimizer0.resetRelativeAccuracy();
        double double9 = brentOptimizer0.getMax();
        double double10 = brentOptimizer0.getMin();
        double double11 = brentOptimizer0.getMin();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) (byte) 1);
        brentOptimizer0.setMaximalIterationCount(2147483647);
        int int17 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType10 = brentOptimizer0.getGoalType();
        double double11 = brentOptimizer0.getMin();
        int int12 = brentOptimizer0.getEvaluations();
        double double13 = brentOptimizer0.getMax();
        int int14 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setMaxEvaluations(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        double double6 = brentOptimizer0.getMax();
        brentOptimizer0.setAbsoluteAccuracy((double) 2147483647);
        brentOptimizer0.setAbsoluteAccuracy((double) (-1));
        brentOptimizer0.setMaximalIterationCount(1);
        brentOptimizer0.setMaximalIterationCount(100);
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) 10.0f);
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        double double8 = brentOptimizer0.getFunctionValue();
        double double9 = brentOptimizer0.getFunctionValue();
        double double10 = brentOptimizer0.getMin();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.setMaxEvaluations((int) (byte) 100);
        org.apache.commons.math.optimization.GoalType goalType8 = brentOptimizer0.getGoalType();
        double double9 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getEvaluations();
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) (-1L));
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 100);
        brentOptimizer0.setMaxEvaluations((int) (short) 100);
        int int15 = brentOptimizer0.getIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction16 = null;
        org.apache.commons.math.optimization.GoalType goalType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double21 = brentOptimizer0.optimize(univariateRealFunction16, goalType17, (double) 1.0f, (double) 10.0f, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        int int8 = brentOptimizer0.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 1);
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 1);
        double double12 = brentOptimizer0.getAbsoluteAccuracy();
        org.apache.commons.math.optimization.GoalType goalType13 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetRelativeAccuracy();
        double double15 = brentOptimizer0.getStartValue();
        brentOptimizer0.setMaxEvaluations(100);
        brentOptimizer0.resetRelativeAccuracy();
        int int19 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNull(goalType13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = brentOptimizer0.getGoalType();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setAbsoluteAccuracy(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = brentOptimizer0.getResult();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math.exception.NoDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        double double7 = brentOptimizer0.getFunctionValue();
        int int8 = brentOptimizer0.getEvaluations();
        int int9 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int11 = brentOptimizer0.getIterationCount();
        int int12 = brentOptimizer0.getMaximalIterationCount();
        double double13 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-14d + "'", double13 == 1.0E-14d);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setRelativeAccuracy((double) (byte) 0);
        int int10 = brentOptimizer0.getEvaluations();
        int int11 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        double double7 = brentOptimizer0.getMin();
        brentOptimizer0.setRelativeAccuracy((double) 10L);
        java.lang.Class<?> wildcardClass10 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(10);
        int int6 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) (short) -1);
        double double9 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        double double2 = brentOptimizer0.getRelativeAccuracy();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 100);
        double double7 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-14d + "'", double2 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int7 = brentOptimizer0.getIterationCount();
        int int8 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) 1);
        org.apache.commons.math.optimization.GoalType goalType11 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType11);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        double double6 = brentOptimizer0.getMax();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) 10L);
        double double7 = brentOptimizer0.getMax();
        int int8 = brentOptimizer0.getMaxEvaluations();
        int int9 = brentOptimizer0.getMaximalIterationCount();
        int int10 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setRelativeAccuracy(0.0d);
        double double13 = brentOptimizer0.getFunctionValue();
        double double14 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setRelativeAccuracy((double) (byte) 100);
        brentOptimizer0.setRelativeAccuracy(10.0d);
        org.apache.commons.math.optimization.GoalType goalType12 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) 35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType12);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setAbsoluteAccuracy((double) 0.0f);
        double double8 = brentOptimizer0.getMax();
        brentOptimizer0.setMaximalIterationCount(100);
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        int int7 = brentOptimizer0.getEvaluations();
        double double8 = brentOptimizer0.getMin();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = brentOptimizer0.optimize(univariateRealFunction9, goalType10, (double) 2147483647, (double) (byte) 0, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: maximal number of evaluations (0) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setRelativeAccuracy(100.0d);
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        int int10 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getMaxEvaluations();
        double double7 = brentOptimizer0.getStartValue();
        brentOptimizer0.setAbsoluteAccuracy((double) 0L);
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        brentOptimizer0.resetRelativeAccuracy();
        double double13 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getEvaluations();
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (short) 10);
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) (short) -1);
        brentOptimizer0.setRelativeAccuracy((double) 'a');
        double double16 = brentOptimizer0.getFunctionValue();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount(2147483647);
        double double5 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.resetAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = brentOptimizer0.getResult();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math.exception.NoDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        int int4 = brentOptimizer0.getMaximalIterationCount();
        int int5 = brentOptimizer0.getIterationCount();
        double double6 = brentOptimizer0.getMax();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.setAbsoluteAccuracy((double) (-1L));
        brentOptimizer0.setAbsoluteAccuracy((double) (short) -1);
        brentOptimizer0.setMaxEvaluations((int) 'a');
        double double14 = brentOptimizer0.getMin();
        double double15 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-14d + "'", double15 == 1.0E-14d);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        int int4 = brentOptimizer0.getIterationCount();
        int int5 = brentOptimizer0.getMaxEvaluations();
        double double6 = brentOptimizer0.getMax();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy((double) (-1L));
        double double9 = brentOptimizer0.getRelativeAccuracy();
        double double10 = brentOptimizer0.getStartValue();
        int int11 = brentOptimizer0.getIterationCount();
        int int12 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setAbsoluteAccuracy(32.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        brentOptimizer0.resetMaximalIterationCount();
        double double11 = brentOptimizer0.getMax();
        double double12 = brentOptimizer0.getStartValue();
        double double13 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        double double8 = brentOptimizer0.getFunctionValue();
        int int9 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy((double) 1L);
        brentOptimizer0.resetMaximalIterationCount();
        double double8 = brentOptimizer0.getMin();
        brentOptimizer0.setRelativeAccuracy(1.0d);
        brentOptimizer0.setMaximalIterationCount(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        int int7 = brentOptimizer0.getMaxEvaluations();
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        int int9 = brentOptimizer0.getIterationCount();
        double double10 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setRelativeAccuracy((double) (short) 10);
        double double13 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setRelativeAccuracy((double) (byte) 100);
        brentOptimizer0.setRelativeAccuracy(10.0d);
        org.apache.commons.math.optimization.GoalType goalType12 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType14 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaxEvaluations(100);
        int int17 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setMaxEvaluations(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertNull(goalType14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        double double6 = brentOptimizer0.getAbsoluteAccuracy();
        int int7 = brentOptimizer0.getMaxEvaluations();
        int int8 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        int int10 = brentOptimizer0.getMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = brentOptimizer0.getResult();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math.exception.NoDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-10d + "'", double6 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (short) 0);
        double double11 = brentOptimizer0.getMax();
        double double12 = brentOptimizer0.getFunctionValue();
        double double13 = brentOptimizer0.getMax();
        brentOptimizer0.setAbsoluteAccuracy((double) 1);
        double double16 = brentOptimizer0.getMin();
        org.apache.commons.math.optimization.GoalType goalType17 = brentOptimizer0.getGoalType();
        brentOptimizer0.setRelativeAccuracy((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(goalType17);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getEvaluations();
        double double5 = brentOptimizer0.getMax();
        double double6 = brentOptimizer0.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = brentOptimizer0.optimize(univariateRealFunction7, goalType8, 0.0d, (double) ' ', (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-10d + "'", double6 == 1.0E-10d);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) 10L);
        double double7 = brentOptimizer0.getMax();
        int int8 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount(2147483647);
        brentOptimizer0.setMaximalIterationCount(0);
        double double7 = brentOptimizer0.getMax();
        brentOptimizer0.setRelativeAccuracy((double) (byte) 1);
        brentOptimizer0.setAbsoluteAccuracy((double) 1L);
        double double12 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        int int5 = brentOptimizer0.getMaximalIterationCount();
        double double6 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        double double6 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double8 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        brentOptimizer0.setRelativeAccuracy((double) 10.0f);
        double double7 = brentOptimizer0.getMin();
        int int8 = brentOptimizer0.getMaximalIterationCount();
        int int9 = brentOptimizer0.getEvaluations();
        double double10 = brentOptimizer0.getRelativeAccuracy();
        double double11 = brentOptimizer0.getRelativeAccuracy();
        double double12 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setRelativeAccuracy(100.0d);
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction11 = null;
        org.apache.commons.math.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentOptimizer0.optimize(univariateRealFunction11, goalType12, (double) 100, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType9);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) 10L);
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetRelativeAccuracy();
        double double9 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction11 = null;
        org.apache.commons.math.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = brentOptimizer0.optimize(univariateRealFunction11, goalType12, (double) 10, 1.0d, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.resetRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        double double6 = brentOptimizer0.getMax();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.apache.commons.math.optimization.GoalType goalType8 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        double double6 = brentOptimizer0.getMax();
        brentOptimizer0.resetMaximalIterationCount();
        double double8 = brentOptimizer0.getRelativeAccuracy();
        double double9 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        double double12 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy((double) (-1L));
        double double9 = brentOptimizer0.getRelativeAccuracy();
        double double10 = brentOptimizer0.getStartValue();
        int int11 = brentOptimizer0.getIterationCount();
        int int12 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setRelativeAccuracy(52.0d);
        brentOptimizer0.setMaximalIterationCount(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setAbsoluteAccuracy((double) 0.0f);
        brentOptimizer0.resetRelativeAccuracy();
        double double9 = brentOptimizer0.getMax();
        double double10 = brentOptimizer0.getStartValue();
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy((double) (-1L));
        double double9 = brentOptimizer0.getRelativeAccuracy();
        double double10 = brentOptimizer0.getStartValue();
        int int11 = brentOptimizer0.getIterationCount();
        int int12 = brentOptimizer0.getMaxEvaluations();
        double double13 = brentOptimizer0.getRelativeAccuracy();
        int int14 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setAbsoluteAccuracy(10.0d);
        int int17 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        int int4 = brentOptimizer0.getIterationCount();
        org.apache.commons.math.optimization.GoalType goalType5 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetRelativeAccuracy();
        double double7 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getEvaluations();
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) (-1L));
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 100);
        double double13 = brentOptimizer0.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = brentOptimizer0.getResult();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math.exception.NoDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        int int7 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType8 = brentOptimizer0.getGoalType();
        int int9 = brentOptimizer0.getMaxEvaluations();
        double double10 = brentOptimizer0.getMax();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (short) 10);
        int int14 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount(2147483647);
        brentOptimizer0.setAbsoluteAccuracy(35.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) 10L);
        double double7 = brentOptimizer0.getMax();
        int int8 = brentOptimizer0.getMaxEvaluations();
        int int9 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (short) 0);
        int int13 = brentOptimizer0.getMaxEvaluations();
        double double14 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '#');
        brentOptimizer0.setMaximalIterationCount(0);
        int int6 = brentOptimizer0.getIterationCount();
        double double7 = brentOptimizer0.getStartValue();
        brentOptimizer0.resetRelativeAccuracy();
        double double9 = brentOptimizer0.getMax();
        brentOptimizer0.setAbsoluteAccuracy((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        double double10 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        double double6 = brentOptimizer0.getMax();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        double double10 = brentOptimizer0.getAbsoluteAccuracy();
        int int11 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetMaximalIterationCount();
        double double13 = brentOptimizer0.getMax();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction14 = null;
        org.apache.commons.math.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = brentOptimizer0.optimize(univariateRealFunction14, goalType15, 10.0d, (double) (short) 1, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: maximal number of evaluations (0) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-10d + "'", double10 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        int int2 = brentOptimizer0.getEvaluations();
        double double3 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(10);
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getEvaluations();
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) (-1L));
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 100);
        brentOptimizer0.setMaxEvaluations((int) (short) 100);
        brentOptimizer0.resetAbsoluteAccuracy();
        org.apache.commons.math.optimization.GoalType goalType16 = brentOptimizer0.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType16);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        int int10 = brentOptimizer0.getMaxEvaluations();
        double double11 = brentOptimizer0.getStartValue();
        brentOptimizer0.setMaximalIterationCount((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = brentOptimizer0.getResult();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math.exception.NoDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount(2147483647);
        brentOptimizer0.setMaximalIterationCount(0);
        double double7 = brentOptimizer0.getMax();
        brentOptimizer0.setRelativeAccuracy((double) (byte) 1);
        int int10 = brentOptimizer0.getEvaluations();
        double double11 = brentOptimizer0.getFunctionValue();
        int int12 = brentOptimizer0.getMaxEvaluations();
        double double13 = brentOptimizer0.getMin();
        double double14 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((int) 'a');
        double double8 = brentOptimizer0.getFunctionValue();
        double double9 = brentOptimizer0.getMax();
        int int10 = brentOptimizer0.getMaxEvaluations();
        double double11 = brentOptimizer0.getMin();
        double double12 = brentOptimizer0.getRelativeAccuracy();
        java.lang.Class<?> wildcardClass13 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int7 = brentOptimizer0.getIterationCount();
        int int8 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int10 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        int int6 = brentOptimizer0.getMaximalIterationCount();
        double double7 = brentOptimizer0.getMin();
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetMaximalIterationCount();
        double double11 = brentOptimizer0.getStartValue();
        double double12 = brentOptimizer0.getRelativeAccuracy();
        double double13 = brentOptimizer0.getStartValue();
        double double14 = brentOptimizer0.getRelativeAccuracy();
        int int15 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-14d + "'", double14 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((int) 'a');
        brentOptimizer0.setRelativeAccuracy((double) '4');
        brentOptimizer0.resetMaximalIterationCount();
        int int11 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = brentOptimizer0.getResult();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math.exception.NoDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getMaxEvaluations();
        double double7 = brentOptimizer0.getFunctionValue();
        double double8 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        double double6 = brentOptimizer0.getMax();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        double double10 = brentOptimizer0.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction11 = null;
        org.apache.commons.math.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = brentOptimizer0.optimize(univariateRealFunction11, goalType12, 0.0d, (double) 1.0f, 52.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: maximal number of evaluations (0) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-10d + "'", double10 == 1.0E-10d);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        double double8 = brentOptimizer0.getMax();
        int int9 = brentOptimizer0.getMaxEvaluations();
        int int10 = brentOptimizer0.getMaximalIterationCount();
        double double11 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        double double8 = brentOptimizer0.getRelativeAccuracy();
        double double9 = brentOptimizer0.getAbsoluteAccuracy();
        double double10 = brentOptimizer0.getMin();
        java.lang.Class<?> wildcardClass11 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-10d + "'", double9 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations((int) (byte) 100);
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(10);
        int int12 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        double double15 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-14d + "'", double15 == 1.0E-14d);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy((double) (-1L));
        double double9 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = brentOptimizer0.getResult();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math.exception.NoDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        brentOptimizer0.setRelativeAccuracy(10.0d);
        brentOptimizer0.resetRelativeAccuracy();
        double double13 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations((int) (short) 1);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction17 = null;
        org.apache.commons.math.optimization.GoalType goalType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double22 = brentOptimizer0.optimize(univariateRealFunction17, goalType18, (double) (byte) 10, (double) 2147483647, 35.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        double double8 = brentOptimizer0.getRelativeAccuracy();
        double double9 = brentOptimizer0.getMin();
        org.apache.commons.math.optimization.GoalType goalType10 = brentOptimizer0.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(goalType10);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = brentOptimizer0.getGoalType();
        int int5 = brentOptimizer0.getEvaluations();
        int int6 = brentOptimizer0.getMaximalIterationCount();
        double double7 = brentOptimizer0.getRelativeAccuracy();
        double double8 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        double double6 = brentOptimizer0.getAbsoluteAccuracy();
        double double7 = brentOptimizer0.getMax();
        double double8 = brentOptimizer0.getRelativeAccuracy();
        double double9 = brentOptimizer0.getStartValue();
        java.lang.Class<?> wildcardClass10 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-10d + "'", double6 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setMaxEvaluations(97);
        brentOptimizer0.setMaxEvaluations((int) (short) -1);
        int int13 = brentOptimizer0.getEvaluations();
        int int14 = brentOptimizer0.getIterationCount();
        int int15 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy(0.0d);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction18 = null;
        org.apache.commons.math.optimization.GoalType goalType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double23 = brentOptimizer0.optimize(univariateRealFunction18, goalType19, (double) (-1L), (double) 'a', (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) (short) -1);
        double double5 = brentOptimizer0.getMax();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        brentOptimizer0.setRelativeAccuracy((double) 1);
        double double7 = brentOptimizer0.getFunctionValue();
        double double8 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(10);
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        int int8 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        int int6 = brentOptimizer0.getEvaluations();
        double double7 = brentOptimizer0.getMin();
        int int8 = brentOptimizer0.getMaximalIterationCount();
        int int9 = brentOptimizer0.getMaximalIterationCount();
        double double10 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        brentOptimizer0.setRelativeAccuracy((double) 10.0f);
        double double7 = brentOptimizer0.getMin();
        int int8 = brentOptimizer0.getMaximalIterationCount();
        int int9 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType10 = brentOptimizer0.getGoalType();
        double double11 = brentOptimizer0.getStartValue();
        int int12 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        int int7 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        double double10 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetRelativeAccuracy();
        double double7 = brentOptimizer0.getRelativeAccuracy();
        int int8 = brentOptimizer0.getIterationCount();
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetRelativeAccuracy();
        double double11 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-10d + "'", double11 == 1.0E-10d);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double7 = brentOptimizer0.getRelativeAccuracy();
        int int8 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        int int7 = brentOptimizer0.getMaxEvaluations();
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        int int9 = brentOptimizer0.getIterationCount();
        double double10 = brentOptimizer0.getFunctionValue();
        double double11 = brentOptimizer0.getMax();
        double double12 = brentOptimizer0.getMax();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction13 = null;
        org.apache.commons.math.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = brentOptimizer0.optimize(univariateRealFunction13, goalType14, 1.0d, (double) 1.0f, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        int int7 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType8 = brentOptimizer0.getGoalType();
        int int9 = brentOptimizer0.getMaxEvaluations();
        double double10 = brentOptimizer0.getMax();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (short) 10);
        int int14 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount(2147483647);
        int int17 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetMaximalIterationCount();
        double double5 = brentOptimizer0.getStartValue();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double7 = brentOptimizer0.getStartValue();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        int int4 = brentOptimizer0.getIterationCount();
        int int5 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.setAbsoluteAccuracy((double) (byte) -1);
        brentOptimizer0.setAbsoluteAccuracy((double) 10.0f);
        int int12 = brentOptimizer0.getIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = brentOptimizer0.getResult();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math.exception.NoDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setAbsoluteAccuracy((double) 0.0f);
        brentOptimizer0.resetRelativeAccuracy();
        double double9 = brentOptimizer0.getMax();
        double double10 = brentOptimizer0.getMin();
        brentOptimizer0.setRelativeAccuracy((double) 100);
        brentOptimizer0.setAbsoluteAccuracy((double) 10L);
        org.apache.commons.math.optimization.GoalType goalType15 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(goalType15);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getMaxEvaluations();
        double double7 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setMaximalIterationCount((int) (short) 0);
        int int10 = brentOptimizer0.getMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType11 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(goalType11);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount(2147483647);
        brentOptimizer0.setMaximalIterationCount(0);
        double double7 = brentOptimizer0.getMax();
        brentOptimizer0.setRelativeAccuracy((double) (byte) 1);
        int int10 = brentOptimizer0.getEvaluations();
        double double11 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = brentOptimizer0.getGoalType();
        int int5 = brentOptimizer0.getEvaluations();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) 0.0f);
        brentOptimizer0.setAbsoluteAccuracy((-1.0d));
        int int11 = brentOptimizer0.getIterationCount();
        org.apache.commons.math.optimization.GoalType goalType12 = brentOptimizer0.getGoalType();
        int int13 = brentOptimizer0.getMaximalIterationCount();
        double double14 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((-1));
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaxEvaluations((int) (short) 10);
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(10);
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 100);
        brentOptimizer0.setMaximalIterationCount((int) (byte) -1);
        int int12 = brentOptimizer0.getMaxEvaluations();
        double double13 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((-1));
        double double7 = brentOptimizer0.getMin();
        brentOptimizer0.setAbsoluteAccuracy((double) 100L);
        double double10 = brentOptimizer0.getAbsoluteAccuracy();
        int int11 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        int int7 = brentOptimizer0.getMaxEvaluations();
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        int int9 = brentOptimizer0.getIterationCount();
        double double10 = brentOptimizer0.getFunctionValue();
        double double11 = brentOptimizer0.getMax();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setMaxEvaluations((int) ' ');
        brentOptimizer0.resetRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        brentOptimizer0.resetMaximalIterationCount();
        double double8 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaxEvaluations(100);
        brentOptimizer0.resetMaximalIterationCount();
        int int12 = brentOptimizer0.getMaximalIterationCount();
        double double13 = brentOptimizer0.getMin();
        double double14 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-10d + "'", double14 == 1.0E-10d);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        int int6 = brentOptimizer0.getMaximalIterationCount();
        double double7 = brentOptimizer0.getMin();
        brentOptimizer0.resetMaximalIterationCount();
        double double9 = brentOptimizer0.getMin();
        int int10 = brentOptimizer0.getMaxEvaluations();
        double double11 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.resetMaximalIterationCount();
        double double13 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        double double8 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaxEvaluations(0);
        double double11 = brentOptimizer0.getMax();
        double double12 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-10d + "'", double12 == 1.0E-10d);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setAbsoluteAccuracy((double) 0.0f);
        double double8 = brentOptimizer0.getMax();
        double double9 = brentOptimizer0.getStartValue();
        double double10 = brentOptimizer0.getFunctionValue();
        org.apache.commons.math.optimization.GoalType goalType11 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 100);
        int int14 = brentOptimizer0.getMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction15 = null;
        org.apache.commons.math.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = brentOptimizer0.optimize(univariateRealFunction15, goalType16, (double) 1.0f, (double) ' ');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        brentOptimizer0.setRelativeAccuracy((double) 10.0f);
        double double7 = brentOptimizer0.getMin();
        int int8 = brentOptimizer0.getMaximalIterationCount();
        int int9 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType10 = brentOptimizer0.getGoalType();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        double double13 = brentOptimizer0.getStartValue();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        double double7 = brentOptimizer0.getFunctionValue();
        int int8 = brentOptimizer0.getEvaluations();
        int int9 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) ' ');
        double double13 = brentOptimizer0.getFunctionValue();
        int int14 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        double double8 = brentOptimizer0.getMax();
        int int9 = brentOptimizer0.getMaxEvaluations();
        int int10 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy((double) 35);
        int int13 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) (short) -1);
        double double5 = brentOptimizer0.getMax();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = brentOptimizer0.getResult();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math.exception.NoDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        double double2 = brentOptimizer0.getRelativeAccuracy();
        double double3 = brentOptimizer0.getStartValue();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-14d + "'", double2 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        int int5 = brentOptimizer0.getIterationCount();
        double double6 = brentOptimizer0.getStartValue();
        brentOptimizer0.setMaxEvaluations((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int7 = brentOptimizer0.getIterationCount();
        int int8 = brentOptimizer0.getIterationCount();
        int int9 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount(100);
        double double12 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        int int10 = brentOptimizer0.getIterationCount();
        double double11 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount(2147483647);
        int int5 = brentOptimizer0.getMaxEvaluations();
        double double6 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-10d + "'", double6 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType9);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        int int6 = brentOptimizer0.getMaximalIterationCount();
        double double7 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((int) (byte) 1);
        brentOptimizer0.setMaximalIterationCount((int) (byte) 0);
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        double double14 = brentOptimizer0.getAbsoluteAccuracy();
        double double15 = brentOptimizer0.getRelativeAccuracy();
        java.lang.Class<?> wildcardClass16 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setMaxEvaluations(100);
        double double10 = brentOptimizer0.getMin();
        brentOptimizer0.resetMaximalIterationCount();
        double double12 = brentOptimizer0.getMin();
        brentOptimizer0.setAbsoluteAccuracy((double) 1.0f);
        brentOptimizer0.setAbsoluteAccuracy((double) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetRelativeAccuracy();
        double double7 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaxEvaluations((int) '#');
        double double10 = brentOptimizer0.getMax();
        org.apache.commons.math.optimization.GoalType goalType11 = brentOptimizer0.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType12 = brentOptimizer0.getGoalType();
        int int13 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        brentOptimizer0.setRelativeAccuracy((double) 10.0f);
        double double7 = brentOptimizer0.getMin();
        int int8 = brentOptimizer0.getMaximalIterationCount();
        int int9 = brentOptimizer0.getEvaluations();
        double double10 = brentOptimizer0.getMax();
        double double11 = brentOptimizer0.getStartValue();
        double double12 = brentOptimizer0.getMax();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = brentOptimizer0.getResult();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math.exception.NoDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        int int7 = brentOptimizer0.getEvaluations();
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '#');
        brentOptimizer0.setMaximalIterationCount(0);
        int int6 = brentOptimizer0.getIterationCount();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.setRelativeAccuracy((double) (-1));
        brentOptimizer0.resetMaximalIterationCount();
        int int11 = brentOptimizer0.getMaximalIterationCount();
        double double12 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        double double6 = brentOptimizer0.getAbsoluteAccuracy();
        int int7 = brentOptimizer0.getMaxEvaluations();
        int int8 = brentOptimizer0.getIterationCount();
        double double9 = brentOptimizer0.getMax();
        brentOptimizer0.setRelativeAccuracy((double) 1L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-10d + "'", double6 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetAbsoluteAccuracy();
        int int7 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType8 = brentOptimizer0.getGoalType();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = brentOptimizer0.optimize(univariateRealFunction9, goalType10, (double) 2147483647, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getMaxEvaluations();
        double double7 = brentOptimizer0.getStartValue();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 1);
        int int10 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetRelativeAccuracy();
        int int12 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        double double6 = brentOptimizer0.getMin();
        double double7 = brentOptimizer0.getMin();
        double double8 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetMaximalIterationCount();
        double double7 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(10);
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.setRelativeAccuracy((double) 97);
        double double10 = brentOptimizer0.getAbsoluteAccuracy();
        double double11 = brentOptimizer0.getMax();
        brentOptimizer0.setMaximalIterationCount(0);
        int int14 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-10d + "'", double10 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations((int) (byte) 100);
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        int int10 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        double double8 = brentOptimizer0.getMax();
        int int9 = brentOptimizer0.getMaxEvaluations();
        int int10 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy(2.147483647E9d);
        int int13 = brentOptimizer0.getEvaluations();
        double double14 = brentOptimizer0.getStartValue();
        brentOptimizer0.setAbsoluteAccuracy((double) 35);
        int int17 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int7 = brentOptimizer0.getMaxEvaluations();
        int int8 = brentOptimizer0.getIterationCount();
        double double9 = brentOptimizer0.getAbsoluteAccuracy();
        double double10 = brentOptimizer0.getStartValue();
        int int11 = brentOptimizer0.getMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = brentOptimizer0.getResult();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math.exception.NoDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setAbsoluteAccuracy((double) 0.0f);
        brentOptimizer0.resetRelativeAccuracy();
        double double9 = brentOptimizer0.getMax();
        brentOptimizer0.resetRelativeAccuracy();
        int int11 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType13 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(goalType13);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((int) 'a');
        int int8 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations((int) ' ');
        java.lang.Class<?> wildcardClass11 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount(2147483647);
        brentOptimizer0.setAbsoluteAccuracy(1.0d);
        int int7 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 100);
        brentOptimizer0.resetMaximalIterationCount();
        double double11 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        int int7 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType8 = brentOptimizer0.getGoalType();
        int int9 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setAbsoluteAccuracy(0.0d);
        brentOptimizer0.resetMaximalIterationCount();
        double double14 = brentOptimizer0.getRelativeAccuracy();
        double double15 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetMaximalIterationCount();
        double double5 = brentOptimizer0.getStartValue();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double7 = brentOptimizer0.getStartValue();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int10 = brentOptimizer0.getIterationCount();
        double double11 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetAbsoluteAccuracy();
        int int7 = brentOptimizer0.getEvaluations();
        double double8 = brentOptimizer0.getMin();
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction10 = null;
        org.apache.commons.math.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = brentOptimizer0.optimize(univariateRealFunction10, goalType11, (double) (byte) 1, 10.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations((int) (byte) 100);
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        double double9 = brentOptimizer0.getMin();
        int int10 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setAbsoluteAccuracy((double) 0.0f);
        double double8 = brentOptimizer0.getMax();
        brentOptimizer0.setMaximalIterationCount(100);
        brentOptimizer0.resetAbsoluteAccuracy();
        double double12 = brentOptimizer0.getFunctionValue();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = brentOptimizer0.getResult();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math.exception.NoDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        int int5 = brentOptimizer0.getIterationCount();
        double double6 = brentOptimizer0.getMax();
        brentOptimizer0.resetMaximalIterationCount();
        double double8 = brentOptimizer0.getRelativeAccuracy();
        double double9 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        int int7 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType8 = brentOptimizer0.getGoalType();
        int int9 = brentOptimizer0.getMaxEvaluations();
        double double10 = brentOptimizer0.getRelativeAccuracy();
        int int11 = brentOptimizer0.getEvaluations();
        double double12 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-10d + "'", double12 == 1.0E-10d);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (short) 0);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        int int13 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        double double2 = brentOptimizer0.getAbsoluteAccuracy();
        double double3 = brentOptimizer0.getStartValue();
        double double4 = brentOptimizer0.getRelativeAccuracy();
        int int5 = brentOptimizer0.getIterationCount();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-10d + "'", double2 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-14d + "'", double4 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setAbsoluteAccuracy((double) 0.0f);
        double double8 = brentOptimizer0.getMax();
        brentOptimizer0.setMaximalIterationCount(100);
        brentOptimizer0.resetAbsoluteAccuracy();
        double double12 = brentOptimizer0.getMin();
        double double13 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getIterationCount();
        double double6 = brentOptimizer0.getStartValue();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 1);
        double double9 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        double double6 = brentOptimizer0.getMax();
        brentOptimizer0.setRelativeAccuracy((double) 10.0f);
        brentOptimizer0.resetMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = brentOptimizer0.getResult();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math.exception.NoDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getEvaluations();
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (short) 10);
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) (short) -1);
        brentOptimizer0.setRelativeAccuracy((double) 'a');
        brentOptimizer0.setAbsoluteAccuracy((-1.0d));
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetRelativeAccuracy();
        double double7 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        double double9 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations((int) (byte) 100);
        brentOptimizer0.resetMaximalIterationCount();
        double double9 = brentOptimizer0.getStartValue();
        double double10 = brentOptimizer0.getMin();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double12 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        double double14 = brentOptimizer0.getMax();
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        double double8 = brentOptimizer0.getRelativeAccuracy();
        double double9 = brentOptimizer0.getStartValue();
        double double10 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setMaxEvaluations((int) '#');
        int int13 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (short) 0);
        brentOptimizer0.resetMaximalIterationCount();
        double double12 = brentOptimizer0.getFunctionValue();
        org.apache.commons.math.optimization.GoalType goalType13 = brentOptimizer0.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType14 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(goalType13);
        org.junit.Assert.assertNull(goalType14);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        int int7 = brentOptimizer0.getEvaluations();
        double double8 = brentOptimizer0.getMin();
        double double9 = brentOptimizer0.getStartValue();
        brentOptimizer0.resetMaximalIterationCount();
        double double11 = brentOptimizer0.getMax();
        double double12 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getEvaluations();
        double double5 = brentOptimizer0.getMax();
        double double6 = brentOptimizer0.getMax();
        double double7 = brentOptimizer0.getFunctionValue();
        double double8 = brentOptimizer0.getFunctionValue();
        double double9 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.resetMaximalIterationCount();
        int int7 = brentOptimizer0.getMaxEvaluations();
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        int int7 = brentOptimizer0.getEvaluations();
        int int8 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setRelativeAccuracy(0.0d);
        org.apache.commons.math.optimization.GoalType goalType11 = brentOptimizer0.getGoalType();
        double double12 = brentOptimizer0.getAbsoluteAccuracy();
        double double13 = brentOptimizer0.getStartValue();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int15 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetRelativeAccuracy();
        double double17 = brentOptimizer0.getFunctionValue();
        int int18 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-10d + "'", double12 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        double double5 = brentOptimizer0.getStartValue();
        brentOptimizer0.setAbsoluteAccuracy((double) (byte) 0);
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        double double6 = brentOptimizer0.getAbsoluteAccuracy();
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        org.apache.commons.math.optimization.GoalType goalType8 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-10d + "'", double6 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType8);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setRelativeAccuracy((double) (byte) 100);
        brentOptimizer0.setRelativeAccuracy(10.0d);
        org.apache.commons.math.optimization.GoalType goalType12 = brentOptimizer0.getGoalType();
        int int13 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setRelativeAccuracy((double) 'a');
        java.lang.Class<?> wildcardClass16 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getStartValue();
        int int7 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int9 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        double double12 = brentOptimizer0.getStartValue();
        double double13 = brentOptimizer0.getStartValue();
        int int14 = brentOptimizer0.getMaxEvaluations();
        int int15 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        int int7 = brentOptimizer0.getMaxEvaluations();
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        int int9 = brentOptimizer0.getIterationCount();
        double double10 = brentOptimizer0.getFunctionValue();
        double double11 = brentOptimizer0.getMax();
        int int12 = brentOptimizer0.getMaxEvaluations();
        double double13 = brentOptimizer0.getStartValue();
        int int14 = brentOptimizer0.getIterationCount();
        double double15 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(10);
        int int6 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (short) 100);
        int int9 = brentOptimizer0.getEvaluations();
        int int10 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        int int5 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) (byte) 1);
        double double8 = brentOptimizer0.getMax();
        brentOptimizer0.setMaxEvaluations((-1));
        double double11 = brentOptimizer0.getFunctionValue();
        double double12 = brentOptimizer0.getFunctionValue();
        org.apache.commons.math.optimization.GoalType goalType13 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(goalType13);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int7 = brentOptimizer0.getIterationCount();
        int int8 = brentOptimizer0.getIterationCount();
        int int9 = brentOptimizer0.getMaxEvaluations();
        double double10 = brentOptimizer0.getStartValue();
        brentOptimizer0.resetRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType10 = brentOptimizer0.getGoalType();
        double double11 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.resetMaximalIterationCount();
        double double13 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-14d + "'", double13 == 1.0E-14d);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetMaximalIterationCount();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setMaximalIterationCount(0);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = brentOptimizer0.getResult();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math.exception.NoDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy((double) (-1L));
        double double9 = brentOptimizer0.getRelativeAccuracy();
        double double10 = brentOptimizer0.getStartValue();
        int int11 = brentOptimizer0.getIterationCount();
        int int12 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setRelativeAccuracy(52.0d);
        double double15 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-10d + "'", double15 == 1.0E-10d);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount(2147483647);
        brentOptimizer0.setMaximalIterationCount(0);
        double double7 = brentOptimizer0.getMax();
        brentOptimizer0.setRelativeAccuracy((double) (byte) 1);
        double double10 = brentOptimizer0.getFunctionValue();
        double double11 = brentOptimizer0.getMax();
        brentOptimizer0.setRelativeAccuracy((double) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '#');
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getStartValue();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy((double) (-1L));
        double double9 = brentOptimizer0.getRelativeAccuracy();
        double double10 = brentOptimizer0.getStartValue();
        int int11 = brentOptimizer0.getIterationCount();
        int int12 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setMaxEvaluations((int) (short) 0);
        double double15 = brentOptimizer0.getMin();
        double double16 = brentOptimizer0.getFunctionValue();
        double double17 = brentOptimizer0.getStartValue();
        int int18 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations((int) (byte) 100);
        double double8 = brentOptimizer0.getMax();
        brentOptimizer0.setRelativeAccuracy((double) 97);
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 1);
        brentOptimizer0.setMaxEvaluations((int) (short) 100);
        brentOptimizer0.setMaximalIterationCount(0);
        double double13 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        double double6 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        int int4 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) (short) 10);
        double double7 = brentOptimizer0.getFunctionValue();
        double double8 = brentOptimizer0.getRelativeAccuracy();
        int int9 = brentOptimizer0.getIterationCount();
        int int10 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        double double2 = brentOptimizer0.getRelativeAccuracy();
        double double3 = brentOptimizer0.getStartValue();
        brentOptimizer0.resetRelativeAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-14d + "'", double2 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        int int6 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetRelativeAccuracy();
        int int8 = brentOptimizer0.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        int int7 = brentOptimizer0.getMaxEvaluations();
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction10 = null;
        org.apache.commons.math.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = brentOptimizer0.optimize(univariateRealFunction10, goalType11, (double) 97, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) (-1.0f));
        brentOptimizer0.setMaxEvaluations((-1));
        double double13 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations((int) (byte) 100);
        double double8 = brentOptimizer0.getMax();
        int int9 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetRelativeAccuracy();
        double double11 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount(2147483647);
        brentOptimizer0.setMaximalIterationCount(0);
        double double7 = brentOptimizer0.getMax();
        brentOptimizer0.setRelativeAccuracy((double) (byte) 1);
        int int10 = brentOptimizer0.getEvaluations();
        double double11 = brentOptimizer0.getMax();
        double double12 = brentOptimizer0.getMax();
        double double13 = brentOptimizer0.getStartValue();
        int int14 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        brentOptimizer0.setRelativeAccuracy((double) 10.0f);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setAbsoluteAccuracy(0.0d);
        brentOptimizer0.setMaximalIterationCount(0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setAbsoluteAccuracy((double) 0.0f);
        double double8 = brentOptimizer0.getMin();
        double double9 = brentOptimizer0.getRelativeAccuracy();
        double double10 = brentOptimizer0.getFunctionValue();
        double double11 = brentOptimizer0.getStartValue();
        double double12 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double9 = brentOptimizer0.getMin();
        java.lang.Class<?> wildcardClass10 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        int int10 = brentOptimizer0.getMaxEvaluations();
        double double11 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) 10L);
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) 0);
        int int6 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = brentOptimizer0.getGoalType();
        int int5 = brentOptimizer0.getEvaluations();
        double double6 = brentOptimizer0.getMax();
        double double7 = brentOptimizer0.getMin();
        double double8 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = brentOptimizer0.optimize(univariateRealFunction9, goalType10, (double) 100L, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        double double6 = brentOptimizer0.getMax();
        brentOptimizer0.setAbsoluteAccuracy((double) 2147483647);
        double double9 = brentOptimizer0.getMax();
        double double10 = brentOptimizer0.getRelativeAccuracy();
        double double11 = brentOptimizer0.getMin();
        org.apache.commons.math.optimization.GoalType goalType12 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(goalType12);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount(2147483647);
        brentOptimizer0.setAbsoluteAccuracy(1.0d);
        int int7 = brentOptimizer0.getIterationCount();
        double double8 = brentOptimizer0.getRelativeAccuracy();
        double double9 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaxEvaluations(1);
        brentOptimizer0.setAbsoluteAccuracy(1.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        int int4 = brentOptimizer0.getMaximalIterationCount();
        int int5 = brentOptimizer0.getIterationCount();
        double double6 = brentOptimizer0.getMax();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        int int8 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setRelativeAccuracy((double) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getEvaluations();
        double double5 = brentOptimizer0.getMax();
        double double6 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy(2.147483647E9d);
        double double9 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-10d + "'", double6 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double9 = brentOptimizer0.getMin();
        brentOptimizer0.setRelativeAccuracy((double) 52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getFunctionValue();
        double double6 = brentOptimizer0.getAbsoluteAccuracy();
        double double7 = brentOptimizer0.getStartValue();
        double double8 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-10d + "'", double6 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(10);
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.setRelativeAccuracy((double) 97);
        double double10 = brentOptimizer0.getAbsoluteAccuracy();
        double double11 = brentOptimizer0.getMax();
        int int12 = brentOptimizer0.getMaxEvaluations();
        int int13 = brentOptimizer0.getEvaluations();
        double double14 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-10d + "'", double10 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations((int) (byte) 100);
        double double8 = brentOptimizer0.getMax();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations((int) (short) 10);
        brentOptimizer0.setAbsoluteAccuracy(1.0E-10d);
        int int14 = brentOptimizer0.getMaximalIterationCount();
        double double15 = brentOptimizer0.getMin();
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((-1));
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 10L);
        double double10 = brentOptimizer0.getFunctionValue();
        double double11 = brentOptimizer0.getRelativeAccuracy();
        double double12 = brentOptimizer0.getFunctionValue();
        double double13 = brentOptimizer0.getMin();
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType10 = brentOptimizer0.getGoalType();
        double double11 = brentOptimizer0.getMin();
        int int12 = brentOptimizer0.getEvaluations();
        double double13 = brentOptimizer0.getMax();
        double double14 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double16 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setMaxEvaluations((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        int int6 = brentOptimizer0.getMaximalIterationCount();
        double double7 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((int) (byte) 1);
        int int10 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetMaximalIterationCount();
        double double12 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        double double6 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setAbsoluteAccuracy(1.0E-14d);
        brentOptimizer0.setMaxEvaluations(10);
        brentOptimizer0.setMaxEvaluations(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getStartValue();
        int int7 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int9 = brentOptimizer0.getMaxEvaluations();
        double double10 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setMaximalIterationCount(97);
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 1);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(10);
        brentOptimizer0.resetRelativeAccuracy();
        int int7 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setRelativeAccuracy((double) 100.0f);
        int int10 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations((int) (byte) 100);
        double double8 = brentOptimizer0.getMax();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations((int) (short) 10);
        int int12 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setAbsoluteAccuracy(1.0E-14d);
        double double15 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        brentOptimizer0.setRelativeAccuracy((double) 10.0f);
        double double7 = brentOptimizer0.getMin();
        int int8 = brentOptimizer0.getMaximalIterationCount();
        int int9 = brentOptimizer0.getEvaluations();
        double double10 = brentOptimizer0.getMax();
        double double11 = brentOptimizer0.getStartValue();
        int int12 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = brentOptimizer0.getGoalType();
        int int5 = brentOptimizer0.getEvaluations();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) 0.0f);
        brentOptimizer0.setAbsoluteAccuracy((-1.0d));
        brentOptimizer0.resetMaximalIterationCount();
        int int12 = brentOptimizer0.getIterationCount();
        org.apache.commons.math.optimization.GoalType goalType13 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(goalType13);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaxEvaluations((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        int int6 = brentOptimizer0.getMaximalIterationCount();
        double double7 = brentOptimizer0.getMin();
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetMaximalIterationCount();
        double double11 = brentOptimizer0.getStartValue();
        double double12 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) '#');
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy((double) (-1L));
        double double9 = brentOptimizer0.getRelativeAccuracy();
        double double10 = brentOptimizer0.getStartValue();
        int int11 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType14 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(goalType14);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        int int4 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) (short) 10);
        double double7 = brentOptimizer0.getFunctionValue();
        double double8 = brentOptimizer0.getRelativeAccuracy();
        double double9 = brentOptimizer0.getRelativeAccuracy();
        java.lang.Class<?> wildcardClass10 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int11 = brentOptimizer0.getMaximalIterationCount();
        int int12 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetMaximalIterationCount();
        double double14 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((-1));
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double9 = brentOptimizer0.getAbsoluteAccuracy();
        int int10 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        double double4 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setRelativeAccuracy((double) 10.0f);
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setRelativeAccuracy(2.147483647E9d);
        java.lang.Class<?> wildcardClass10 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getEvaluations();
        double double6 = brentOptimizer0.getAbsoluteAccuracy();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.setRelativeAccuracy((double) 1.0f);
        brentOptimizer0.setAbsoluteAccuracy((double) 1);
        org.apache.commons.math.optimization.GoalType goalType12 = brentOptimizer0.getGoalType();
        double double13 = brentOptimizer0.getStartValue();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction14 = null;
        org.apache.commons.math.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = brentOptimizer0.optimize(univariateRealFunction14, goalType15, 97.0d, 0.0d, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-10d + "'", double6 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getMaxEvaluations();
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        int int9 = brentOptimizer0.getEvaluations();
        double double10 = brentOptimizer0.getMax();
        org.apache.commons.math.optimization.GoalType goalType11 = brentOptimizer0.getGoalType();
        int int12 = brentOptimizer0.getIterationCount();
        int int13 = brentOptimizer0.getEvaluations();
        double double14 = brentOptimizer0.getRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentOptimizer0.getResult();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math.exception.NoDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-14d + "'", double14 == 1.0E-14d);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '#');
        double double4 = brentOptimizer0.getStartValue();
        brentOptimizer0.resetRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType6 = brentOptimizer0.getGoalType();
        double double7 = brentOptimizer0.getMax();
        brentOptimizer0.setMaxEvaluations(0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = brentOptimizer0.getGoalType();
        int int5 = brentOptimizer0.getEvaluations();
        int int6 = brentOptimizer0.getMaximalIterationCount();
        double double7 = brentOptimizer0.getRelativeAccuracy();
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = brentOptimizer0.optimize(univariateRealFunction9, goalType10, (double) (-1), (double) (-1L), (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 10);
        brentOptimizer0.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = brentOptimizer0.optimize(univariateRealFunction6, goalType7, 97.0d, (double) 2147483647, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: maximal number of evaluations (0) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-10d + "'", double1 == 1.0E-10d);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        int int5 = brentOptimizer0.getIterationCount();
        double double6 = brentOptimizer0.getMin();
        java.lang.Class<?> wildcardClass7 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount(52);
        brentOptimizer0.setAbsoluteAccuracy((double) 10);
        double double11 = brentOptimizer0.getStartValue();
        int int12 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        double double6 = brentOptimizer0.getMax();
        brentOptimizer0.setAbsoluteAccuracy((double) 2147483647);
        brentOptimizer0.setAbsoluteAccuracy((double) (-1));
        brentOptimizer0.setMaximalIterationCount(1);
        brentOptimizer0.setMaximalIterationCount(100);
        brentOptimizer0.resetRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = brentOptimizer0.getResult();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math.exception.NoDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double10 = brentOptimizer0.getMax();
        int int11 = brentOptimizer0.getMaxEvaluations();
        double double12 = brentOptimizer0.getStartValue();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getFunctionValue();
        int int6 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        brentOptimizer0.setRelativeAccuracy((double) 10.0f);
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType8 = brentOptimizer0.getGoalType();
        int int9 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        double double7 = brentOptimizer0.getMin();
        double double8 = brentOptimizer0.getFunctionValue();
        int int9 = brentOptimizer0.getMaximalIterationCount();
        double double10 = brentOptimizer0.getAbsoluteAccuracy();
        int int11 = brentOptimizer0.getIterationCount();
        int int12 = brentOptimizer0.getMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-10d + "'", double10 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getStartValue();
        int int7 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int9 = brentOptimizer0.getMaxEvaluations();
        double double10 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setMaximalIterationCount(97);
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 1);
        brentOptimizer0.setMaximalIterationCount((-1));
        // The following exception was thrown during execution in test generation
        try {
            double double17 = brentOptimizer0.getResult();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math.exception.NoDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getMaxEvaluations();
        double double7 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setMaximalIterationCount((int) (short) 0);
        double double10 = brentOptimizer0.getStartValue();
        double double11 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double13 = brentOptimizer0.getMax();
        org.apache.commons.math.optimization.GoalType goalType14 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double16 = brentOptimizer0.getMin();
        double double17 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-10d + "'", double11 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(goalType14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setAbsoluteAccuracy((double) 0.0f);
        double double8 = brentOptimizer0.getMax();
        brentOptimizer0.setMaximalIterationCount(100);
        brentOptimizer0.setRelativeAccuracy((-1.0d));
        org.apache.commons.math.optimization.GoalType goalType13 = brentOptimizer0.getGoalType();
        brentOptimizer0.setRelativeAccuracy((double) 2147483647);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(goalType13);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        brentOptimizer0.setRelativeAccuracy((double) 1);
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        double double8 = brentOptimizer0.getMax();
        int int9 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setRelativeAccuracy((double) 1L);
        brentOptimizer0.resetAbsoluteAccuracy();
        double double10 = brentOptimizer0.getMax();
        double double11 = brentOptimizer0.getFunctionValue();
        int int12 = brentOptimizer0.getMaximalIterationCount();
        int int13 = brentOptimizer0.getMaximalIterationCount();
        double double14 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        int int4 = brentOptimizer0.getIterationCount();
        int int5 = brentOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType6 = brentOptimizer0.getGoalType();
        int int7 = brentOptimizer0.getEvaluations();
        double double8 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        double double5 = brentOptimizer0.getStartValue();
        java.lang.Class<?> wildcardClass6 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int7 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setAbsoluteAccuracy((double) 0.0f);
        brentOptimizer0.resetRelativeAccuracy();
        double double9 = brentOptimizer0.getMax();
        double double10 = brentOptimizer0.getFunctionValue();
        int int11 = brentOptimizer0.getMaxEvaluations();
        java.lang.Class<?> wildcardClass12 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        double double7 = brentOptimizer0.getFunctionValue();
        int int8 = brentOptimizer0.getEvaluations();
        int int9 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int11 = brentOptimizer0.getIterationCount();
        double double12 = brentOptimizer0.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction13 = null;
        org.apache.commons.math.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = brentOptimizer0.optimize(univariateRealFunction13, goalType14, (double) 100.0f, (double) 0.0f, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setAbsoluteAccuracy((double) 0.0f);
        brentOptimizer0.resetRelativeAccuracy();
        double double9 = brentOptimizer0.getMax();
        double double10 = brentOptimizer0.getMin();
        int int11 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) 'a');
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        int int7 = brentOptimizer0.getMaxEvaluations();
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        int int9 = brentOptimizer0.getIterationCount();
        double double10 = brentOptimizer0.getFunctionValue();
        double double11 = brentOptimizer0.getStartValue();
        int int12 = brentOptimizer0.getMaxEvaluations();
        double double13 = brentOptimizer0.getMax();
        double double14 = brentOptimizer0.getAbsoluteAccuracy();
        double double15 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-10d + "'", double14 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-10d + "'", double15 == 1.0E-10d);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int7 = brentOptimizer0.getIterationCount();
        int int8 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setRelativeAccuracy(100.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) 10L);
        double double7 = brentOptimizer0.getMax();
        double double8 = brentOptimizer0.getMax();
        double double9 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        int int5 = brentOptimizer0.getIterationCount();
        int int6 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setRelativeAccuracy((double) 97);
        brentOptimizer0.setMaximalIterationCount(0);
        int int11 = brentOptimizer0.getIterationCount();
        int int12 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetRelativeAccuracy();
        double double7 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy(52.0d);
        double double11 = brentOptimizer0.getMin();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction12 = null;
        org.apache.commons.math.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = brentOptimizer0.optimize(univariateRealFunction12, goalType13, (double) 'a', 35.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '#');
        brentOptimizer0.setMaximalIterationCount(0);
        int int6 = brentOptimizer0.getIterationCount();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.setRelativeAccuracy((double) (-1));
        brentOptimizer0.resetMaximalIterationCount();
        int int11 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction12 = null;
        org.apache.commons.math.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = brentOptimizer0.optimize(univariateRealFunction12, goalType13, (double) 2147483647, 1.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        int int5 = brentOptimizer0.getIterationCount();
        int int6 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setRelativeAccuracy((double) 97);
        brentOptimizer0.setMaximalIterationCount(0);
        int int11 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) (short) 10);
        double double14 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        int int4 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        double double6 = brentOptimizer0.getStartValue();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        double double6 = brentOptimizer0.getMax();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        org.apache.commons.math.optimization.GoalType goalType10 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertNull(goalType10);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double10 = brentOptimizer0.getAbsoluteAccuracy();
        double double11 = brentOptimizer0.getAbsoluteAccuracy();
        double double12 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setAbsoluteAccuracy((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setMaximalIterationCount(52);
        double double7 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        brentOptimizer0.setRelativeAccuracy((double) (byte) -1);
        brentOptimizer0.setMaxEvaluations(10);
        brentOptimizer0.setRelativeAccuracy((double) (-1L));
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType10 = brentOptimizer0.getGoalType();
        double double11 = brentOptimizer0.getMin();
        int int12 = brentOptimizer0.getEvaluations();
        double double13 = brentOptimizer0.getMax();
        double double14 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaxEvaluations(1);
        double double18 = brentOptimizer0.getAbsoluteAccuracy();
        int int19 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 1);
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = brentOptimizer0.getResult();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math.exception.NoDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType9);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getStartValue();
        int int7 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double9 = brentOptimizer0.getRelativeAccuracy();
        int int10 = brentOptimizer0.getMaximalIterationCount();
        double double11 = brentOptimizer0.getStartValue();
        double double12 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount(2147483647);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction10 = null;
        org.apache.commons.math.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentOptimizer0.optimize(univariateRealFunction10, goalType11, 32.0d, (double) (byte) 0, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        double double10 = brentOptimizer0.getRelativeAccuracy();
        int int11 = brentOptimizer0.getMaxEvaluations();
        int int12 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations(97);
        int int15 = brentOptimizer0.getIterationCount();
        java.lang.Class<?> wildcardClass16 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        int int7 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) 10L);
        double double10 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        brentOptimizer0.setRelativeAccuracy((double) 0.0f);
        brentOptimizer0.resetRelativeAccuracy();
        int int13 = brentOptimizer0.getMaximalIterationCount();
        int int14 = brentOptimizer0.getIterationCount();
        double double15 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetRelativeAccuracy();
        double double7 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy(52.0d);
        double double11 = brentOptimizer0.getMin();
        double double12 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (short) 0);
        double double11 = brentOptimizer0.getMax();
        double double12 = brentOptimizer0.getFunctionValue();
        double double13 = brentOptimizer0.getMax();
        brentOptimizer0.setAbsoluteAccuracy((double) 1);
        double double16 = brentOptimizer0.getMin();
        org.apache.commons.math.optimization.GoalType goalType17 = brentOptimizer0.getGoalType();
        double double18 = brentOptimizer0.getStartValue();
        double double19 = brentOptimizer0.getMax();
        int int20 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(goalType17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(10);
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) ' ');
        double double9 = brentOptimizer0.getFunctionValue();
        int int10 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy((double) 0.0f);
        brentOptimizer0.setMaximalIterationCount(1);
        int int11 = brentOptimizer0.getEvaluations();
        int int12 = brentOptimizer0.getMaximalIterationCount();
        int int13 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getStartValue();
        double double7 = brentOptimizer0.getStartValue();
        org.apache.commons.math.optimization.GoalType goalType8 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        double double4 = brentOptimizer0.getFunctionValue();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        org.apache.commons.math.optimization.GoalType goalType6 = brentOptimizer0.getGoalType();
        int int7 = brentOptimizer0.getMaxEvaluations();
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        double double9 = brentOptimizer0.getFunctionValue();
        double double10 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double3 = brentOptimizer0.getMin();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction4 = null;
        org.apache.commons.math.optimization.GoalType goalType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = brentOptimizer0.optimize(univariateRealFunction4, goalType5, (double) 1, 1.0d, (double) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setMaxEvaluations(97);
        brentOptimizer0.setMaxEvaluations((int) (short) -1);
        double double13 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setAbsoluteAccuracy((double) 0.0f);
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount(10);
        double double12 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) (byte) -1);
        brentOptimizer0.setAbsoluteAccuracy((double) 100L);
        brentOptimizer0.setMaxEvaluations((int) '4');
        int int13 = brentOptimizer0.getMaxEvaluations();
        double double14 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction15 = null;
        org.apache.commons.math.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double20 = brentOptimizer0.optimize(univariateRealFunction15, goalType16, (double) (-1), (double) 'a', (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-14d + "'", double14 == 1.0E-14d);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetRelativeAccuracy();
        int int7 = brentOptimizer0.getIterationCount();
        int int8 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        double double6 = brentOptimizer0.getMax();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        int int8 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getMaxEvaluations();
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        int int9 = brentOptimizer0.getEvaluations();
        double double10 = brentOptimizer0.getMax();
        org.apache.commons.math.optimization.GoalType goalType11 = brentOptimizer0.getGoalType();
        int int12 = brentOptimizer0.getIterationCount();
        double double13 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '#');
        double double4 = brentOptimizer0.getStartValue();
        brentOptimizer0.setAbsoluteAccuracy((double) (byte) 10);
        brentOptimizer0.setAbsoluteAccuracy((double) 35);
        brentOptimizer0.setMaximalIterationCount((int) (short) 100);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction11 = null;
        org.apache.commons.math.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentOptimizer0.optimize(univariateRealFunction11, goalType12, (double) 1L, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int7 = brentOptimizer0.getMaxEvaluations();
        int int8 = brentOptimizer0.getIterationCount();
        double double9 = brentOptimizer0.getAbsoluteAccuracy();
        double double10 = brentOptimizer0.getStartValue();
        int int11 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        double double14 = brentOptimizer0.getMax();
        int int15 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        double double10 = brentOptimizer0.getMax();
        int int11 = brentOptimizer0.getIterationCount();
        double double12 = brentOptimizer0.getFunctionValue();
        double double13 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-10d + "'", double13 == 1.0E-10d);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((-1));
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int9 = brentOptimizer0.getMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType10 = brentOptimizer0.getGoalType();
        int int11 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        brentOptimizer0.setRelativeAccuracy((double) 10.0f);
        double double7 = brentOptimizer0.getMin();
        int int8 = brentOptimizer0.getMaximalIterationCount();
        int int9 = brentOptimizer0.getEvaluations();
        double double10 = brentOptimizer0.getMax();
        double double11 = brentOptimizer0.getStartValue();
        int int12 = brentOptimizer0.getIterationCount();
        double double13 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setMaximalIterationCount(0);
        double double16 = brentOptimizer0.getFunctionValue();
        double double17 = brentOptimizer0.getMin();
        double double18 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        double double4 = brentOptimizer0.getStartValue();
        brentOptimizer0.setMaxEvaluations(97);
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) (byte) -1);
        brentOptimizer0.setAbsoluteAccuracy((double) 100L);
        brentOptimizer0.setAbsoluteAccuracy((double) 0);
        int int13 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setMaxEvaluations((int) (short) 0);
        double double16 = brentOptimizer0.getStartValue();
        double double17 = brentOptimizer0.getFunctionValue();
        double double18 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        int int7 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) 0.0f);
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy(0.0d);
        org.apache.commons.math.optimization.GoalType goalType10 = brentOptimizer0.getGoalType();
        int int11 = brentOptimizer0.getMaximalIterationCount();
        double double12 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType5 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetRelativeAccuracy();
        int int7 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetRelativeAccuracy();
        double double7 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaxEvaluations((int) '#');
        double double10 = brentOptimizer0.getMax();
        org.apache.commons.math.optimization.GoalType goalType11 = brentOptimizer0.getGoalType();
        int int12 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        double double14 = brentOptimizer0.getStartValue();
        double double15 = brentOptimizer0.getRelativeAccuracy();
        double double16 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        int int2 = brentOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType3 = brentOptimizer0.getGoalType();
        double double4 = brentOptimizer0.getStartValue();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNull(goalType3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-10d + "'", double6 == 1.0E-10d);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 0);
        brentOptimizer0.setMaximalIterationCount((int) (byte) 0);
        int int9 = brentOptimizer0.getMaximalIterationCount();
        double double10 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(10);
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.setRelativeAccuracy((double) 97);
        double double10 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) 35);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = brentOptimizer0.getResult();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math.exception.NoDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-10d + "'", double10 == 1.0E-10d);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        int int7 = brentOptimizer0.getEvaluations();
        int int8 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setRelativeAccuracy(0.0d);
        org.apache.commons.math.optimization.GoalType goalType11 = brentOptimizer0.getGoalType();
        double double12 = brentOptimizer0.getAbsoluteAccuracy();
        double double13 = brentOptimizer0.getStartValue();
        int int14 = brentOptimizer0.getIterationCount();
        int int15 = brentOptimizer0.getEvaluations();
        double double16 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-10d + "'", double12 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        double double6 = brentOptimizer0.getMax();
        brentOptimizer0.resetRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType8 = brentOptimizer0.getGoalType();
        int int9 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        java.lang.Class<?> wildcardClass11 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int7 = brentOptimizer0.getIterationCount();
        int int8 = brentOptimizer0.getIterationCount();
        int int9 = brentOptimizer0.getMaxEvaluations();
        double double10 = brentOptimizer0.getStartValue();
        double double11 = brentOptimizer0.getFunctionValue();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction12 = null;
        org.apache.commons.math.optimization.GoalType goalType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = brentOptimizer0.optimize(univariateRealFunction12, goalType13, (double) (-1), (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations((int) (byte) 100);
        brentOptimizer0.resetMaximalIterationCount();
        double double9 = brentOptimizer0.getStartValue();
        double double10 = brentOptimizer0.getMin();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int12 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setMaximalIterationCount(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getEvaluations();
        double double6 = brentOptimizer0.getAbsoluteAccuracy();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        int int8 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-10d + "'", double6 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) 10L);
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        int int8 = brentOptimizer0.getEvaluations();
        double double9 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getEvaluations();
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) (-1L));
        org.apache.commons.math.optimization.GoalType goalType11 = brentOptimizer0.getGoalType();
        int int12 = brentOptimizer0.getMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction13 = null;
        org.apache.commons.math.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = brentOptimizer0.optimize(univariateRealFunction13, goalType14, (double) 100, 2.147483647E9d, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: -1 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        double double10 = brentOptimizer0.getStartValue();
        brentOptimizer0.setMaximalIterationCount((int) (short) 10);
        int int13 = brentOptimizer0.getIterationCount();
        double double14 = brentOptimizer0.getStartValue();
        double double15 = brentOptimizer0.getMax();
        brentOptimizer0.setMaxEvaluations(2147483647);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int7 = brentOptimizer0.getMaxEvaluations();
        int int8 = brentOptimizer0.getIterationCount();
        double double9 = brentOptimizer0.getFunctionValue();
        int int10 = brentOptimizer0.getMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setAbsoluteAccuracy(10.0d);
        brentOptimizer0.resetMaximalIterationCount();
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setRelativeAccuracy((double) (byte) 100);
        brentOptimizer0.setRelativeAccuracy(10.0d);
        org.apache.commons.math.optimization.GoalType goalType12 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType14 = brentOptimizer0.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType15 = brentOptimizer0.getGoalType();
        int int16 = brentOptimizer0.getMaximalIterationCount();
        double double17 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertNull(goalType14);
        org.junit.Assert.assertNull(goalType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        int int6 = brentOptimizer0.getMaximalIterationCount();
        double double7 = brentOptimizer0.getMin();
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetMaximalIterationCount();
        int int11 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(2147483647);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = brentOptimizer0.getResult();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math.exception.NoDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setAbsoluteAccuracy((double) 0.0f);
        double double8 = brentOptimizer0.getMin();
        double double9 = brentOptimizer0.getRelativeAccuracy();
        double double10 = brentOptimizer0.getFunctionValue();
        double double11 = brentOptimizer0.getStartValue();
        int int12 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setAbsoluteAccuracy((double) 0L);
        int int15 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setAbsoluteAccuracy((double) 0.0f);
        double double8 = brentOptimizer0.getMax();
        double double9 = brentOptimizer0.getStartValue();
        double double10 = brentOptimizer0.getFunctionValue();
        org.apache.commons.math.optimization.GoalType goalType11 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 100);
        double double14 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaxEvaluations((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(goalType11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount(2147483647);
        brentOptimizer0.setAbsoluteAccuracy(1.0d);
        int int7 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 100);
        brentOptimizer0.resetMaximalIterationCount();
        double double11 = brentOptimizer0.getAbsoluteAccuracy();
        org.apache.commons.math.optimization.GoalType goalType12 = brentOptimizer0.getGoalType();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNull(goalType12);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getMax();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        double double6 = brentOptimizer0.getMax();
        brentOptimizer0.resetRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType8 = brentOptimizer0.getGoalType();
        double double9 = brentOptimizer0.getFunctionValue();
        double double10 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = brentOptimizer0.getGoalType();
        int int5 = brentOptimizer0.getEvaluations();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) 0.0f);
        double double9 = brentOptimizer0.getRelativeAccuracy();
        double double10 = brentOptimizer0.getStartValue();
        brentOptimizer0.resetMaximalIterationCount();
        int int12 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        double double10 = brentOptimizer0.getStartValue();
        int int11 = brentOptimizer0.getIterationCount();
        double double12 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(10);
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 100);
        int int10 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setMaxEvaluations(1);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = brentOptimizer0.getResult();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math.exception.NoDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        brentOptimizer0.setRelativeAccuracy(10.0d);
        brentOptimizer0.resetRelativeAccuracy();
        double double13 = brentOptimizer0.getFunctionValue();
        double double14 = brentOptimizer0.getStartValue();
        int int15 = brentOptimizer0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((int) 'a');
        brentOptimizer0.setRelativeAccuracy((double) '4');
        int int10 = brentOptimizer0.getIterationCount();
        int int11 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((-1));
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int9 = brentOptimizer0.getMaxEvaluations();
        int int10 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        int int7 = brentOptimizer0.getMaxEvaluations();
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount(10);
        double double11 = brentOptimizer0.getStartValue();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = brentOptimizer0.getResult();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math.exception.NoDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy(0.0d);
        double double10 = brentOptimizer0.getAbsoluteAccuracy();
        int int11 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-10d + "'", double10 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 0L);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy((double) (-1L));
        double double9 = brentOptimizer0.getRelativeAccuracy();
        double double10 = brentOptimizer0.getStartValue();
        int int11 = brentOptimizer0.getIterationCount();
        int int12 = brentOptimizer0.getIterationCount();
        double double13 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        double double15 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) 100L);
        double double18 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-10d + "'", double15 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        double double7 = brentOptimizer0.getFunctionValue();
        int int8 = brentOptimizer0.getEvaluations();
        int int9 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int11 = brentOptimizer0.getIterationCount();
        int int12 = brentOptimizer0.getMaximalIterationCount();
        java.lang.Class<?> wildcardClass13 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 35);
        double double8 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (short) 0);
        double double11 = brentOptimizer0.getMax();
        double double12 = brentOptimizer0.getFunctionValue();
        double double13 = brentOptimizer0.getMax();
        brentOptimizer0.setAbsoluteAccuracy((double) 1);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction16 = null;
        org.apache.commons.math.optimization.GoalType goalType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double20 = brentOptimizer0.optimize(univariateRealFunction16, goalType17, 97.0d, (double) 2147483647);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setMaximalIterationCount((-1));
        brentOptimizer0.setMaxEvaluations((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        brentOptimizer0.resetMaximalIterationCount();
        double double11 = brentOptimizer0.getMax();
        brentOptimizer0.resetMaximalIterationCount();
        double double13 = brentOptimizer0.getFunctionValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy((double) 1L);
        brentOptimizer0.resetMaximalIterationCount();
        int int8 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setAbsoluteAccuracy((double) 0.0f);
        brentOptimizer0.resetRelativeAccuracy();
        double double9 = brentOptimizer0.getMax();
        double double10 = brentOptimizer0.getMin();
        double double11 = brentOptimizer0.getMin();
        brentOptimizer0.resetAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction13 = null;
        org.apache.commons.math.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = brentOptimizer0.optimize(univariateRealFunction13, goalType14, 0.0d, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        double double7 = brentOptimizer0.getFunctionValue();
        int int8 = brentOptimizer0.getEvaluations();
        double double9 = brentOptimizer0.getMin();
        int int10 = brentOptimizer0.getIterationCount();
        double double11 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        double double2 = brentOptimizer0.getRelativeAccuracy();
        double double3 = brentOptimizer0.getMin();
        brentOptimizer0.setRelativeAccuracy((double) 0.0f);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = brentOptimizer0.optimize(univariateRealFunction6, goalType7, 32.0d, (double) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-14d + "'", double2 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        double double5 = brentOptimizer0.getMin();
        brentOptimizer0.setAbsoluteAccuracy((double) 0.0f);
        brentOptimizer0.resetRelativeAccuracy();
        double double9 = brentOptimizer0.getMax();
        double double10 = brentOptimizer0.getMin();
        int int11 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetMaximalIterationCount();
        int int13 = brentOptimizer0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 100.0f);
        double double8 = brentOptimizer0.getStartValue();
        brentOptimizer0.setMaxEvaluations((-1));
        int int11 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetMaximalIterationCount();
        double double13 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-10d + "'", double13 == 1.0E-10d);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        int int6 = brentOptimizer0.getMaximalIterationCount();
        double double7 = brentOptimizer0.getMin();
        brentOptimizer0.resetRelativeAccuracy();
        double double9 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double11 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setAbsoluteAccuracy((double) (byte) 100);
        double double14 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) 100.0f);
        double double8 = brentOptimizer0.getStartValue();
        int int9 = brentOptimizer0.getMaximalIterationCount();
        double double10 = brentOptimizer0.getAbsoluteAccuracy();
        double double11 = brentOptimizer0.getMin();
        int int12 = brentOptimizer0.getEvaluations();
        double double13 = brentOptimizer0.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-10d + "'", double10 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-10d + "'", double13 == 1.0E-10d);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        brentOptimizer0.setAbsoluteAccuracy(100.0d);
        brentOptimizer0.setAbsoluteAccuracy(10.0d);
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getMaxEvaluations();
        double double7 = brentOptimizer0.getStartValue();
        brentOptimizer0.setAbsoluteAccuracy((double) 0L);
        brentOptimizer0.setMaximalIterationCount((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        int int5 = brentOptimizer0.getIterationCount();
        int int6 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setRelativeAccuracy((double) 97);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        double double6 = brentOptimizer0.getMax();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        int int8 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetRelativeAccuracy();
        int int10 = brentOptimizer0.getIterationCount();
        double double11 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '#');
        brentOptimizer0.setMaximalIterationCount(0);
        int int6 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setRelativeAccuracy((double) (short) 1);
        double double9 = brentOptimizer0.getStartValue();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction10 = null;
        org.apache.commons.math.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = brentOptimizer0.optimize(univariateRealFunction10, goalType11, (double) (-1), 2.147483647E9d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations((int) (byte) 100);
        double double8 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaxEvaluations((int) (short) 1);
        int int11 = brentOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.GoalType goalType12 = brentOptimizer0.getGoalType();
        brentOptimizer0.setAbsoluteAccuracy((double) 100L);
        int int15 = brentOptimizer0.getMaxEvaluations();
        int int16 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-10d + "'", double8 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(goalType12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 1);
        brentOptimizer0.setAbsoluteAccuracy((double) '#');
        double double11 = brentOptimizer0.getMax();
        double double12 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 1);
        int int15 = brentOptimizer0.getIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(10);
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.setRelativeAccuracy((double) 97);
        double double10 = brentOptimizer0.getAbsoluteAccuracy();
        int int11 = brentOptimizer0.getMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-10d + "'", double10 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int7 = brentOptimizer0.getIterationCount();
        org.apache.commons.math.optimization.GoalType goalType8 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double10 = brentOptimizer0.getFunctionValue();
        double double11 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(goalType8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType2 = brentOptimizer0.getGoalType();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        int int5 = brentOptimizer0.getIterationCount();
        int int6 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setRelativeAccuracy((double) 97);
        double double9 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-10d + "'", double9 == 1.0E-10d);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaximalIterationCount((int) 'a');
        int int7 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) 10L);
        double double10 = brentOptimizer0.getFunctionValue();
        double double11 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (byte) 10);
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setMaxEvaluations((int) (short) 10);
        int int9 = brentOptimizer0.getIterationCount();
        double double10 = brentOptimizer0.getMax();
        brentOptimizer0.setAbsoluteAccuracy((-1.0d));
        double double13 = brentOptimizer0.getMin();
        brentOptimizer0.setAbsoluteAccuracy((double) 1.0f);
        brentOptimizer0.setRelativeAccuracy(10.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(10);
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 100);
        brentOptimizer0.setMaximalIterationCount((int) (byte) -1);
        int int12 = brentOptimizer0.getMaxEvaluations();
        double double13 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaxEvaluations(35);
        brentOptimizer0.setRelativeAccuracy((double) (short) 100);
        int int18 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        int int8 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaximalIterationCount((int) (short) -1);
        org.apache.commons.math.optimization.GoalType goalType5 = brentOptimizer0.getGoalType();
        org.apache.commons.math.optimization.GoalType goalType6 = brentOptimizer0.getGoalType();
        double double7 = brentOptimizer0.getStartValue();
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNull(goalType5);
        org.junit.Assert.assertNull(goalType6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = brentOptimizer0.getGoalType();
        int int5 = brentOptimizer0.getEvaluations();
        int int6 = brentOptimizer0.getMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        int int8 = brentOptimizer0.getMaximalIterationCount();
        double double9 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        double double10 = brentOptimizer0.getStartValue();
        brentOptimizer0.setMaximalIterationCount((int) (short) 10);
        int int13 = brentOptimizer0.getIterationCount();
        double double14 = brentOptimizer0.getStartValue();
        double double15 = brentOptimizer0.getMax();
        brentOptimizer0.setRelativeAccuracy((double) 100L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '#');
        brentOptimizer0.setMaximalIterationCount(0);
        int int6 = brentOptimizer0.getIterationCount();
        brentOptimizer0.setRelativeAccuracy((double) (short) 1);
        brentOptimizer0.setMaximalIterationCount(35);
        double double11 = brentOptimizer0.getStartValue();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(10);
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        double double8 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        double double10 = brentOptimizer0.getRelativeAccuracy();
        int int11 = brentOptimizer0.getMaxEvaluations();
        int int12 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations(97);
        int int15 = brentOptimizer0.getIterationCount();
        double double16 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) (-1.0f));
        brentOptimizer0.setMaxEvaluations(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getStartValue();
        int int2 = brentOptimizer0.getIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        int int4 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setMaxEvaluations((int) (byte) 0);
        double double7 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '4');
        brentOptimizer0.setRelativeAccuracy((double) 0.0f);
        brentOptimizer0.resetRelativeAccuracy();
        double double13 = brentOptimizer0.getAbsoluteAccuracy();
        int int14 = brentOptimizer0.getEvaluations();
        double double15 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-10d + "'", double7 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-10d + "'", double13 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-10d + "'", double15 == 1.0E-10d);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getStartValue();
        int int7 = brentOptimizer0.getIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        int int9 = brentOptimizer0.getMaxEvaluations();
        double double10 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setMaximalIterationCount(97);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction13 = null;
        org.apache.commons.math.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = brentOptimizer0.optimize(univariateRealFunction13, goalType14, (double) (-1), 0.0d, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NotStrictlyPositiveException; message: 0 is smaller than, or equal to, the minimum (0)");
        } catch (org.apache.commons.math.exception.NotStrictlyPositiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy(1.0E-14d);
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction8 = null;
        org.apache.commons.math.optimization.GoalType goalType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = brentOptimizer0.optimize(univariateRealFunction8, goalType9, (double) (-1.0f), (double) '4', (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertNull(goalType7);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.setRelativeAccuracy((double) 1L);
        int int9 = brentOptimizer0.getIterationCount();
        double double10 = brentOptimizer0.getAbsoluteAccuracy();
        int int11 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setMaxEvaluations((int) '4');
        brentOptimizer0.setAbsoluteAccuracy(35.0d);
        java.lang.Class<?> wildcardClass16 = brentOptimizer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-10d + "'", double10 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        double double6 = brentOptimizer0.getMax();
        org.apache.commons.math.optimization.GoalType goalType7 = brentOptimizer0.getGoalType();
        int int8 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy((double) 2147483647);
        double double11 = brentOptimizer0.getMax();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy(1.0d);
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setRelativeAccuracy((double) 100L);
        brentOptimizer0.setMaxEvaluations(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(goalType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.setMaxEvaluations(10);
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        brentOptimizer0.setAbsoluteAccuracy((double) (short) 100);
        brentOptimizer0.setMaximalIterationCount((int) (byte) -1);
        int int12 = brentOptimizer0.getEvaluations();
        int int13 = brentOptimizer0.getEvaluations();
        double double14 = brentOptimizer0.getMax();
        double double15 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) 10L);
        double double7 = brentOptimizer0.getMax();
        int int8 = brentOptimizer0.getMaxEvaluations();
        int int9 = brentOptimizer0.getMaximalIterationCount();
        int int10 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) 10);
        int int14 = brentOptimizer0.getIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentOptimizer0.doOptimize();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        int int6 = brentOptimizer0.getMaximalIterationCount();
        double double7 = brentOptimizer0.getMin();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) (-1.0f));
        brentOptimizer0.resetAbsoluteAccuracy();
        double double12 = brentOptimizer0.getMin();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        brentOptimizer0.setAbsoluteAccuracy((double) 10L);
        double double7 = brentOptimizer0.getMax();
        int int8 = brentOptimizer0.getMaxEvaluations();
        int int9 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetAbsoluteAccuracy();
        double double11 = brentOptimizer0.getMax();
        double double12 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.GoalType goalType4 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetRelativeAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        double double7 = brentOptimizer0.getFunctionValue();
        brentOptimizer0.setMaximalIterationCount(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(goalType4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getMaxEvaluations();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) (short) 0);
        double double11 = brentOptimizer0.getMax();
        double double12 = brentOptimizer0.getFunctionValue();
        double double13 = brentOptimizer0.getMax();
        brentOptimizer0.setAbsoluteAccuracy((double) 1);
        double double16 = brentOptimizer0.getMin();
        org.apache.commons.math.optimization.GoalType goalType17 = brentOptimizer0.getGoalType();
        double double18 = brentOptimizer0.getStartValue();
        double double19 = brentOptimizer0.getMax();
        double double20 = brentOptimizer0.getMax();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(goalType17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getAbsoluteAccuracy();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        int int6 = brentOptimizer0.getEvaluations();
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetMaximalIterationCount();
        double double10 = brentOptimizer0.getStartValue();
        brentOptimizer0.setMaximalIterationCount((int) (short) 10);
        int int13 = brentOptimizer0.getIterationCount();
        double double14 = brentOptimizer0.getStartValue();
        double double15 = brentOptimizer0.getMax();
        double double16 = brentOptimizer0.getMin();
        brentOptimizer0.setMaximalIterationCount(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-10d + "'", double4 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        double double1 = brentOptimizer0.getRelativeAccuracy();
        brentOptimizer0.setMaximalIterationCount((int) '#');
        brentOptimizer0.setMaximalIterationCount(0);
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.resetAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = brentOptimizer0.getResult();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.exception.NoDataException; message: no data");
        } catch (org.apache.commons.math.exception.NoDataException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-14d + "'", double1 == 1.0E-14d);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        double double3 = brentOptimizer0.getAbsoluteAccuracy();
        double double4 = brentOptimizer0.getFunctionValue();
        double double5 = brentOptimizer0.getAbsoluteAccuracy();
        double double6 = brentOptimizer0.getMax();
        int int7 = brentOptimizer0.getEvaluations();
        brentOptimizer0.setMaximalIterationCount(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-10d + "'", double3 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-10d + "'", double5 == 1.0E-10d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        int int6 = brentOptimizer0.getMaximalIterationCount();
        double double7 = brentOptimizer0.getMin();
        brentOptimizer0.resetMaximalIterationCount();
        org.apache.commons.math.optimization.GoalType goalType9 = brentOptimizer0.getGoalType();
        brentOptimizer0.resetMaximalIterationCount();
        int int11 = brentOptimizer0.getMaximalIterationCount();
        brentOptimizer0.resetRelativeAccuracy();
        brentOptimizer0.resetRelativeAccuracy();
        double double14 = brentOptimizer0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(goalType9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-10d + "'", double14 == 1.0E-10d);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        org.apache.commons.math.optimization.univariate.BrentOptimizer brentOptimizer0 = new org.apache.commons.math.optimization.univariate.BrentOptimizer();
        int int1 = brentOptimizer0.getMaximalIterationCount();
        int int2 = brentOptimizer0.getMaximalIterationCount();
        int int3 = brentOptimizer0.getMaxEvaluations();
        int int4 = brentOptimizer0.getMaxEvaluations();
        int int5 = brentOptimizer0.getMaximalIterationCount();
        int int6 = brentOptimizer0.getMaximalIterationCount();
        double double7 = brentOptimizer0.getMin();
        brentOptimizer0.setMaxEvaluations((int) (byte) 1);
        brentOptimizer0.setMaximalIterationCount((int) (byte) 0);
        brentOptimizer0.resetAbsoluteAccuracy();
        brentOptimizer0.setRelativeAccuracy((double) (short) 0);
        double double15 = brentOptimizer0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }
}

